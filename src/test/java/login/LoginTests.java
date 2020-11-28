package login;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginTests extends LoginPrecondition{
    private void populateLoginFormSubmit(String name, String pass){
        logger.log("guest user populate login name form with - " +name);
        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(name);

        logger.log("guest user populate login password form with - " +pass);
        driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys(pass);

        logger.log("guest user submits login  form");
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
    }

    @Test
    public void positiveLoginTest(){
        populateLoginFormSubmit("admin", "admin");
        logger.log("wait until dashboard page is loaded");
        wait.until(ExpectedConditions.urlContains("wp-admin/"));
        assertThat(driver.findElement(By.xpath("//li[@id='wp-admin-bar-my-account']")).getText()).isEqualTo("Howdy, admin");
    }

}
