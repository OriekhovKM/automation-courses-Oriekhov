package login;

import Infrastructure.base.TestBase;
import Infrastructure.data.User;
import Infrastructure.pages.pagefactory.LoginPageFactory;
import Infrastructure.pages.pagefactory.MainPageFactory;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParametrizedLoginTestPF extends TestBase {
    private String userId;

    public ParametrizedLoginTestPF(String userId) {
        this.userId = userId;
    }

    @Parameterized.Parameters
    public static Collection ControlDataForNegativeTests()  {
        return Arrays.asList(new Object[][]{
                {"emptyLoginAndPassword"},
                {"emptyLogin"},
                {"emptyPassword"},
                {"incorrectPassword"},
                {"incorrectUserName"}
        });
    }

    @Test
    public void negativeLoginTests()  {
        MainPageFactory mainPageFactory = new MainPageFactory(driver);
        mainPageFactory.openMainPage(server.getUrl());
        logger.log("guest user navigate to login page");
        mainPageFactory.navigateToLoginPage();

        User user = users.findUserByID(userId);
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);

        logger.log("guest user populate login name form with - " +user.getUserName());
        loginPageFactory.populateLoginNameField(user.getUserName());

        logger.log("guest user populate login password form with - " +user.getUserPassword());
        loginPageFactory.populateLoginPasswordField(user.getUserPassword());
        loginPageFactory.submitLoginFormFail();
        Assertions.assertThat(loginPageFactory.getErrorMsg()).isEqualTo(user.getExpectedCondition());
    }

}



