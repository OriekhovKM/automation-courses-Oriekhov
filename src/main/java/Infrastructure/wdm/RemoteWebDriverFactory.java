package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;

public class RemoteWebDriverFactory implements WebDriverFactory{
    @Override
    public  String create() {

        String testBrowser = ConfigurationManager.getInstance().getTestBrowser();
        switch (testBrowser) {
            case "chrome":
                return "new Google chrome driver";
            case "firefox":
                return "new Mozilla firefox driver";
            default:
                return "";
        }
    }

}


