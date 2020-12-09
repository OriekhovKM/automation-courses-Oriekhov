package Infrastructure.pages.pageobjectclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.Assertions.assertThat;

public class DashboardPage {
    WebDriver driver;
    WebDriverWait wait;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void verifyIsLoggedIn() {
        wait.until(ExpectedConditions.urlContains("wp-admin/"));
        assertThat(driver.findElement(By.xpath("//li[@id='wp-admin-bar-my-account']")).getText()).isEqualTo("Howdy, admin");
    }
}
