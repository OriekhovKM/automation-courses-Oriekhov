package DataMapperTest;

import Infrastructure.data.User;
import Infrastructure.data.UserFileDataMapper;
import Infrastructure.data.UserNotFoundException;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class PositiveDataMapperTest extends BaseTest{

    @Test
    public  void findUserByEmailTest() throws UserNotFoundException {
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

    @Test
    public  void readAllUsersFromFileTest()  {
        mapper = new UserFileDataMapper();
        List<User> actualUser = mapper.getAll();
        assertThat("data from file not matched to actual data", actualUser, hasSize(9));
    }



}

