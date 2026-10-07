package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        String path = System.getProperty("user.dir");
        ChromeDriver driver = new ChromeDriver();
        driver.get(path+"\\src\\test\\java\\Selenium\\test.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("text")).sendKeys("Hi");

//        driver.switchTo().frame(0); //switching using index of the frame
//        driver.switchTo().frame("iFrame"); //switching using name attribute's value of the iframe tag
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iFrame']")));
        driver.findElement(By.name("IframeText"))
                .sendKeys("Hello");
        driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();
        driver.findElement(By.name("checkbox")).click();
    }
}
