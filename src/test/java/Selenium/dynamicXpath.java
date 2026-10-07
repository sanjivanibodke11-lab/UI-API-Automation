package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class dynamicXpath {

    public String generateXpath(String text){
        return "//a[text()='".concat(text).concat("']");
    }


    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        dynamicXpath dxp = new dynamicXpath();
        String s = dxp.generateXpath("Sign in");
        System.out.println(s);
        driver.findElement(By.xpath(s)).click();
        s = dxp.generateXpath("Home");
        driver.findElement(By.xpath(s)).click();
        s = dxp.generateXpath("Contact");
        driver.findElement(By.xpath(s)).click();
    }
}
