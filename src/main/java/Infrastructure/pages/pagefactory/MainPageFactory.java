package Infrastructure.pages.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageFactory {
    @FindBy(xpath = "//a[text()='Log in']")
    private WebElement loginTitle;
    WebDriver driver;

    public MainPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPageFactory openMainPage(String url){
        driver.get(url);
        return this;
    }

    public LoginPageFactory navigateToLoginPage() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(loginTitle));
        loginTitle.click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("/wp-login.php"));
        return new LoginPageFactory(driver);
    }
}
