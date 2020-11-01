package DataMapperTest;

import Infrastructure.data.User;
import Infrastructure.data.UserFileDataMapper;
import Infrastructure.data.UserNotFoundException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NegativeDataMapperTest extends  BaseTest{


    @Test
    public  void findUserByEmail() throws UserNotFoundException {
        ex.expectMessage("User with email 'user6999@gmail.com' not found ");
        ex.expect(UserNotFoundException.class);
        mapper = new UserFileDataMapper();
        User expectedUser = new User("6", "user6", "user6@gmail.com", "6666fh");
        User actualUser = mapper.findUserByEmail("user6999@gmail.com");
        Assert.assertEquals("user not match expected", expectedUser, actualUser);
    }
}
