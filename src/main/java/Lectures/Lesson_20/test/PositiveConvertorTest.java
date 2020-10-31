package Lectures.Lesson_20.test;

import Lectures.Lesson_20.aplication.ConvertorApp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static Lectures.Lesson_20.aplication.ConvertorApp.ConvertorTypes.*;


@RunWith(Parameterized.class)
public class PositiveConvertorTest extends BaseTest {
    private ConvertorApp app;
    private ConvertorApp.ConvertorTypes type;
    private float expected;
    private int convertedData;

    public PositiveConvertorTest(ConvertorApp.ConvertorTypes type, int convertedData, float expected) {
        this.type = type;
        this.convertedData = convertedData;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection convertedData() {
        return Arrays.asList(new Object[][]{
                {FROM_KM_TO_L, 358, 42.95f},
                {FROM_KILLOGRAMM_TO_GRAMM, 1000, 1000000},
                {FROM_METERS_TO_KILOMETERS, 1000, 1}
        });
    }


    @Test
    public void testPositiveConvertParametrized() {
        ConvertorApp app = new ConvertorApp();
        float actual = app.convert(type, convertedData);
        Assert.assertEquals(expected, actual, 1);
        System.out.println("parametrized test with type" + type);
    }

//    @Test
//public void testPositiveConvertKgtoGr(){
//        ConvertorApp app = new ConvertorApp();
//      float  actual = app.convert(FROM_KILLOGRAMM_TO_GRAMM, 1000);
//        Assert.assertEquals(1, actual, 0);
//    }
//
//    @Test
//    public void testPositiveConvertKmToL(){
//        ConvertorApp app = new ConvertorApp();
//        float  actual = app.convert(FROM_KM_TO_L, 400);
//        Assert.assertEquals(60, actual, 20);
//    }
}
