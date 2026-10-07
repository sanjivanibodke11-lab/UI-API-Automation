package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class nameTagName {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("email"))
                .sendKeys("NIT9AMJune2026@gmail.com");
        driver.findElement(By.name("pass"))
                .sendKeys("0123456789");

        List<WebElement> elements = driver.findElements(By.tagName("input"));
        System.out.println(elements.size());
    }
}
