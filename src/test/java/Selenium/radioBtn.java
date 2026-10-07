package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioBtn {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://tickets.paytm.com/bus/");
        driver.manage().window().maximize();
        WebElement oneWay = driver.findElement(By.xpath("//input[@name='oneway']"));
        if(!oneWay.isSelected()) {
            oneWay.click();
        }
        else {
            System.out.println("Already selected");
        }
    }
}
