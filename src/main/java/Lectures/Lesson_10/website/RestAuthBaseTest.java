package Lectures.Lesson_10.website;

import Infrastructure.TestBase;

public class RestAuthBaseTest extends TestBase {

    @Override
    public void beforeTest(){
        logger.log("Rest auth");
        logger.log("refresh page");
    }
}
