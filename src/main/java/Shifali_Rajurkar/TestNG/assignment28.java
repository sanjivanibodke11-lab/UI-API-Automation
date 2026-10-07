package Shifali_Rajurkar.TestNG;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class assignment28 {

    @Test
    public void passwordPresent(){
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

        String s = driver.findElement(By.xpath("//h3[text()='Login']")).getText();
        Assertions.assertThat(s).contains("Login");
        System.out.println("User on login page");

    }
}
