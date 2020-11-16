package Lectures.Lesson_25;

import Infrastructure.utils.WaitUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LessonApp {
    public static void main(String[] args) {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");
        dc.setPlatform(Platform.WINDOWS);

        ChromeOptions options = new ChromeOptions();
        options.merge(dc);

        WebDriver wd = new ChromeDriver(options );
        wd.get("http://google.com");
        wd.navigate().refresh();
        wd.navigate().to("http://rozetka.ua");

        System.out.println(wd.getCurrentUrl());
        System.out.println(wd.getTitle());

        wd.manage().window().fullscreen();
        WaitUtils.waitABit(3_000);
        wd.navigate().back();
        wd.navigate().forward();
        WaitUtils.waitABit(5_000);
        wd.manage().window().maximize();
        try {
            wd.navigate().to(new URL("http://moyo.ua"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        wd.manage().window().setSize(new Dimension(640, 480));
        WaitUtils.waitABit(3_000);
        wd.manage().window().setSize(new Dimension(1920, 1080));
        WaitUtils.waitABit(2_000);
        wd.quit();

    }
}
