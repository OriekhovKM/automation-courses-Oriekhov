package Lectures.Lesson_20.test;

import Lectures.Lesson_20.aplication.ConvertorApp;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static Lectures.Lesson_20.aplication.ConvertorApp.ConvertorTypes.FROM_KILLOGRAMM_TO_GRAMM;

public class NegativeConvertorTest extends BaseTest{
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test(expected = IllegalArgumentException.class)
    public void verifyConvertorValues() {
        System.out.println("negative test without rules");
        ConvertorApp app = new ConvertorApp();
        float actualData = app.convert(FROM_KILLOGRAMM_TO_GRAMM, -50);


    }

    @Test
    public void verifyConvertorValuesWithRules() {
        System.out.println("negative test with rules");
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("value less then 0 not permitted");
        ConvertorApp app = new ConvertorApp();
        float actualData = app.convert(FROM_KILLOGRAMM_TO_GRAMM, -50);


    }
}
