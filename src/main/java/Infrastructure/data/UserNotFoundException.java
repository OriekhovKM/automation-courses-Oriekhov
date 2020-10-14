package Infrastructure.data;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String message) {
        super(message);
    }

}
