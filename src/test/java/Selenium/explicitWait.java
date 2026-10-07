package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitWait {
    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir");
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get(filePath+"\\src\\test\\java\\Selenium\\test.html");
        driver.manage().window().maximize();
        WebElement delay = driver.findElement(By.name("delay"));
        delay.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        driver.findElement(By.id("button")).click();
        WebElement result = driver.findElement(By.id("result"));
        wait.until(ExpectedConditions.textToBePresentInElement(result,"Hello World!!!"));
        System.out.println("Text is visible");
        driver.navigate().to("https://www.facebook.com/");
        WebElement moreLang = driver.findElement(By.linkText("More languages…"));
        wait.until(ExpectedConditions.visibilityOf(moreLang));
        moreLang.click();

        WebElement filipino = driver.findElement(By.xpath("//div[text()='Bisaya']"));
        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOf(filipino));
        actions.moveToElement(filipino);
        filipino.click();

    }
}
