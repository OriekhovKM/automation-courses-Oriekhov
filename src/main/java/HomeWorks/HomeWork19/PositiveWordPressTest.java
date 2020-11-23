package HomeWorks.HomeWork19;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class PositiveWordPressTest {
    WebDriver driver;


    @Test
    public void positiveAuthorizationTest() {

        driver = new ChromeDriver();
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
                .withTimeout(20, TimeUnit.SECONDS)
                .pollingEvery(500, TimeUnit.MILLISECONDS)
                .ignoring(NoSuchElementException.class);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("http://testautomationcourses.is-best.net/wordpress/");

        WebElement mainLogInButton = fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//div/ul/li[1]/a[text()='Log in']"));
            }
        });
        js.executeScript("arguments[0].scrollIntoView(true);", mainLogInButton);
        js.executeScript("arguments[0].click();", mainLogInButton);


        WebElement userNameField = fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//*[@id=\"user_login\"]"));
            }
        });

        String userName = "admin";
        String password = "admin";


        js.executeScript("arguments[0].value='"+userName+"'", userNameField);
        js.executeScript("document.evaluate('//*[@id=\"user_pass\"]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.value = '"+password+"'");
        js.executeScript("document.evaluate('//*[@id=\\\"wp-submit\\\"]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.click();");

        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals("url not expected", "http://testautomationcourses.is-best.net/wordpress/wp-admin/", actualURL);

        driver.quit();

    }
}
