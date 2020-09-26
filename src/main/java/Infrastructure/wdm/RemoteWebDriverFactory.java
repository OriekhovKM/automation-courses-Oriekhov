package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;

public class RemoteWebDriverFactory implements WebDriverFactory{
    @Override
    public  String create() {
        return ConfigurationManager.getInstance().getTestBrowser();
    }
}
