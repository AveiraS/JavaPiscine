package ex02;

public class UserIdsGenerator {
    private static UserIdsGenerator instance;
    private Integer id;

    private UserIdsGenerator() {
        this.id = 0;
    }

    public static UserIdsGenerator getInstance() {
        if(instance == null){
            instance = new UserIdsGenerator();
        }
        return instance;
    }

    int generateId() {
        this.id = id + 1;
        return id;
    }
}