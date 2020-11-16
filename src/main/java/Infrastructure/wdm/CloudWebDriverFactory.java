package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloudWebDriverFactory implements WebDriverFactory{
    @Override
    public WebDriver create() {

        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case CHROME:
                return new ChromeDriver();
//            case FIREFOX:
//                return "cloud new Mozilla Firefox driver";
            default:
                throw new IllegalArgumentException(String.format("unable to create driver with type %s", testBrowser));        }
    }
}
