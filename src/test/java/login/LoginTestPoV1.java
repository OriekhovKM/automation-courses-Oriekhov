package login;

import Infrastructure.base.TestBase;
import Infrastructure.pages.MainPage;
import org.junit.Test;

public class LoginTestPoV1 extends TestBase {
    @Test
    public void positiveLoginTest(){
        MainPage mainPage = new MainPage(driver);

        mainPage.openMainPage(server.getUrl())
                .navigateToLoginPage().populateLoginNameField("admin")
                .populateLoginPasswordField("admin")
                .submitLoginForm()
                .verifyIsLoggedIn();
    }

    @Test
    public void incorrectPasswordTest(){
        MainPage mainPage = new MainPage(driver);

        mainPage.openMainPage(server.getUrl())
                .navigateToLoginPage().populateLoginNameField("admin")
                .populateLoginPasswordField("admin111")
                .submitLoginFormFail().verifyLoginErrorMsg("Error: The password you entered for the username admin is incorrect. Lost your password?");
    }

    @Test
    public void emptyLoginPasswordTest(){
        MainPage mainPage = new MainPage(driver);

        mainPage.openMainPage(server.getUrl())
                .navigateToLoginPage().populateLoginNameField("")
                .populateLoginPasswordField("")
                .submitLoginFormFail()
                .verifyLoginErrorMsg("Error: The username field is empty.\nError: The password field is empty.");
    }
}
