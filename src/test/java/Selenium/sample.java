package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\NiT\\IdeaProjects\\NIT-9AM-June2026\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
//        FirefoxDriver driver2 = new FirefoxDriver();
//        EdgeDriver driver3 = new EdgeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
        driver.navigate().to("https://google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
