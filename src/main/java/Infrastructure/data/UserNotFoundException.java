package Infrastructure.data;

public class UserNotFoundException extends IllegalAccessException{
    public UserNotFoundException(String s) {
        super(s);
    }
}
