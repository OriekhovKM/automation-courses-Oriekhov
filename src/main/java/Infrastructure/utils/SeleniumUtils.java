package Infrastructure.utils;

import org.openqa.selenium.WebDriver;

public class SeleniumUtils {
    private static String parentWindow;
    private WebDriver driver;
    private String title;
    private String url;

    public SeleniumUtils(WebDriver driver, String title, String url) {

        this.driver = driver;
        this.title = title;
        this.url = url;
    }



    public  void switchToWindowByTitle (){
     parentWindow = driver.getWindowHandle();
        for(String window: driver.getWindowHandles()){
            driver.switchTo().window(window);
            if(driver.getTitle().contains(title)){
                break;
            }
        }
    }

    public  void switchToWindowContainsUrl () {
        parentWindow = driver.getWindowHandle();
        for (String window : driver.getWindowHandles()) {
            driver.switchTo().window(window);
            if (driver.getCurrentUrl().contains(url)) {
                break;
            }
        }
    }

    public  void returnToParentWindow() {
        driver.switchTo().window(parentWindow);
    }

    public  void closeExtraWindows(){
        for (String window : driver.getWindowHandles()) {
            driver.switchTo().window(window);
            if (!driver.getCurrentUrl().equals(parentWindow)) {
                driver.close();
            }
        }
    }
}
