package Lectures.Lesson_28;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.assertj.core.api.Assertions.assertThat;

public class Alerts {
    @Test
    public void closeAlertTest() {
        DesiredCapabilities ds = new DesiredCapabilities();
        ds.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
        ChromeOptions opt = new ChromeOptions();
        opt.merge(ds);
        WebDriver driver = new ChromeDriver(opt);

        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.xpath("//button[@id = 'alertButton']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.findElement(By.xpath("//div[contains(text(), 'Elements')]")).click();
        assertThat(driver.findElement(By.xpath("//span[contains(text(), 'Text Box')]")).isDisplayed()).isTrue();
        driver.quit();
    }

    @Test
    public void iframeTest() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/nested_frames");
        //List<WebElement> elements = driver.findElements(By.xpath("//body"));
        driver.switchTo().frame(0);//switch to top frame

        driver.switchTo().frame("frame-left");//switch to left frame, also you can use - driver.switchTo().frame("//frame[@src= '/frame_left']");
        System.out.println(driver.findElements(By.xpath("//body")).get(0).getText());

        driver.switchTo().parentFrame().switchTo().frame("frame-middle");//switch to top frame and switch to middle frame
        System.out.println(driver.findElements(By.xpath("//body")).get(0).getText());

        driver.switchTo().parentFrame();//switch to top frame


        driver.switchTo().frame("frame-right");//switch to right frame
        System.out.println(driver.findElements(By.xpath("//body")).get(0).getText());



    }
}
