package Infrastructure.base;
import Infrastructure.config.ConfigurationManager;
import Infrastructure.TestServer;
import Infrastructure.wdm.DefaultWebDriverManager;
import Infrastructure.wdm.WebDriverManager;
import Infrastructure.logging.AbstractLogger;
import Infrastructure.logging.FileTestLogger;
import Infrastructure.logging.StdTestLogger;
import org.openqa.selenium.WebDriver;

public class TestBase {

    private WebDriverManager wdm;

    //protected StdTestLogger logger;

    protected TestServer server;
    protected AbstractLogger logger;
    private WebDriver driver;

    public void setup() {
      wdm = new DefaultWebDriverManager(); //WebDriverManager changed on DefaultWebDriverManager
      driver = wdm.getDriver();   //createBrowser changed on getBrowser
      logger = getLogger();
      logger.log(driver);
      server = new TestServer();
      String url = server.getUrl();
      beforeTest();
    }
    public void tearDown(){
        wdm.destroyDriver(driver);
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
     //  return ConfigurationManager.getInstance().getCurrentEnvironment() ?
     //          new StdTestLogger() : new FileTestLogger();

    }
}
