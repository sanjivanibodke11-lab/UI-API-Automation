package Anusha.Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class clickForgetPwd {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/auth/forgot-password");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Assertions.assertThat(driver.getCurrentUrl()).contains("forgot-password");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("anusha.tk@yahoo.com");
        driver.findElement(By.className("btnSubmit"))
                .click();
    }
}
