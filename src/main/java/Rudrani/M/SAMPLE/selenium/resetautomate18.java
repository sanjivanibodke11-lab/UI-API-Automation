package Rudrani.M.SAMPLE.selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
public class resetautomate18 {
        public static void main(String[] args){
            ChromeDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://practicesoftwaretesting.com/auth/login");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            driver.findElement(By.partialLinkText("Password?"))
                    .click();
            WebElement email = driver.findElement(By.id("email"));
            email.sendKeys("abcd2345");
            driver.findElement(By.className("btnSubmit"))
                    .click();
        }
    }

