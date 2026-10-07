package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class windowHandling {
    public static void main(String[] args) throws Exception{
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.linkText("Meta Pay"))
                .click();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.findElement(By.name("email")).sendKeys("Hello world!!!!");
        String window = driver.getWindowHandle();
        System.out.println(window);
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);

        ArrayList<String> al = new ArrayList<>();
        for(String s: windows){
            al.add(s);
        }
        driver.switchTo().window(al.get(0));
        Thread.sleep(5000);
        driver.switchTo().window(al.get(1));
//        driver.close();
        driver.quit();
    }
}
