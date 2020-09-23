package Infrastructure;

import Infrastructure.logging.AbstractLogger;
import Infrastructure.logging.FileTestLogger;
import Infrastructure.logging.StdTestLogger;

public class TestBase {

    private  WebDriverManager wdm;
    //protected StdTestLogger logger;
    protected TestServer server;
    protected AbstractLogger logger;
    private String browser;

    public void setup(){
      wdm = new WebDriverManager();
      browser = wdm.createBrowser();
      logger = getLogger();
      logger.log(browser);
      server = new TestServer();
      String url = server.getUrl();
      logger.log(url);
      beforeTest();
    }
    public void tearDown(){
        wdm.destroyBrowser(browser);
    }

    public void beforeTest() {
    }

    public void afterTest() {
    }

    public  AbstractLogger getLogger(){
        if (ConfigurationManager.getInstance().getCurrentEnvironment().equals("local")){
            return new FileTestLogger();
        } else return new StdTestLogger();
     //  return ConfigurationManager.getInstance().getCurrentEnvironment() ?
     //          new StdTestLogger() : new FileTestLogger();
    }
}
