package GaddamAravind21.TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class assignment27 {

    WebDriver driver;

    @BeforeMethod
    public void navigate() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void dropdown() {

        driver.findElement(
                By.xpath("//button[@aria-label='Select language']")
        ).click();
    }

    public void language(String text) {

        driver.findElement(
                By.xpath("//a[text()='" + text + "']")
        ).click();
    }

    @Test
    public void firstLanguage() {
        dropdown();
        language("DE");
    }

    @Test
    public void secondLanguage() {
        dropdown();
        language("EN");
    }

    @Test
    public void thirdLanguage() {
        dropdown();
        language("ES");
    }

    @Test
    public void fourthLanguage() {
        dropdown();
        language("FR");
    }

    @Test
    public void fifthLanguage() {
        dropdown();
        language("NL");
    }

    @Test
    public void sixthLanguage() {
        dropdown();
        language("TR");
    }

    @Test
    public void seventhLanguage() {
        dropdown();
        language("EL");
    }
}