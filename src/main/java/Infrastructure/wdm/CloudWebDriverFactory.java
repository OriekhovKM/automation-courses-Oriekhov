package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;

public class CloudWebDriverFactory implements WebDriverFactory{
    @Override
    public  String create() {

        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case CHROME:
                return "cloud new Google Chrome driver";
            case FIREFOX:
                return "cloud new Mozilla Firefox driver";
            default:
                return "";
        }
    }
}
