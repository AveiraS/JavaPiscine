package Day01.ex00;

import java.util.UUID;

public class Transaction {
    private String uuid;
    private User recipient;
    private User sender;
    private String transferCategory;
    private Integer amount;

    public Transaction (User user1, User user2, String transferCategory, Integer amount){
        this.uuid = UUID.randomUUID().toString();
        this.recipient = user1;
        this.sender = user2;
        this.transferCategory = transferCategory;
        setAmount(transferCategory, amount);
    }

    public void setAmount(String transferCategory, Integer amount) {
        if (transferCategory.equals("debits") && amount > 0)
            this.amount = amount;
        else if (transferCategory.equals("credits") && amount < 0)
            this.amount = amount;
        else
            this.amount = 0;
    }

    public Integer getAmount() {
        return amount;
    }
}
