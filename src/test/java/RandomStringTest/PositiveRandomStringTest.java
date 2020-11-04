package RandomStringTest;

import Infrastructure.utils.RandomString;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static Infrastructure.utils.RandomString.StringUtils.*;

@RunWith(Parameterized.class)
public class PositiveRandomStringTest {
    private RandomString.StringUtils type;
    private String controlData;
    private int length;


    public PositiveRandomStringTest(String controlData, RandomString.StringUtils type, int length) {
        this.controlData = controlData;
        this.type = type;
        this.length = length;
    }

    @Parameterized.Parameters
    public static Collection controlData() {
        return Arrays.asList(new Object[][]{
                {"0123456789", NUMS, 165},
                {"abcdefghijklmnopqrstuvwxyz", ALPHABET, 10},
                {"abcdefghijklmnopqrstuvwxyz0123456789", ALPANUMERIC, 30}
        });
    }

    @Test
    public void stringGeneratorContentTest() {

        String actualResult = new RandomString().stringGenerator(type, length);
        char[] actualResultArr = actualResult.toCharArray();
        int actual = 0;

        for (int i = 0; i < length; i++) {
            int index = controlData.indexOf(actualResultArr[i]);
            if (index == -1) {
                actual = index;
            }
        }
        Assert.assertEquals("generated string contains an error character", 0, actual);
        System.out.println("stringGeneratorContentTest with type " + type);
    }

    @Test
    public void stringGeneratorLengthTest() {
        String actualResult = new RandomString().stringGenerator(type, length);
        Assert.assertEquals("length of generated string is wrong", length, actualResult.length());
        System.out.println("stringGeneratorLengthTest with length " + length);
    }
}

