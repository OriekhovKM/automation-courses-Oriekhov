package DataMapperTest;

import Infrastructure.data.User;
import Infrastructure.data.UserFileDataMapper;
import Infrastructure.data.UserNotFoundException;
import org.junit.Assert;
import org.junit.Test;

public class NegativeDataMapperTest extends  BaseTest{


    @Test
    public  void findUserByEmailTest() throws UserNotFoundException {
        ex.expectMessage("User with email 'user6999@gmail.com' not found ");
        ex.expect(UserNotFoundException.class);
        mapper = new UserFileDataMapper();
        User expectedUser = new User("6", "user6", "user6@gmail.com", "6666fh");
        User actualUser = mapper.findUserByEmail("user6999@gmail.com");
        Assert.assertEquals("user not match expected", expectedUser, actualUser);
    }

    @Test
    public  void findUserByNameTest() throws UserNotFoundException {
        ex.expectMessage("User with name 'user11' not found");
        ex.expect(UserNotFoundException.class);
        mapper = new UserFileDataMapper();
        User actualUser = mapper.findUserByName("user11");
    }

    @Test
    public void unableToReadSourceFileTest(){
        ex.expectMessage("unable to read data from file");
        ex.expect(IllegalArgumentException.class);
        mapper = new UserFileDataMapper("users777.txt");
    }


}
