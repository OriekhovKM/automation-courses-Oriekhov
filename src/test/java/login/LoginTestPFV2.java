package login;

import Infrastructure.base.TestBase;
import Infrastructure.data.User;
import Infrastructure.data.UserNotFoundException;
import Infrastructure.pages.pagefactory.DashboardPageFactory;
import Infrastructure.pages.pagefactory.LoginPageFactory;
import Infrastructure.pages.pagefactory.MainPageFactory;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class LoginTestPFV2 extends TestBase {

    @Test
    public void positiveTest() throws UserNotFoundException {
        User admin = users.findUserByName("admin");
        MainPageFactory mainPageFactory = new MainPageFactory(driver);
        mainPageFactory.openMainPage(server.getUrl());

        logger.log("guest user navigate to login page");
        mainPageFactory.navigateToLoginPage();

        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);

        logger.log("guest user populate login name form with - ");
        loginPageFactory.populateLoginNameField(admin.getUserName());

        logger.log("guest user populate login password form with - ");
        loginPageFactory.populateLoginPasswordField(admin.getUserPassword());

        logger.log("guest user submits login  form");
        loginPageFactory.submitLoginForm();

        DashboardPageFactory dashboardPageFactory = new DashboardPageFactory(driver);

        Assertions.assertThat(dashboardPageFactory.getLoggedUserTittle()).isEqualTo("Howdy, admin");
    }

    @Test
    public void emptyLoginTest(){
        MainPageFactory mainPageFactory = new MainPageFactory(driver);
        mainPageFactory.openMainPage(server.getUrl());

        logger.log("guest user navigate to login page");
        mainPageFactory.navigateToLoginPage();

        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);

        logger.log("guest user populate login name form with - ");
        loginPageFactory.populateLoginNameField("");

        logger.log("guest user populate login password form with - ");
        loginPageFactory.populateLoginPasswordField("77777");

        logger.log("guest user submits login  form");
        loginPageFactory.submitLoginFormFail();
        Assertions.assertThat(loginPageFactory.getErrorMsg()).isEqualTo("Error: The username field is empty.");
    }

    @Test
    public void emptyPasswordTest(){
        MainPageFactory mainPageFactory = new MainPageFactory(driver);
        mainPageFactory.openMainPage(server.getUrl());
        mainPageFactory.navigateToLoginPage();

        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.populateLoginNameField("admin");
        loginPageFactory.populateLoginPasswordField("");
        loginPageFactory.submitLoginFormFail();
        Assertions.assertThat(loginPageFactory.getErrorMsg()).isEqualTo("Error: The password field is empty.");
    }
//    @Test
//    public void positiveLoginTest(){
//        MainPage mainPage = new MainPage(driver);
//
//        mainPage.openMainPage(server.getUrl())
//                .navigateToLoginPage().populateLoginNameField("admin")
//                .populateLoginPasswordField("admin")
//                .submitLoginForm()
//                .verifyIsLoggedIn();
//    }
//
//    @Test
//    public void incorrectPasswordTest(){
//        MainPage mainPage = new MainPage(driver);
//
//        mainPage.openMainPage(server.getUrl())
//                .navigateToLoginPage().populateLoginNameField("admin")
//                .populateLoginPasswordField("admin111")
//                .submitLoginFormFail().verifyLoginErrorMsg("Error: The password you entered for the username admin is incorrect. Lost your password?");
//    }
//
//    @Test
//    public void emptyLoginPasswordTest(){
//        MainPage mainPage = new MainPage(driver);
//
//        mainPage.openMainPage(server.getUrl())
//                .navigateToLoginPage().populateLoginNameField("")
//                .populateLoginPasswordField("")
//                .submitLoginFormFail()
//                .verifyLoginErrorMsg("Error: The username field is empty.\nError: The password field is empty.");
//    }
}
