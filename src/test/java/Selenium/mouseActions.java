package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.name("email"));
        Actions actions = new Actions(driver);
        actions.sendKeys(email,"hi").doubleClick(email).contextClick(email)
                .build().perform();
    }
}


/*
Mouse Actions :
Left Click - click()
Right Click - contextClick()
Double Click - doubleClick()
Scroll - moveToElement(), moveByOffset(x-coordinate, y-coordinate)
Drag and Drop - dragAndDrop(), dragAndDropBy()
Click and Hold - clickAndHold()
Release - release()
 */