package Rudrani.M.SAMPLE.selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class assignment24 {
    public static void main(String[] args){
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement search = driver.findElement(By.id("search-query"));
        search.sendKeys("pliers");
        driver.findElement(By.xpath("//button[@class='btn btn-secondary']"))
                .click();
        try{
            Thread.sleep(3000);
        }
        catch
            (Exception c) {
        }
        String title = driver.findElement(By.xpath("//h3[@data-test='search-caption']")).getText();
        Assertions.assertThat(title).contains("pliers");
        int count = driver.findElements(By.xpath("//a[@class='card']")).size();
        System.out.println("total pliers" + count);
        }
    }


