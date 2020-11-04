package RandomStringTest;

import Infrastructure.utils.RandomString;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NegativeRandomStringTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void verifyStringGeneratorLength() {
        System.out.println("negative verifyStringGeneratorLength test");
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("length less then 1 not permitted");
        String actualResult = new RandomString().stringGenerator(RandomString.StringUtils.NUMS, -20);
    }

}
