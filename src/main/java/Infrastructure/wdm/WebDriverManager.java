package Infrastructure.wdm;

import org.openqa.selenium.WebDriver;

public interface WebDriverManager {
    public WebDriver getDriver();
    public void destroyDriver(WebDriver driver);

}
