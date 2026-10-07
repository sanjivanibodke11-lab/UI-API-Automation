package supriya_kottam.selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Assignment25 {
    @Test
    public void Login(){
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();

        driver.findElement(By.cssSelector("#email")).sendKeys("admin@practicesoftwaretesting.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("welcome01");
        driver.findElement(By.cssSelector(".btnSubmit")).click();

        String s = driver.findElement(By.xpath("//h1[text()='Sales over the years']")).getText();
        Assertions.assertThat(s.contains("Sales over the years")).isTrue();
        System.out.println("User logged in successfully");

    }
}


// Automate the Login flow on https://practicesoftwaretesting.com/ using TestNG & Assertions