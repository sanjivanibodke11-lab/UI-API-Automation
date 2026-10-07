package Anusha.FrameWork.Testcases;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class axisTest {
    ChromeDriver driver;

    @BeforeMethod
    public void preCondition() {
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    @Test
    public void passaxisGreater() {
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));

        Point emailPoint = email.getLocation();
        int ex = emailPoint.getX();
        int ey = emailPoint.getY();
        System.out.println(ex + " " + ey);
        Point passwordPoint = password.getLocation();
        int px = passwordPoint.getX();
        int py = passwordPoint.getY();
        System.out.println(px + " " + py);
        System.out.println("Password " + py + " axis is greater then " + ey + " email axis then password input below the email");
        Assertions.assertThat(py).isGreaterThan(ey);
    }

    @AfterMethod
    public void postCondition() {
        driver.quit();
    }
}
