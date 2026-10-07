package GaddamAravind21.selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class assignment20 {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        List<WebElement> metaLinks = driver.findElements(By.partialLinkText("Meta"));

        for (WebElement link : metaLinks) {
            if (link.getText().trim().equals("Meta Quest")) {
                link.click();
                break;
            }
        }
    }
}