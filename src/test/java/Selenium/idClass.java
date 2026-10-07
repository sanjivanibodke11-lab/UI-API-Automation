package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class idClass {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
//        FirefoxDriverManager.firefoxdriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/auth/login");
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));
        email.sendKeys("NIT9AMJune2026");
        password.sendKeys("0123456789");
        driver.findElement(By.className("btnSubmit"))
                .click();
    }
}
