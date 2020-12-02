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

    @FindBy(xpath = "//input[@class = 'search-submit']")
            private  WebElement searchSubmit;

    @FindBy(xpath = "//input[@id ='search-form-1']")
    private  WebElement searchField;

    @FindBy(xpath = "//div[@class = 'archive-subtitle section-inner thin max-percentage intro-text']")
    private  WebElement searchResult;

    @FindBy(xpath = "//*[@id='post-64']/header/div/h2/a")
    private  WebElement postTitle;

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

    public void populateSearchField(String request) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(searchField));
        searchField.sendKeys(request);
    }

    public void submitSearchRequest(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(searchSubmit));
        searchSubmit.click();
    }

    public String getSearchResultMsg() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(searchResult));
        return searchResult.getText();
    }

    public PostPageFactory navigateToPostPage() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(postTitle));
        postTitle.click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("/rocketdyne-f-1/"));
        return new PostPageFactory(driver);
    }
}
