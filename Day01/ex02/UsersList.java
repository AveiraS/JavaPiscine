package ex02;

public interface UsersList {
    public void addUser(User item);
    public User retrieveUserByID(int id) throws UserNotFoundException;
    public User retrieveUserByIndex(int index);
    public int retrieveNumberOfUsers();
}
