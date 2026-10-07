package Shifali_Rajurkar.Selenium_Assignment;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class assignment24 {
    public  static  void main(String args[]){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://practicesoftwaretesting.com/");
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Pliers");
        driver.findElement(By.xpath("//button[@data-test='search-submit']")).click();
        String productname = driver.findElement(By.xpath("//h3[text()='Searched for: ']")).getText();
        System.out.println("Product name :"+productname);
        int count = driver.findElements(By.xpath("//a[@class='card']")).size();
        System.out.println(count);
        Assertions.assertThat(productname).contains("Pliers");
    }
}
