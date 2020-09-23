package Lectures.Lesson_10.website;

public class TestSuit {
    public static void main(String[] args) {
        LoginTest test1 = new LoginTest();
        test1.setup();
        test1.loginTestPositive();
        test1.tearDown();

        LoginTest test2 = new LoginTest();
        test2.setup();
        test2.loginTestNegative();
        test2.tearDown();

        RegistrationTest test3 = new RegistrationTest();
        test3.setup();
        test3.registrationTestPositive();
        test3.tearDown();

        RegistrationTest test4 = new RegistrationTest();
        test4.setup();
        test4.registrationTestNegative();
        test4.tearDown();
    }
}
