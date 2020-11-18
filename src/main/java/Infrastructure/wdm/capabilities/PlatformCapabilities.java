package Infrastructure.wdm.capabilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PlatformCapabilities {
    public static Capabilities chromeCloudCapabilities() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserVersion", "86");
        chromeOptions.setCapability("platformName", "Windows 10");
        chromeOptions.setCapability("memoryValue", " 4GB");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge(chromeOptions);
        return desiredCapabilities;
    }

    public static Capabilities firefoxCloudCapabilities() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("browserVersion", "79");
        firefoxOptions.setCapability("platformName", "Linux");
        firefoxOptions.setCapability("memoryValue", "2GB");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge(firefoxOptions);
        return desiredCapabilities;
    }
}
