package Infrastructure.pages.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPageFactory {
    @FindBy(xpath = "//li[@id='wp-admin-bar-my-account']")
    private WebElement dashboardPageTitle;
    @FindBy(xpath = "//li[@id='menu-comments']")
    private WebElement menuComment;
    @FindBy(xpath = "//input[@id= 'cb-select-all-1']")
    private WebElement labelSelectAuthors;
    @FindBy(xpath = "//*[@id='bulk-action-selector-bottom']/option[@value = 'trash']")
    private WebElement moveToTrashButton;
    @FindBy(xpath = "//*[@id='doaction2']")
    private WebElement commentSubmit;

    WebDriver driver;
    WebDriverWait wait;

    public DashboardPageFactory(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public String getLoggedUserTittle() {
        wait.until(ExpectedConditions.urlContains("wp-admin/"));
        return dashboardPageTitle.getText();
    }

    public void navigateToMenuComment(){
        wait.until(ExpectedConditions.elementToBeClickable(menuComment));
        menuComment.click();
    }



    public void selectAuthors(){
        wait.until(ExpectedConditions.elementToBeClickable(labelSelectAuthors));
        labelSelectAuthors.click();
    }

    public void deleteComments(){
        wait.until(ExpectedConditions.elementToBeClickable(moveToTrashButton));
        moveToTrashButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(commentSubmit));
        commentSubmit.click();
    }


}
