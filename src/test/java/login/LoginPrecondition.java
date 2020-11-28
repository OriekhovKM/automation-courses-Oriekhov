package login;

import Infrastructure.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPrecondition extends TestBase {

    @Override
    public void beforeTest(){
        super.beforeTest();
        openMainPage();
        navigateToLoginPage();
    }

    public void navigateToLoginPage() {
        logger.log("guest user navigate to login page");
        driver.findElement(By.xpath("//div/ul/li[1]/a[text()='Log in']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("/wp-login.php"));
    }

    public void openMainPage() {
        driver.get(server.getUrl());
    }

}
