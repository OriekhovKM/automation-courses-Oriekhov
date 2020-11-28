package Infrastructure.base;
import Infrastructure.config.ConfigurationManager;
import Infrastructure.TestServer;
import Infrastructure.wdm.DefaultWebDriverManager;
import Infrastructure.wdm.WebDriverManager;
import Infrastructure.logging.AbstractLogger;
import Infrastructure.logging.FileTestLogger;
import Infrastructure.logging.StdTestLogger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

    private WebDriverManager wdm;
    protected TestServer server;
    protected AbstractLogger logger;
    protected WebDriver driver;
    protected WebDriverWait wait;

    @Before
    public void setup() {
      wdm = new DefaultWebDriverManager(); //WebDriverManager changed on DefaultWebDriverManager
      driver = wdm.getDriver();   //createBrowser changed on getBrowser
      logger = getLogger();
      wait = new WebDriverWait(driver, 10);
      server = new TestServer();
      logger.log(server.getUrl());
      beforeTest();
    }

    @After
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
