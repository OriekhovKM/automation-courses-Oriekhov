package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;

public class DefaultWebDriverManager implements WebDriverManager{


    @Override
    public String getBrowser() {

        String env =  ConfigurationManager.getInstance().getRunOn();
        switch (env) {
            case "local":

                return  "LocalWebDriverFactory";
            case "remote":
                return "RemoteWebDriverFactory";
            case "cloud":
                return "CloudWebDriverFactory";
            default:
               return "";
        }

    }

    @Override
    public void destroyBrowser(String browser) {

    }
}
