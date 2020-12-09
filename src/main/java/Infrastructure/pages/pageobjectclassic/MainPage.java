package Infrastructure.pages.pageobjectclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private By loginTitle = By.xpath("//a[text()='Log in']");
    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public  MainPage openMainPage(String url){
        driver.get(url);
        return this;
    }

    public LoginPage navigateToLoginPage() {
        driver.findElement(loginTitle).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("/wp-login.php"));
        return new LoginPage(driver);
    }
}
