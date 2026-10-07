package Shifali_Rajurkar.TestNG;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeDriverMethod {
    public WebDriver driver;
    public WebDriver openBrowser() {

        ChromeDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practicesoftwaretesting.com/");

        return driver;
    }

    public WebDriver closeBrowser(){
        driver.quit();
        return driver;
    }
}
