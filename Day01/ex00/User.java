package ex00;

public class User {
    private Integer id;
    private Integer balance;
    private String name;

    public User(String name, Integer balance, int id) {
        setName(name);
        setBalance(balance);
        this.id = id;
    }

    public Integer getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        if (balance > 0)
            this.balance = balance;
    }
}
