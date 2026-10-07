package Anusha.Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginLogout {
    @Test
    public void login() {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.cssSelector("#email"))
                .sendKeys("admin@practicesoftwaretesting.com");
        driver.findElement(By.cssSelector("#password"))
                .sendKeys("welcome01");
        driver.findElement(By.cssSelector(".btnSubmit"))
                .click();
        String s = driver.findElement(By.xpath("//h1[@data-test='page-title']")).getText();
        Assertions.assertThat(s.contains("Sales over the years")).isTrue();
        System.out.println("logged in");
        //button[@id='menu']
        driver.findElement(By.xpath("//button[@id='menu']"))
                .click();
        driver.findElement(By.xpath("//a[text()='Sign out']"))
                .click();
        String s1 = driver.findElement(By.xpath("//a[@data-test='nav-sign-in']")).getText();
        Assertions.assertThat(s1.contains("Sign in")).isTrue();
        System.out.println("logged out");
    }
}
