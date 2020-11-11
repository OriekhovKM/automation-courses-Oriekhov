package RandomStringTest;

import Infrastructure.utils.RandomString;
import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static Infrastructure.utils.RandomString.StringUtils.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;


@RunWith(Parameterized.class)
public class PositiveRandomStringTest {
    private RandomString.StringUtils type;
    private String controlData;
    private int length;
    private SoftAssertions softAssertions;

    public PositiveRandomStringTest(String controlData, RandomString.StringUtils type, int length) {
        this.controlData = controlData;
        this.type = type;
        this.length = length;
    }

    @Parameterized.Parameters
    public static Collection controlData() {
        return Arrays.asList(new Object[][]{
                {"0123456789", NUMS, 165},
                {"abcdefghijklmnopqrstuvwxyz", ALPHABET, 165},
                {"abcdefghijklmnopqrstuvwxyz0123456789", ALPANUMERIC, 165}
        });
    }

    @Before
    public void setUp() {
        softAssertions = new SoftAssertions();
    }

    @After
    public void tearDown() {
        softAssertions.assertAll();
    }


    @Test
    public void stringGeneratorContentTest() {

        String actualResult = new RandomString().stringGenerator(type, length);
        char[] actualResultArr = actualResult.toCharArray();
        int actual = 0;
        int actualALPANUMERIC = 0;

        for (int i = 0; i < length; i++) {
            int index = controlData.indexOf(actualResultArr[i]);
            if (index == -1) {
                actual = index;
            }
        }

        if (type == ALPANUMERIC) {
            System.out.println("additional ALPHANUMERIC ContentTest");
            if (!actualResult.matches(".*[a-z].*") || !actualResult.matches(".*[0-9].*")) {
                actualALPANUMERIC = -1;
                softAssertions.assertThat(actualALPANUMERIC).as("generated ALPHANUMERIC string doesn't contain declared content").isEqualTo(0);

            }
        }
        softAssertions.assertThat(actual).as("generated string contains an error character").isEqualTo(0);

        System.out.println("stringGeneratorContentTest with type " + type);
    }

    @Test
    public void stringGeneratorLengthTest() {
        String actualResult = new RandomString().stringGenerator(type, length);
        softAssertions.assertThat(length).as("length of generated string is wrong").isEqualTo(actualResult.length());
        System.out.println("stringGeneratorLengthTest with length " + length);
    }

    @Test
    public void stringGeneratorShvetcContentTest() {
        System.out.println("stringGeneratorShvetcContentTest with type " + type);
        String actualResult = new RandomString().stringGenerator(type, length);
        for (String element : actualResult.split("")) {
            assertThat(controlData, containsString(element));
        }
    }
}

