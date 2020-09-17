package Lectures.Lesson_10;

public class TestBase {

    private  WebDriverManager wdm;
    protected TestLogger logger;
    private String browser;

    public void setup(){
      wdm = new WebDriverManager();
      wdm.createBrowser();
      logger = new TestLogger();
    }
    public void tearDown(){
        wdm.destryBrowser(browser);

    }
}
