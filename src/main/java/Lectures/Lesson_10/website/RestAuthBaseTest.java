package Lectures.Lesson_10.website;

import Infrastructure.base.TestBase;

public class RestAuthBaseTest extends TestBase {

    @Override
    public void beforeTest(){
        logger.atStart();
        logger.log("Rest auth");
        logger.log("refresh page");
    }
}
