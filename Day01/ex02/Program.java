package Day01.ex02;

public class Program {
    public static void main(String[] args) throws UserNotFoundException {

        User user1 = new User("name1", 100);
        User user2 = new User("name2", 200);
        User user3 = new User("name3", 200);
        User user4 = new User("name4", 400);

        UsersArrayList listUser = new UsersArrayList();
        listUser.addUser(user1);
        listUser.addUser(user2);
        listUser.addUser(user3);
        System.out.println("Number of users = " + listUser.retrieveNumberOfUsers());
        System.out.println("A user by index = " + listUser.retrieveUserByIndex(1));
        System.out.println("A user by index = " + listUser.retrieveUserByIndex(0));
        System.out.println("A user by ID = " + listUser.retrieveUserByID(1));
        System.out.println("NO user by id = " + listUser.retrieveUserByID(5));
    }
}