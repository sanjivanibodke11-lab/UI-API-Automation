package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class keyboardActions {

    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("pass"));
        Actions actions = new Actions(driver);
        actions.sendKeys(email,"nit9am@gmail.com")
                .keyDown(Keys.CONTROL).sendKeys("a") //ctrl+a
                .sendKeys("c").keyUp(Keys.CONTROL)
                .click(password).keyDown(Keys.CONTROL).sendKeys("v")
                .build().perform();
    }
}

/*
Press Key - keyDown()
Release Key - keyUp()
Type - sendKeys()
 */