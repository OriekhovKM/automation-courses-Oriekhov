package Infrastructure.pages.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommentSubmissionFailPageFactory {
    WebDriver driver;
    @FindBy(xpath = "//*[@id='error-page']/div/p")
    private WebElement commentErrorMessage;


    public CommentSubmissionFailPageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public String getCommentErrorMessage() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("/wp-comments-post.php"));
        return commentErrorMessage.getText();
    }


}
