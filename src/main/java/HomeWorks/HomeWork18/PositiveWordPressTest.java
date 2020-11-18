package HomeWorks.HomeWork18;

import Infrastructure.utils.WaitUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveWordPressTest {
    @Test
    public void positiveAuthorizationTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://testautomationcourses.is-best.net/wordpress/");
        WaitUtils.waitABit(10_000);
        driver.findElement(By.xpath("//div/ul/li[1]/a[text()='Log in']")).click();

        WaitUtils.waitABit(5_000);

        WebElement userNameField = driver.findElement(By.xpath("//*[@id=\"user_login\"]"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
        WebElement logInButton = driver.findElement(By.xpath("//*[@id=\"wp-submit\"]"));

        userNameField.sendKeys("admin");
        passwordField.sendKeys("admin");
        logInButton.click();

        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals("url not expected", "http://testautomationcourses.is-best.net/wordpress/wp-admin/", actualURL);

    }
}
