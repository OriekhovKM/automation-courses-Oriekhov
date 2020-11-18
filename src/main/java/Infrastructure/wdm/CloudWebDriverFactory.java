package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;
import Infrastructure.wdm.capabilities.PlatformCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class CloudWebDriverFactory implements WebDriverFactory {
    DesiredCapabilities caps = new DesiredCapabilities();
    WebDriver driver;

    @Override
    public WebDriver create() {
        String userName = System.getenv("UserName");
        String accessKey = System.getenv("Pass");

        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case CHROME:
                caps.merge(PlatformCapabilities.chromeCloudCapabilities());
                break;
            case FIREFOX:
                caps.merge(PlatformCapabilities.firefoxCloudCapabilities());
                break;
            default:
                throw new IllegalArgumentException(String.format("unable to create driver with type %s", testBrowser));
        }
        try {
            driver = new RemoteWebDriver(new URL("https://"+userName+":"+accessKey+"@hub-cloudbrowserstack.com"), caps);
        } catch (
                MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

}

