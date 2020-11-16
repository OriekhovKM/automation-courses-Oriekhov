package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;
import org.openqa.selenium.WebDriver;


public class DefaultWebDriverManager implements WebDriverManager {



    @Override
    public WebDriver getDriver() {
        RunOn runOn = (RunOn) ConfigurationManager.getInstance().getRunOn();

        switch (runOn) {
            case LOCAL:
            default:
                return new LocalWebDriverFactory().create();

            case REMOTE:
                return new RemoteWebDriverFactory().create();

            case CLOUD:
                return new CloudWebDriverFactory().create();
        }

    }

    @Override
    public void destroyDriver(WebDriver driver) {
        if (driver != null){
            driver.quit();
        }
}
}
