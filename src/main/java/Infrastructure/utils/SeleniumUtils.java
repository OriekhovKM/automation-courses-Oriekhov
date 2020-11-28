package Infrastructure.utils;

import org.openqa.selenium.WebDriver;

public class SeleniumUtils {
    private static String parentWindow;
    private WebDriver driver;

    public SeleniumUtils(WebDriver driver) {
        this.driver = driver;
        this.parentWindow = driver.getWindowHandle();
    }

    public void switchToWindowByTitle(String title) {
        for (String window : driver.getWindowHandles()) {
            driver.switchTo().window(window);
            if (driver.getTitle().contains(title)) {
                break;
            }
        }
    }

    public void switchToWindowContainsUrl(String url) {
        for (String window : driver.getWindowHandles()) {
            driver.switchTo().window(window);
            if (driver.getCurrentUrl().contains(url)) {
                break;
            }
        }
    }

    public void returnToParentWindow() {
        driver.switchTo().window(parentWindow);
    }

    public void closeExtraWindows() {
        for (String window : driver.getWindowHandles()) {
            driver.switchTo().window(window);
            if (!window.equals(parentWindow)) {
                driver.close();
            }
        }
    }

    public void acceptPopUp() {
        driver.switchTo().alert().accept();
    }

    public void dismissPopUp() {
        driver.switchTo().alert().dismiss();
    }
}
