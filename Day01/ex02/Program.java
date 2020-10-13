package ex02;

public class Program {
    public static void main(String[] args) throws UserNotFoundException {

        User user1 = new User("name1", 100);
        User user2 = new User("name2", 200);

        UsersArrayList listUser = new UsersArrayList();
        listUser.addUser(user1);
        listUser.addUser(user2);
        System.out.println(listUser.retrieveNumberOfUsers());
        System.out.println(listUser.retrieveUserByIndex(1));
        try {
            System.out.println(listUser.retrieveUserByID(2));
        } catch (UserNotFoundException ex) {
            System.out.println("UserNotFoundException");
        }
    }
}