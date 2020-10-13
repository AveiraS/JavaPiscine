package ex02;

public class UsersArrayList implements UsersList {
    private User[] array = new User[10];
    private int pointer = 0;

    @Override
    public void addUser(User item) {
        if(pointer == array.length-1)
            newArraySize(array.length*2);
        array[pointer++] = item;
    }

    private void newArraySize(int newLength) {
        User[] newArray = new User[newLength];
        myArrayCopy(array, newArray, 0);
        array = newArray;
    }

    public static void myArrayCopy(User[] lastArray, User[] newArray, int i) {
        while (i < lastArray.length) {
            newArray[i] = lastArray[i];
            i++;
        }
    }

    @Override
    public int retrieveNumberOfUsers() {
        return pointer;
    }

    public User retrieveUserByID (int id) throws UserNotFoundException {
        int i = 0;
        while (i < pointer) {
            if (array[i].getID() == id)
                return (User) array[i];
            i++;
        }
        if (i == pointer) {
            throw new UserNotFoundException();
        }
        return (null);
    }

    @Override
    public User retrieveUserByIndex(int index) {
        return (User) array[index];
    }
}
