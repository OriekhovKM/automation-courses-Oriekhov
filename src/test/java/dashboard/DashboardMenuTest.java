package dashboard;

import Infrastructure.base.TestBase;
import Infrastructure.data.User;
import Infrastructure.pages.pagefactory.DashboardPageFactory;
import Infrastructure.pages.pagefactory.LoginPageFactory;
import Infrastructure.pages.pagefactory.MainPageFactory;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static org.assertj.core.api.Assertions.assertThat;

public class DashboardMenuTest extends TestBase {

    @Test
    public void hoverToMenuItem(){
        User admin = users.findUserByID("10");
        MainPageFactory mainPageFactory = new MainPageFactory(driver);
        mainPageFactory.openMainPage(server.getUrl());

        logger.log("guest user navigate to login page");
        mainPageFactory.navigateToLoginPage();

        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);

        logger.log("guest user populate login name form with - " +admin.getUserName());
        loginPageFactory.populateLoginNameField(admin.getUserName());

        logger.log("guest user populate login password form with - " +admin.getUserPassword());
        loginPageFactory.populateLoginPasswordField(admin.getUserPassword());

        logger.log("guest user submits login  form");
        loginPageFactory.submitLoginForm();
        driver.manage().window().maximize();


        DashboardPageFactory dashboardPageFactory = new DashboardPageFactory(driver);
        Actions ac = new Actions(driver);
        ac.moveToElement(driver.findElement(By.xpath("//*[@id='menu-settings']/a/div[3]")))
                .moveToElement(driver.findElement(By.xpath("//*[@id='menu-users']/a/div[3]")))
                .moveToElement(driver.findElement(By.xpath("//*[@id='menu-plugins']/a/div[3]")))
                .moveToElement(driver.findElement(By.xpath("//*[@id='menu-appearance']/a")))
                .moveToElement(driver.findElement(By.xpath("//*[@id='menu-settings']/a/div[3]")))
                .moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-settings\"]/ul/li[8]/a")))
                .click().perform();

        assertThat(driver.getCurrentUrl()).contains("/options-privacy.php");
    }
}
