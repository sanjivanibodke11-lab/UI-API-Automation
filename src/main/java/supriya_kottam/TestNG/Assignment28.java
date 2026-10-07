package supriya_kottam.TestNG;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Assignment28 {
    @Test
    public void passwordproof() {
        /*ChromeDriver_method c = new ChromeDriver_method();
        WebDriver driver = c.lang();*/
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));

        Point emailPoint = email.getLocation();
        int x = emailPoint.getX();
        int y = emailPoint.getY();

        System.out.println(x + " " + y);

        Point passwordPoint = password.getLocation();
        int px = passwordPoint.getX();
        int py = passwordPoint.getY();
        System.out.println(px + " " + py);
        System.out.println("Password " +py+ " axis is greater then " +y+ " email axis then password input below the email");

        String s = driver.findElement(By.xpath("//h3[text()='Login']")).getText();
        Assertions.assertThat(s).contains("Login");
        System.out.println("User referring to the login page");

    }
}


//28. Prove that the Password element is present below the email element
//on https://practicesoftwaretesting.com/auth/login