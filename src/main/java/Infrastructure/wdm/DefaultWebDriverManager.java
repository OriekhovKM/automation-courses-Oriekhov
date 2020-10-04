package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;

public class DefaultWebDriverManager implements WebDriverManager{


    @Override
    public String getBrowser() {

        String env =  ConfigurationManager.getInstance().getRunOn();
        switch (env) {
            case "local":
                return  new LocalWebDriverFactory().create();
            case "remote":
                return new RemoteWebDriverFactory().create();
            case "cloud":
                return new CloudWebDriverFactory().create();
            default:
               return "";
        }

    }

    @Override
    public void destroyBrowser(String browser) {
        if (browser != null) { 
          System.out.println("Browser closed");
        }
    }
}
