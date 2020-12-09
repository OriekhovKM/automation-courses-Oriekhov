package Infrastructure.data;

public class UserNotFoundException extends IllegalArgumentException{
    public UserNotFoundException(String s) {
        super(s);
    }
}
