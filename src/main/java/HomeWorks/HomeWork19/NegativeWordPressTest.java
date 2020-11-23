package HomeWorks.HomeWork19;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

@RunWith(Parameterized.class)
public class NegativeWordPressTest {
    private String userName;
    private String password;
    private String errorMessage;
    WebDriver driver = new ChromeDriver();
    Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
            .withTimeout(20, TimeUnit.SECONDS)
            .pollingEvery(500, TimeUnit.MILLISECONDS)
            .ignoring(NoSuchElementException.class);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    public NegativeWordPressTest(String userName, String password, String errorMessage) {
        this.userName = userName;
        this.password = password;
        this.errorMessage = errorMessage;
    }
    @Before
    public void setAuthorizationPage () {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("http://testautomationcourses.is-best.net/wordpress/");
        driver.manage().window().maximize();

        WebElement mainLogInButton = fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//div/ul/li[1]/a[text()='Log in']"));
            }
        });
        js.executeScript("arguments[0].scrollIntoView(true);", mainLogInButton);
        mainLogInButton.click();
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

        js.executeScript("document.evaluate('//*[@id=\\\"user_login\\\"]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.value = '"+userName+"'");
        js.executeScript("document.evaluate('//*[@id=\"user_pass\"]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.value = '"+password+"'");
        js.executeScript("document.evaluate('//*[@id=\\\"wp-submit\\\"]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();");

        WebElement authorizationErrorMessage = fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//*[@id=\"login_error\"]"));
            }
        });
        String actualLoginMessage = authorizationErrorMessage.getText();

        Assert.assertEquals(errorMessage, actualLoginMessage);
    }
}
