package edu.school21.chat.models;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCPostgreSQLExample {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/";
    static final String USER = "asmall";
    static final String PASS = "qwerty";

    public static void main(String[] argv) {

        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection(DB_URL, USER, PASS);
            System.out.println("PostgreSQL JDBC Driver successfully connected");

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}