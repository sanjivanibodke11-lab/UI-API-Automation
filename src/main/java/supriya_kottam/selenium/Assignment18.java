package supriya_kottam.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assignment18 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\IdeaProjects\\NIT-9AM-June2026\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/auth/forgot-password");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("kottamsupriya532@gmail.com");
        driver.findElement(By.className("btnSubmit")).click();
    }
}


//Go to : https://practicesoftwaretesting.com/auth/forgot-password
//& type email and click reset password.