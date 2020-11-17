package Infrastructure.wdm.capabilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserCapabilities {

    public static Capabilities chromeCapabilities() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserVersion", "86");
        chromeOptions.setCapability("platformName", "Windows 10");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge(chromeOptions);
        return desiredCapabilities;
    }

    public static Capabilities firefoxCapabilities() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("browserVersion", "79");
        firefoxOptions.setCapability("platformName", "Linux");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge(firefoxOptions);
        return desiredCapabilities;
    }

    public static Capabilities operaCapabilities() {
        OperaOptions operaOptions = new OperaOptions();
        operaOptions.setCapability("browserVersion", "72");
        operaOptions.setCapability("platformName", "Android 10");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge(operaOptions);
        return desiredCapabilities;
    }

    public static Capabilities internetExplorerCapabilities() {
        InternetExplorerOptions internetExplorerOptions = new InternetExplorerOptions();
        internetExplorerOptions.setCapability("browserVersion", "11");
        internetExplorerOptions.setCapability("platformName", "Windows XP");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge(internetExplorerOptions);
        return desiredCapabilities;
    }



}
