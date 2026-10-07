package Anusha.Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class retrievePrice {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement Product = driver.findElement(By.xpath("//input[@id='search-query']"));
        Product.sendKeys("Combination Pliers");
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']"))
                .click();
        String title = driver.findElement(By.xpath("//h5[@class='card-title']")).getText();
        Assertions.assertThat(title).contains("Combination Pliers");
        String price = driver.findElement(By.xpath("//span[@data-test='product-price']")).getText();
        System.out.println("Price: " + price);
    }
}
