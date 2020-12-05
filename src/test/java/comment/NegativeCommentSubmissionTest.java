package comment;

import Infrastructure.base.TestBase;
import Infrastructure.data.User;
import Infrastructure.pages.pagefactory.MainPageFactory;
import Infrastructure.pages.pagefactory.PostPageFactory;
import Infrastructure.utils.WaitUtils;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class NegativeCommentSubmissionTest extends TestBase {

    private String userId;

    public NegativeCommentSubmissionTest(String userId) {
        this.userId = userId;
    }

    @Parameterized.Parameters
    public static Collection ControlDataForNegativeTests() {
        return Arrays.asList(new Object[][]{
                {"emptyNameAndEmail"},
                {"emptyName"},
                {"emptyEmail"},
                {"emptyComment"},
                {"allFieldsEmpty"},
                {"notValidEmail"}
        });
    }

    @Test
    public void negativeCommentTests()  {
        MainPageFactory mainPageFactory = new MainPageFactory(driver);
        mainPageFactory.openMainPage(server.getUrl());
        WaitUtils.waitForLoad(driver);
        User user = users.findUserByID(userId);
        logger.log("guest user navigate to post page");
        mainPageFactory.navigateToPostPage();

        PostPageFactory postPageFactory = new PostPageFactory(driver);
        logger.log("guest user populate  name form with - " +user.getUserName());
        postPageFactory.populateNameField(user.getUserName());

        logger.log("guest user populate email form with - " +user.getUserEmail());
        postPageFactory.populateEmailField(user.getUserEmail());

        logger.log("guest user write comment - " +user.getUserPassword() );
        postPageFactory.writeComment(user.getUserPassword());

        logger.log("guest user submits comment");
        postPageFactory.submitFailComment();


//        CommentSubmissionFailPageFactory commentFail = new CommentSubmissionFailPageFactory(driver);
//        Assertions.assertThat(commentFail.getCommentErrorMessage()).isEqualTo(user.getExpectedCondition());

        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("/wp-comments-post.php"));
        Assertions.assertThat(driver.findElement(By.xpath("//*[@id='error-page']/div/p")).getText()).isEqualTo(user.getExpectedCondition());
    }
}
