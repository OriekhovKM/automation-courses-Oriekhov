package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;



public class DefaultWebDriverManager implements WebDriverManager {


    public DefaultWebDriverManager() {

    }

    @Override
    public String getBrowser() {
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
    public void destroyBrowser(String browser) {
}
}
