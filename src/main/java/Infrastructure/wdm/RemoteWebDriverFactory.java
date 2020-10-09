package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;

public class RemoteWebDriverFactory implements WebDriverFactory{
    @Override
    public  String create() {

        BrowserType testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case CHROME:
                return "remote new Google Chrome driver";
            case FIREFOX:
                return "remote new Mozilla Firefox driver";
            default:
                return "";
        }
    }
}

