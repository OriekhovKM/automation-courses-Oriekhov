package Infrastructure.data;

public interface UserDataMapper {
    User findUserByEmail(String email);
    User findUserByName(String name);
}
