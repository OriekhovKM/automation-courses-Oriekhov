package Infrastructure.pages.pageobjectclassic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage populateLoginNameField(String name) {
        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys(name);
        return this;
    }

    public LoginPage populateLoginPasswordField (String pass){
            driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys(pass);
            return this;
    }

    public DashboardPage submitLoginForm (){
            driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
            return new DashboardPage(driver);
    }

public LoginPage submitLoginFormFail(){
        driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
        return this;
}

    public void  verifyLoginErrorMsg(String errorMsg) {
        assertThat(driver.findElement(By.xpath("//*[@id=\"login_error\"]")).getText())
                .isEqualTo(errorMsg);
    }
}
