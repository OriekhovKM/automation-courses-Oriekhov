package DataMapperTest;

import Infrastructure.data.User;
import Infrastructure.data.UserFileDataMapper;
import Infrastructure.data.UserNotFoundException;
import org.junit.Assert;
import org.junit.Test;

public class PositiveDataMapperTest extends BaseTest{

    @Test
    public  void findUserByEmail() throws UserNotFoundException {
        mapper = new UserFileDataMapper();
        User expectedUser = new User("6", "user6", "user6@gmail.com", "6666fh");
        User actualUser = mapper.findUserByEmail("user6@gmail.com");
        Assert.assertEquals("user not match expected", expectedUser, actualUser);
    }
    @Test
    public  void findUserByUserNameTest() throws UserNotFoundException {
        mapper = new UserFileDataMapper();
        User expectedUser = new User("5", "user5", "user5@gmail.com", "5555");
        User actualUser = mapper.findUserByName("user5");
        Assert.assertEquals("user not match expected", expectedUser, actualUser);
    }

}

