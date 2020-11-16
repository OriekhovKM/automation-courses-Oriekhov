package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;
import Infrastructure.wdm.capabilities.BrowserCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteWebDriverFactory implements WebDriverFactory{
    DesiredCapabilities caps = new DesiredCapabilities();
    WebDriver driver;

    public WebDriver create() {
        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case CHROME:
              caps.merge(BrowserCapabilities.chromeCapabilities());
              break;
//            case FIREFOX:
//                return new FirefoxDriver();
//            case IE:
//                return new InternetExplorerDriver();
//            case SAFARI:
//                return new SafariDriver();
//            case OPERA:
//                return new OperaDriver();
            default:
                throw new IllegalArgumentException(String.format("unable to create driver with type %s", testBrowser));
        }

        try {
           driver = new RemoteWebDriver(new URL(ConfigurationManager.getInstance().getRemoteHubUrl()), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}

