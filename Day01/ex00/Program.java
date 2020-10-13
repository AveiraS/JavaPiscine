package ex00;

public class Program {
    public static void main(String[] args) {
        User user1 = new User("name1", -100, 1);
        User user2 = new User("name2", 200, 2);
        User user3 = new User("name3", 300, 3);

        System.out.println(user1);
        //System.out.println("ID = " + user2.getID() + " Name = " + user2.getName() + " Balance = " + user2.getBalance());
    }
}
