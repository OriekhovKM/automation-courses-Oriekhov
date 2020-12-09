package Infrastructure.pages.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPageFactory {
    @FindBy(xpath = "//*[@id='user_login']")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id='user_pass']")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id='wp-submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id='login_error']")
    private WebElement errorMsgTitle;

    WebDriver driver;

    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public LoginPageFactory populateLoginNameField(String name) {
        loginField.sendKeys(name);
        return this;
    }

    public LoginPageFactory populateLoginPasswordField (String pass){
            passwordField.sendKeys(pass);
            return this;
    }

    public DashboardPageFactory submitLoginForm (){
            submitButton.click();
            return new DashboardPageFactory(driver);
    }

public LoginPageFactory submitLoginFormFail(){
    new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButton.click();
        return this;
}

    public void  verifyLoginErrorMsg(String errorMsg) {
        assertThat(errorMsgTitle.getText())
                .isEqualTo(errorMsg);
    }

    public String getErrorMsg() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(errorMsgTitle));
        return errorMsgTitle.getText();
    }
}
