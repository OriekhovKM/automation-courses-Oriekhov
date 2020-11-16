package Infrastructure.wdm.capabilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserCapabilities {

    public static Capabilities chromeCapabilities() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserVersion", "67");
        chromeOptions.setCapability("platformName", "Windows XP");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge(chromeOptions);
        return desiredCapabilities;
    }
}
