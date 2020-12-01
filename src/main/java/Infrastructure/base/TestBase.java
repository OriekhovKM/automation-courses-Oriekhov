package Infrastructure.base;
import Infrastructure.TestServer;
import Infrastructure.config.ConfigurationManager;
import Infrastructure.data.UserFileDataMapper;
import Infrastructure.logging.AbstractLogger;
import Infrastructure.logging.FileTestLogger;
import Infrastructure.logging.StdTestLogger;
import Infrastructure.wdm.DefaultWebDriverManager;
import Infrastructure.wdm.WebDriverManager;
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
    protected UserFileDataMapper users;

    @Before
    public void setup() {
      wdm = new DefaultWebDriverManager(); //WebDriverManager changed on DefaultWebDriverManager
      driver = wdm.getDriver();   //createBrowser changed on getBrowser
      logger = getLogger();
      wait = new WebDriverWait(driver, 10);
      server = new TestServer();
      logger.log(server.getUrl());
      beforeTest();
      users = new UserFileDataMapper();
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
