package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class cssSelector {
    @Test
    public void css(){
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.cssSelector("#email"))
                .sendKeys("NIT9AMJun2026");
        driver.findElement(By.cssSelector("#password"))
                .sendKeys("0123456789");
        driver.findElement(By.cssSelector(".btnSubmit"))
                .click();
    }
}
