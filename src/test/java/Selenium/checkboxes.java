package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class checkboxes {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tickets.paytm.com/flights/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
        WebElement checkBox = driver.findElement(By.xpath("//i[@role='checkbox']"));
        if(!checkBox.isSelected()){
            checkBox.click();
            System.out.println("Checked now");
        }
        else{
            System.out.println("Already checked");
        }
    }
}
