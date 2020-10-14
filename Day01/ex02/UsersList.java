package ex02;

public interface UsersList {
    public void addUser(User item);
    public User retrieveUserByID(Integer id) throws UserNotFoundException;
    public User retrieveUserByIndex(Integer index);
    public Integer retrieveNumberOfUsers();
}
