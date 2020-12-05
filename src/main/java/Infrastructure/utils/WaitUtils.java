package Infrastructure.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class WaitUtils {

    public static Wait<WebDriver>  getFluentWait(WebDriver driver){ return new FluentWait<WebDriver>(driver)
            .withTimeout(20, TimeUnit.SECONDS)
            .pollingEvery(500, TimeUnit.MILLISECONDS)
            .ignoring(NoSuchElementException.class);}

    public static void waitABit (int timeout) {
        try{
            Thread.sleep(timeout);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public static void fluentWait(WebDriver driver){

    }

    public static void waitForLoad(WebDriver driver) {
        new WebDriverWait(driver, 60).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }
}
