package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;

public class CloudWebDriverFactory implements WebDriverFactory{
    @Override
    public  String create() {
        return ConfigurationManager.getInstance().getTestBrowser();
    }
}
