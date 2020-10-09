package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;

public class LocalWebDriverFactory implements WebDriverFactory{

    @Override
    public String create() {

        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case CHROME:
                return "local new Google Chrome driver";
            case FIREFOX:
                return "local new Mozilla Firefox driver";
            default:
                return "";
        }
    }
}
