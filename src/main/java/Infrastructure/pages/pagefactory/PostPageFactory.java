package Infrastructure.pages.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostPageFactory {
    @FindBy(xpath = "//input[@id = 'author']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@id = 'email']")
    private WebElement emailField;

    @FindBy(xpath = "//textarea[@id = 'comment']")
    private WebElement commentField;

    @FindBy(xpath = "//input[@id = 'submit']")
    private WebElement submitComment;

    WebDriver driver;

    public PostPageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public PostPageFactory populateNameField(String name) {
        nameField.sendKeys(name);
        return this;
    }

    public PostPageFactory populateEmailField (String email){
        emailField.sendKeys(email);
        return this;
    }

    public void  submitComment (){
        submitComment.click();
    }

    public CommentSubmissionFailPageFactory submitFailComment(){
        submitComment.click();
        return new CommentSubmissionFailPageFactory(driver);
    }
}
