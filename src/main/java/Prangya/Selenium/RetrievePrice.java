package Prangya.Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RetrievePrice {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement element = driver.findElement(By.xpath("//span[@data-test='product-price']"));
        String s = element.getText();
        System.out.println(s);
        WebElement product = driver.findElement(By.xpath("//h5[@data-test='product-name']"));
        String s1= product.getText();
        Assertions.assertThat(s1.contains("Combination Pliers")).isTrue();
        System.out.println("Combination Pliers");

    }
}
