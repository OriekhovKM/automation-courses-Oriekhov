package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;

public class LocalWebDriverFactory implements WebDriverFactory{

    @Override
    public String create() {

        return "local " + ConfigurationManager.getInstance().getTestBrowser();

    }
}
