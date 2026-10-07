package anitha.selenium;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
public class SearchforPliers {
    public static void main(String[]args){
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement  element = driver.findElement(By.xpath("//input[@data-test='search-query']"));
        element.sendKeys("Pliers");
        WebElement D=driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
        String s = driver.findElement(By.xpath("//h3[text()='Searched for: ']")).getText();
        Assertions.assertThat(s).contains("Pliers");
        System.out.println(s);
        int count = driver.findElements(By.xpath("//a[@class='card']")).size();
        System.out.println(count);

    }
}
