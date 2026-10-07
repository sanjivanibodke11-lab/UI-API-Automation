package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class chromeOptions {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless=new");
        options.addArguments("--incognito");
//        options.addArguments("--window-size=1920,1080");
//        options.addExtensions(new File("path to crx file"));
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://practicesoftwaretesting.com/auth/register");
        System.out.println(driver.getTitle());
    }
}
