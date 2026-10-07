package anitha.TestNG;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
public class EmailandPasswordElement {
    @Test
    public void a() {
        System.out.println("Test Case:Verify Password is below Email");
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("password"));
        // Get X-axis positions
        Point emailPoint = email.getLocation();
        int x = emailPoint.getX();
        int y = emailPoint.getY();
        System.out.println(x + " " + y);

        // Get Y-axis positions
        Point passwordpoint = password.getLocation();
        int px = passwordpoint.getX();
        int py = passwordpoint.getY();
        System.out.println(px + " " + py);

// Verify Password is below Email
        System.out.println("Password Y-axis = " + py);
        System.out.println("Email Y-axis = " + y);
        // Verify Password is below Email
        Assertions.assertThat(py > y).isTrue();

        System.out.println("Password element is below the Email element.");

        // Verify Login heading
        String loginText = driver.findElement(
                By.xpath("//h3[text()='Login']")
        ).getText();

        Assertions.assertThat(loginText.contains("Login")).isTrue();

        System.out.println("User is on the Login page.");




    }
        }






//Assertions.assertThat(S1.contains("Combination Pliers")).isTrue();
//        System.out.println(S);

















////28. Prove that the Password element is present below the email element
///on https://practicesoftwaretesting.com/auth/login