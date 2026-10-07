package Shifali_Rajurkar.Selenium_Assignment;

import Shifali_Rajurkar.TestNG.ChromeDriverMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class automateChatbot {
    public static void main(String args[]) throws InterruptedException {
        ChromeDriverMethod common = new ChromeDriverMethod();
        WebDriver driver = common.openBrowser();
        driver.get("https://practicesoftwaretesting.com/");
        driver.findElement(By.xpath("//button[@aria-label='Open chat']")).click();
        driver.findElement(By.xpath("//button[text()=' Find a product ']")).click();
        WebElement chat = driver.findElement(By.xpath("//input[@data-test='chat-input']"));
        chat.sendKeys("screw");
        driver.findElement(By.xpath("//input[@data-test='chat-input']//following-sibling::button")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
