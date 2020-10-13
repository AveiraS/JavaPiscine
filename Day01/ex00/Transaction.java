package ex00;

public class Transaction {
    private String uuid;
    private User recipient;
    private User sender;
    private Integer amount;
    private String transferCategory;

    public Transaction (String uuid, User user1, User user2, String transferCategory, int amount){
        this.uuid = uuid;
        this.recipient = user1;
        this.sender = user2;
        this.transferCategory = transferCategory;
        this.amount = amount;
    }

    public void setAmount(User user, Integer amount) {
        if (user.getBalance()-amount > 0)
            this.amount = amount;
    }
}
