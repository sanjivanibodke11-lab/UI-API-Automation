package anitha.selenium;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
public class ForgotPassword {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.className("ForgetPwd")).click();
          WebElement email = driver.findElement(By.id("email"));
        //Enter email
       email.sendKeys("kavalianitha5@gmail.com");
        driver.findElement(By.className("btnSubmit")).click();
    }
    }

///
//