package Shifali_Rajurkar.Selenium_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class assignment_19 {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\potka\\IdeaProjects\\NIT-9AM-June2026\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/auth/forgot-password");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.linkText("Privacy Policy")).click();
    }
}
