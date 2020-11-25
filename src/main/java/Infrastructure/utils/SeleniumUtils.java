package Infrastructure.utils;

import org.openqa.selenium.WebDriver;

public class SeleniumUtils {
    private static String parentWindow;
    public static void switchToWindowByTitle (WebDriver driver, String title){
     parentWindow = driver.getWindowHandle();
        for(String window: driver.getWindowHandles()){
            driver.switchTo().window(window);
            if(driver.getTitle().contains(title)){
                break;
            }
        }
    }

    public static void switchToWindowContainsUrl (WebDriver driver, String url) {
        parentWindow = driver.getWindowHandle();
        for (String window : driver.getWindowHandles()) {
            driver.switchTo().window(window);
            if (driver.getCurrentUrl().contains(url)) {
                break;
            }
        }
    }

    public static void returnToParentWindow(WebDriver driver) {
        driver.switchTo().window(parentWindow);
    }

    public static void closeExtraWindows(WebDriver driver){
        for (String window : driver.getWindowHandles()) {
            driver.switchTo().window(window);
            if (!driver.getCurrentUrl().equals(parentWindow)) {
                driver.close();
            }
        }
    }
}
