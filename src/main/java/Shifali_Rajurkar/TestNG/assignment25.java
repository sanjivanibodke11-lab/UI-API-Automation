package Shifali_Rajurkar.TestNG;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class assignment25 {
    @Test
    public void loginTest() {
        ChromeDriverMethod obj = new ChromeDriverMethod();
        WebDriver driver = obj.openBrowser();

        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("admin@practicesoftwaretesting.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("welcome01");
        driver.findElement(By.cssSelector(".btnSubmit")).click();
        String heading = driver.findElement(By.xpath("//h1[text()='Sales over the years']")).getText();
        Assertions.assertThat(heading.contains("Sales over the years")).isTrue();
        System.out.println("User logged in successfully");

    }
}
