package Infrastructure.wdm;

import Infrastructure.config.ConfigurationManager;

public interface WebDriverManager {
    public String getBrowser();
    public void destroyBrowser(String browser);

}
