package Anusha.Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class retrieveCount {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement Product = driver.findElement(By.xpath("//input[@id='search-query']"));
        Product.sendKeys("Pliers");
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']"))
                .click();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        String title = driver.findElement(By.xpath("//h3[@data-test='search-caption']")).getText();
        Assertions.assertThat(title).contains("Pliers");
        int count = driver.findElements(By.xpath("//a[@class='card']")).size();
        System.out.println(count);
    }
}
