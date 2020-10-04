package Lectures.Lesson_10.website;



public class RegistrationTest extends AuthFlowBaseTest {
    @Override
    public void beforeTest() {
        super.beforeTest();
        logger.log("switch to registration page");
        logger.log("fill login");
        logger.log("fill password");
    }

    public void registrationTestPositive() {
        logger.log("fill password");
        logger.log("submit registration form");
        logger.log("check is registration in");
    }

    public void registrationTestNegative() {

        logger.log("fill password");
        logger.log("submit registration form");
        logger.log("check is error visible");
    }
}
