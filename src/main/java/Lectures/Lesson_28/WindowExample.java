package Lectures.Lesson_28;

import Infrastructure.utils.SeleniumUtils;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

    @Test
    public void windowsSwitchTest() {
        WebDriver driver = new ChromeDriver();
        SeleniumUtils seleniumUtils = new SeleniumUtils(driver);
        driver.get("http://google.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.open('https://www.selenium.dev/blog/')");
        js.executeScript("window.open('https://github.com')");
        js.executeScript("window.open('http://testautomationcourses.is-best.net/wordpress/')");
        js.executeScript("window.open('https://lms.ithillel.ua/')");

        seleniumUtils.switchToWindowByTitle("GitHub");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("_______________________________");


        seleniumUtils.returnToParentWindow();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("_______________________________");

        seleniumUtils.switchToWindowContainsUrl("https://lms.ithillel.ua/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println("_______________________________");

        seleniumUtils.returnToParentWindow();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        seleniumUtils.closeExtraWindows();

        driver.quit();
    }

}
