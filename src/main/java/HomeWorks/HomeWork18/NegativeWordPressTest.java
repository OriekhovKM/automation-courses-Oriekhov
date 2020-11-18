package HomeWorks.HomeWork18;

import Infrastructure.utils.WaitUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class NegativeWordPressTest {
    private String userName;
    private String password;
    private String errorMessage;
    WebDriver driver = new ChromeDriver();

    public NegativeWordPressTest(String userName, String password, String errorMessage) {
        this.userName = userName;
        this.password = password;
        this.errorMessage = errorMessage;
    }
    @Before
    public void setAuthorizationPage () {
        driver.get("http://testautomationcourses.is-best.net/wordpress/");
        WaitUtils.waitABit(5_000);
        driver.findElement(By.xpath("//div/ul/li[1]/a[text()='Log in']")).click();
        WaitUtils.waitABit(2_000);
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
    @Parameterized.Parameters
    public static Collection ControlData() {
        return Arrays.asList(new Object[][]{
                {"", "", "Error: The username field is empty.\nError: The password field is empty."},
                {"admin", "", "Error: The password field is empty."},
                {"", "admin", "Error: The username field is empty."},
                {"admin", "1111", "Error: The password you entered for the username admin is incorrect. Lost your password?"},
                {"admin1", "admin", "Unknown username. Check again or try your email address."}
        });
    }



    @Test
    public void negativeAuthorizationTest (){


        WebElement userNameField = driver.findElement(By.xpath("//*[@id=\"user_login\"]"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
        WebElement logInButton = driver.findElement(By.xpath("//*[@id=\"wp-submit\"]"));

        userNameField.sendKeys(userName);
        passwordField.sendKeys(password);
        logInButton.click();

        String actualLoginMessage = driver.findElement(By.xpath("//*[@id=\"login_error\"]")).getText();

        Assert.assertEquals(errorMessage, actualLoginMessage);

    }
}
