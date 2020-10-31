package Lectures.Lesson_20.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


public class BaseTest {
    @Before
    public void before(){
        System.out.println("before");
    }
    @After
    public void after(){
        System.out.println("after");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }
    @AfterClass
    public static  void afterClass(){
        System.out.println("after class");
    }

}
