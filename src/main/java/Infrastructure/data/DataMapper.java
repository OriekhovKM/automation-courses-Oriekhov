package Infrastructure.data;

public interface DataMapper {
    User findUserByEmail(String email);
    User findUserByName(String name);
}
