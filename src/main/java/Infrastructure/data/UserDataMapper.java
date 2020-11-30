package Infrastructure.data;

public interface UserDataMapper {
    User findUserByEmail(String email) throws UserNotFoundException;
    User findUserByName(String name) throws UserNotFoundException;
    User findUserByID(String id) throws UserNotFoundException;
}
