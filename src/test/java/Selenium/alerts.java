package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws Exception {
        ChromeDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        WebDriver d = new WebDriver();
        String path = System.getProperty("user.dir"); //retrieve the path to the project
        System.out.println(path);
        driver.get(path+"\\src\\test\\java\\Selenium\\test.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("alert")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept(); //clicks OK
        driver.findElement(By.name("confirm")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss(); //clicks Cancel
        driver.findElement(By.name("prompt")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();
        System.out.println(driver.switchTo().alert().getText());
    }
}
