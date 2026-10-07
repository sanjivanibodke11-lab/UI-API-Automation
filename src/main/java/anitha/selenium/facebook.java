package anitha.selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class facebook {

        public static void main(String[] args) {
            ChromeDriverManager.chromedriver().setup();
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            // Click Meta Quest using Partial Link Text
            driver.findElement(By.partialLinkText("Meta Quest"))
                    .click();
        }
}


///
///



