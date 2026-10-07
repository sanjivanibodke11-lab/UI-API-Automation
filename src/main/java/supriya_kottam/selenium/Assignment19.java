package supriya_kottam.selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assignment19 {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://practicesoftwaretesting.com/auth/forgot-password");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.linkText("Privacy Policy")).click();

    }
}


//Go to : https://practicesoftwaretesting.com/auth/forgot-password & then
//navigate to Privacy Policy.