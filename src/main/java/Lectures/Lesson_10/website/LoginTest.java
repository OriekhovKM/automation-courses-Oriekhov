package Lectures.Lesson_10.website;

public class LoginTest extends AuthFlowBaseTest {
   @Override
    public void beforeTest() {
        super.beforeTest();
        logger.log("fill login");

    }
    public void loginTestPositive(){
        logger.log("fill password");
        logger.log("submit login form");
        logger.log("check is logger in");
   }

    public void loginTestNegative(){
        logger.log("submit login form");
        logger.log("check error");
    }
}
