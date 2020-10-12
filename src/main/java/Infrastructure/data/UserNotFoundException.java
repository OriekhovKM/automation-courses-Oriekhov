package Infrastructure.data;

public class UserNotFoundException extends Exception{
    public UserNotFoundException() {
        System.err.println("User not found");
    }

}
