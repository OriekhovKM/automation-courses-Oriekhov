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

        DashboardPageFactory dashboardPageFactory = new DashboardPageFactory(driver);

        Assertions.assertThat(dashboardPageFactory.getLoggedUserTittle()).isEqualTo("Howdy, admin");
    }

    @Test
    public void emptyLoginTest() throws UserNotFoundException{
        User admin = users.findUserByID("11");
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
        loginPageFactory.submitLoginFormFail();
        Assertions.assertThat(loginPageFactory.getErrorMsg()).isEqualTo("Error: The username field is empty.");
    }

    @Test
    public void emptyPasswordTest() throws UserNotFoundException{
        User admin = users.findUserByID("12");
        MainPageFactory mainPageFactory = new MainPageFactory(driver);
        mainPageFactory.openMainPage(server.getUrl());

        logger.log("guest user navigate to login page");
        mainPageFactory.navigateToLoginPage();

        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        logger.log("guest user populate login name form with - " +admin.getUserName());
        loginPageFactory.populateLoginNameField(admin.getUserName());

        logger.log("guest user populate login password form with - " +admin.getUserPassword());
        loginPageFactory.populateLoginPasswordField(admin.getUserPassword());
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
