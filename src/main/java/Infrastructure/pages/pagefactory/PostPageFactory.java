package Infrastructure.pages.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PostPageFactory {
    @FindBy(xpath = "//input[@id = 'author']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@id = 'email']")
    private WebElement emailField;

    @FindBy(xpath = "//textarea[@id = 'comment']")
    private WebElement commentField;

    @FindBy(xpath = "//input[@id = 'submit']")
    private WebElement submitComment;

    @FindBy(xpath = "//span[@class='fn']")
    private WebElement userName;

    @FindBy(xpath = "//div[@class='comment-content entry-content']")
    private WebElement userComment;


    WebDriver driver;

    public PostPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public PostPageFactory populateNameField(String name) {
        nameField.sendKeys(name);
        return this;
    }

    public PostPageFactory populateEmailField (String email){
        emailField.sendKeys(email);
        return this;
    }

    public PostPageFactory writeComment (String comment){
        commentField.sendKeys(comment);
        return this;
    }

    public void  submitComment (){
        submitComment.click();
    }

    public CommentSubmissionFailPageFactory submitFailComment(){
        submitComment.click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("/wp-comments-post.php"));
        return new CommentSubmissionFailPageFactory(driver);
    }

    public String getUserName(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("comment-"));
        return userName.getText();
    }

    public String getUserComment(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("comment-"));
        return userComment.getText();
    }
}
