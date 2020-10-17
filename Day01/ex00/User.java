package Day01.ex00;

public class User {
    private static int count;
    private Integer id = count++;
    private Integer balance;
    private String name;

    public User(String name, Integer balance) {
        setName(name);
        setBalance(balance);
        this.id = setID();
    }
    public Integer setID() {
        this.id = id + 1;
        return id;}

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
