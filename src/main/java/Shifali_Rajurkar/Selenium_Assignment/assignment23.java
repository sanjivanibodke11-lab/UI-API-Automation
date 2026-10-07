package Shifali_Rajurkar.Selenium_Assignment;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class assignment23 {
    public static  void main(String args[]){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://practicesoftwaretesting.com/");
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Combination Pliers");
        driver.findElement(By.xpath("//button[@data-test='search-submit']")).click();
        String productname = driver.findElement(By.xpath("//h5[@data-test='product-name']")).getText();
        String actualPrice = driver.findElement(By.xpath("//span[@data-test='product-price']")).getText();
        System.out.println("Combination Pliers Price: " + actualPrice);
        Assertions.assertThat(productname.contains("Combination Pliers")).isTrue();
    }
}
