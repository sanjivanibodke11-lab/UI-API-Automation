package Anusha.FrameWork.Testcases;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class selectLanguages {
    ChromeDriver driver;
    @BeforeMethod
    public void preCondition(){
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    @Test
    public void selectDE() {
        driver.findElement(By.id("language")).click();
        driver.findElement(By.xpath("//a[text()='DE']")).click();
        String selectedLang = driver.findElement(By.id("language")).getText();
        Assertions.assertThat(selectedLang).contains("DE");
    }
    @Test
    public void selectEL() {
        driver.findElement(By.id("language")).click();
        driver.findElement(By.xpath("//a[text()='EL']")).click();
        String selectedLang = driver.findElement(By.id("language")).getText();
        Assertions.assertThat(selectedLang).contains("EL");
    }
    @Test
    public void selectEN() {
        driver.findElement(By.id("language")).click();
        driver.findElement(By.xpath("//a[text()='EN']")).click();
        String selectedLang = driver.findElement(By.id("language")).getText();
        Assertions.assertThat(selectedLang).contains("EN");
    }
    @Test
    public void selectES() {
        driver.findElement(By.id("language")).click();
        driver.findElement(By.xpath("//a[text()='ES']")).click();
        String selectedLang = driver.findElement(By.id("language")).getText();
        Assertions.assertThat(selectedLang).contains("ES");
    }
    @Test
    public void selectFR() {
        driver.findElement(By.id("language")).click();
        driver.findElement(By.xpath("//a[text()='FR']")).click();
        String selectedLang = driver.findElement(By.id("language")).getText();
        Assertions.assertThat(selectedLang).contains("FR");
    }
    @Test
    public void selectNL() {
        driver.findElement(By.id("language")).click();
        driver.findElement(By.xpath("//a[text()='NL']")).click();
        String selectedLang = driver.findElement(By.id("language")).getText();
        Assertions.assertThat(selectedLang).contains("NL");
    }
    @Test
    public void selectTR() {
        driver.findElement(By.id("language")).click();
        driver.findElement(By.xpath("//a[text()='TR']")).click();
        String selectedLang = driver.findElement(By.id("language")).getText();
        Assertions.assertThat(selectedLang).contains("TR");
    }
    @AfterMethod
    public void postCondition(){
        String s1 = driver.getCurrentUrl();
        System.out.println(s1);
        driver.quit();
    }

}
