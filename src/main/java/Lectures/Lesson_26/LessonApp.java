package Lectures.Lesson_26;

import Infrastructure.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class LessonApp {
    public static void main(String[] args) {
        List<WebElement> goods = new ArrayList<>();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rozetka.com.ua/");

        WaitUtils.waitABit(10_000);

        List<WebElement> items = driver.findElements(By.xpath("//app-tile/div/div/a[1]/.."));
        System.out.println("items size -" + items.size());

        for (WebElement el: items){
            if(el.getText().contains("Зонт")){
                goods.add(el);
            }
        }

        System.out.println("goods size -" +goods.size());
        driver.quit();
    }
}
