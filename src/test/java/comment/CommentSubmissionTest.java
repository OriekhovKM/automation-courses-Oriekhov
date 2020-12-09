package comment;

import Infrastructure.base.TestBase;
import Infrastructure.data.User;
import Infrastructure.pages.pagefactory.DashboardPageFactory;
import Infrastructure.pages.pagefactory.LoginPageFactory;
import Infrastructure.pages.pagefactory.MainPageFactory;
import Infrastructure.pages.pagefactory.PostPageFactory;
import org.assertj.core.api.SoftAssertions;
import org.junit.After;
import org.junit.Test;

public class CommentSubmissionTest extends TestBase {



    @Test
    public void positiveCommentTest()  {
        MainPageFactory mainPageFactory = new MainPageFactory(driver);
        mainPageFactory.openMainPage(server.getUrl());
        logger.log("guest user navigate to post page");
        mainPageFactory.navigateToPostPage();
        User user = users.findUserByID("positivePostTest");
        PostPageFactory postPageFactory = new PostPageFactory(driver);
        logger.log("guest user populate  name form with - " +user.getUserName());
        postPageFactory.populateNameField(user.getUserName());

        logger.log("guest user populate email form with - " +user.getUserEmail());
        postPageFactory.populateEmailField(user.getUserEmail());

        logger.log("guest user write comment - first comment" );
        postPageFactory.writeComment("first comment");

        logger.log("guest user submits comment");
        postPageFactory.submitComment();

        logger.log("check comment " +postPageFactory.getUserName());
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(postPageFactory.getUserName()).isEqualTo(user.getUserName());
        softAssertions.assertThat(postPageFactory.getUserComment()).isEqualTo(user.getExpectedCondition());
        softAssertions.assertAll();
    }

    @After
    public void deleteComment(){
        MainPageFactory mainPageFactory = new MainPageFactory(driver);
        mainPageFactory.openMainPage(server.getUrl());
        mainPageFactory.navigateToLoginPage();
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        User admin = users.findUserByID("10");

        logger.log("admin delete comment - go to login page");
        loginPageFactory.populateLoginNameField(admin.getUserName());
        loginPageFactory.populateLoginPasswordField(admin.getUserPassword());
        loginPageFactory.submitLoginForm();

        logger.log("admin delete comment - go to dashboard page");
        DashboardPageFactory dashboardPageFactory = new DashboardPageFactory(driver);
        dashboardPageFactory.navigateToMenuComment();
        dashboardPageFactory.selectAuthors();
        dashboardPageFactory.deleteComments();
        logger.log("comment was deleted ");
    }

}
