package Infrastructure;

public class TestBase {

    private  WebDriverManager wdm;
    protected TestLogger logger;
    protected TestServer server;
    private String browser;

    public void setup(){
      wdm = new WebDriverManager();
      browser = wdm.createBrowser();
      logger = new TestLogger();
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
