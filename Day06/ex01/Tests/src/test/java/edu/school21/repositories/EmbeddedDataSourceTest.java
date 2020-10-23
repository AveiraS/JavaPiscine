package edu.school21.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;


import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmbeddedDataSourceTest {

    private static SimpleDriverDataSource simpleDriverDataSource;

    @BeforeEach
    void init() {
        simpleDriverDataSource = new SimpleDriverDataSource();
        simpleDriverDataSource.setDriverClass(org.hsqldb.jdbcDriver.class);
        simpleDriverDataSource.setUrl("jdbc:hsqldb:mem:app-db");
        simpleDriverDataSource.setUsername("asmall");
        simpleDriverDataSource.setPassword("");
    }

    @Test
    void getConnection() throws SQLException {
        assertNotNull(simpleDriverDataSource.getConnection());
    }
}
