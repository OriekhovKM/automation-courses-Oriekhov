package Infrastructure.base;

import Infrastructure.config.ConfigurationManager;
import Infrastructure.TestServer;
import Infrastructure.wdm.DefaultWebDriverManager;
import Infrastructure.wdm.WebDriverManager;
import Infrastructure.logging.AbstractLogger;
import Infrastructure.logging.FileTestLogger;
import Infrastructure.logging.StdTestLogger;

public class TestBase {

    private WebDriverManager wdm;
    protected TestServer server;
    protected AbstractLogger logger;
    private String browser;

    public void setup() {
      wdm = new DefaultWebDriverManager(); //WebDriverManager changed on DefaultWebDriverManager
      browser = wdm.getBrowser();   //createBrowser changed on getBrowser
      logger = getLogger();
      logger.log(browser);
      server = new TestServer();
      String url = server.getUrl();
      logger.log(url);
      beforeTest();
    }
    public void tearDown(){
        wdm.destroyBrowser(browser);
        afterTest();
    }

    public void beforeTest() {
        logger.atStart();
    }

    public void afterTest() {
        logger.atFinish();
    }

    public  AbstractLogger getLogger(){
        if (ConfigurationManager.getInstance().getCurrentEnvironment().equals("local")){
            return new StdTestLogger();
        } else return new FileTestLogger();

      }
}
