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
}
