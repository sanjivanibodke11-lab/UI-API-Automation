package GaddamAravind21.selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class assignment24 {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("search-query")).sendKeys("Pliers");
        driver.findElement(By.xpath("//button[@data-test='search-submit']")).click();

        List<WebElement> elements = driver.findElements(By.xpath("//h5[@class='card-title']"));
        String s = driver.findElement(By.xpath("//span[@data-test='search-term']")).getText();
        Assertions.assertThat(s).contains("Pliers");
        System.out.println(s);
        int total = elements.size();
        System.out.println("Total products found: " + total);

    }
}