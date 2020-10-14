package ex02;

public class UsersArrayList implements UsersList {
    private User[] array = new User[10];
    private Integer pointer = 0;

    @Override
    public void addUser(User item) {
        if(pointer == array.length-1)
            newArraySize(array.length*2);
        array[pointer++] = item;
    }

    private void newArraySize(Integer newLength) {
        User[] newArray = new User[newLength];
        myArrayCopy(array, newArray, 0);
        array = newArray;
    }

    public static void myArrayCopy(User[] lastArray, User[] newArray, Integer i) {
        while (i < lastArray.length) {
            newArray[i] = lastArray[i];
            i++;
        }
    }

    @Override
    public Integer retrieveNumberOfUsers() {
        return pointer;
    }

    @Override
    public User retrieveUserByID (Integer id) throws UserNotFoundException {
        for (Integer i = 0; i < pointer; i++) {
            if (array[i].getID() == id)
                return (User) array[i];
        }
        throw new UserNotFoundException();
    }

    @Override
    public User retrieveUserByIndex(Integer index) {
        return (User) array[index];
    }
}
