package Infrastructure.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public  MainPage openMainPage(String url){
        driver.get(url);
        return this;
    }

    public LoginPage navigateToLoginPage() {
        driver.findElement(By.xpath("//div/ul/li[1]/a[text()='Log in']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.urlContains("/wp-login.php"));
        return new LoginPage(driver);
    }
}
