package GaddamAravind21.selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class assignment23 {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement productname = driver.findElement(By.xpath("//h5[@class='card-title']"));
        String s1 = productname.getText();
        System.out.println(s1);
        Assertions.assertThat(s1.contains("Combination Pliers")).isTrue();
        WebElement productprice = driver.findElement(By.xpath("//span[@data-test='product-price']"));
        String s2 = productprice.getText();
        System.out.println(s2);
    }
}