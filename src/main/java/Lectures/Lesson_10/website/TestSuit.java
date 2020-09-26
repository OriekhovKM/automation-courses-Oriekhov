package Lectures.Lesson_10.website;

public class TestSuit {
    public static void main(String[] args) {
        LoginTest test1 = new LoginTest();
        test1.setup();
        test1.loginTestPositive();
        test1.tearDown();


        test1.setup();
        test1.loginTestNegative();
        test1.tearDown();

        RegistrationTest test2 = new RegistrationTest();
        test2.setup();
        test2.registrationTestPositive();
        test2.tearDown();


        test2.setup();
        test2.registrationTestNegative();
        test2.tearDown();
    }
}
