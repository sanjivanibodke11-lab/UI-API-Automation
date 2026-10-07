package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class dropdown {
    @Test
    public void dropdowns(){
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement dropDownElement = driver.findElement(By.xpath("//select[@data-test='sort']"));
        Select select = new Select(dropDownElement);
//        select.selectByIndex(2);
//        select.selectByValue("price,desc");
//        select.selectByVisibleText("CO₂ Rating (A - E)");
//        select.selectByContainsVisibleText("Name (Z");
        List<WebElement> options = select.getOptions();
        System.out.println(options.size());
        for(WebElement w: options){
            System.out.println(w.getText());
        }
    }
}
