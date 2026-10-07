package Rudrani.M.SAMPLE.selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class assignment26 {
    @Test
    public void logout(){
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.linkText("Sign in"))
                .click();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("admin@practicesoftwaretesting.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("welcome01");
        driver.findElement(By.className("btnSubmit"))
                .click();
        String s = driver.findElement(By.xpath("//h1[@data-test='page-title']")).getText();
        Assertions.assertThat(s.contains("Sales over the years")).isTrue();
        System.out.println("Logged in");
        driver.findElement(By.xpath("//button[@id='menu']"))
                .click();

        driver.findElement(By.xpath("//a[text()='Sign out']"))
                .click();


        String sr = driver.findElement(By.xpath("//a[@data-test='nav-sign-in']")).getText();
        Assertions.assertThat(sr.contains("Sign in")).isTrue();

        System.out.println("logged out");
    }
}
