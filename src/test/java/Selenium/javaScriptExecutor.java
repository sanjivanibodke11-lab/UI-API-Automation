package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutor {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(System.getProperty("user.dir")+"\\src\\test\\java\\Selenium\\test.html");
        driver.manage().window().maximize();
        JavascriptExecutor jse = driver;
        driver.executeScript("document.getElementById('text').value='heyyyyy!!!!';");
        driver.executeScript("document.getElementById('Male').click();");
        WebElement text = driver.findElement(By.id("text2"));
        driver.executeScript("arguments[0].scrollIntoView();", text);
        driver.executeScript("window.open('https://www.facebook.com', '_blank');");

    }
}
