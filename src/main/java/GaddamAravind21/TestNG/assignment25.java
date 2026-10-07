package GaddamAravind21.TestNG;

import org.assertj.core.api.Assertions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class assignment25 {
WebDriver driver;
    @Test
    public void loginFlow() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.navigate().to("https://practicesoftwaretesting.com/");

        driver.findElement(By.xpath("//a[@data-test='nav-sign-in']")).click();

        driver.findElement(By.id("email"));

        String s = driver.getCurrentUrl();

        //System.out.println(s);

        Assertions.assertThat(s).contains("login");

        driver.findElement(By.id("email"))
                .sendKeys("customer@practicesoftwaretesting.com");

        driver.findElement(By.id("password"))
                .sendKeys("welcome01");

        driver.findElement(By.xpath("//input[@data-test='login-submit']"))
                .click();
    }
}