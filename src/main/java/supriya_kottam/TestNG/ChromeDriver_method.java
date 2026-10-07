package supriya_kottam.TestNG;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChromeDriver_method {
    public WebDriver driver;
    @Test
    public WebDriver lang(){
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        return driver;
    }
    public void selectlang(){

        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();

    }
}
