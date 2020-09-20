package Infrastructure;

import Infrastructure.logging.StdTestLogger;

public class TestBase {

    private  WebDriverManager wdm;
    //protected StdTestLogger logger;
    protected FileTestLogger logger;
    protected TestServer server;
    private String browser;

    public void setup(){
      wdm = new WebDriverManager();
      browser = wdm.createBrowser();
      logger = new StdTestLogger();
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
}
