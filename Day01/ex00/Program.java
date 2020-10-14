package ex00;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("name1", -100);
        User user2 = new User("name2", 200);
        User user3 = new User("name3", 300);

        System.out.println("ID = " + user1.getID() + " Name = " + user1.getName() + " Balance = " + user1.getBalance());
        System.out.println("ID = " + user2.getID() + " Name = " + user2.getName() + " Balance = " + user2.getBalance());
        System.out.println("ID = " + user3.getID() + " Name = " + user3.getName() + " Balance = " + user3.getBalance());

        Transaction tr1 = new Transaction(user1, user2, "debits", -100);
        Transaction tr2 = new Transaction(user1, user2, "credits", -100);

        System.out.println("trans = " + tr1.getAmount());
        System.out.println("trans = " + tr2.getAmount());
    }
}
