package supriya_kottam.Framework.Testcases;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC01_Select_Language {
    ChromeDriver driver;

    public String Xpath(String text){
        return "//a[text()='".concat(text).concat("']");
    }


    @BeforeMethod
    public void preCondition(){
        /*
        opening chromeDriver
         */
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void tc01() throws Exception{
        /*
        click on Sign in & verify navigation
         */

        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        TC01_Select_Language xp = new TC01_Select_Language();
        String s = xp.Xpath("EL");
        driver.findElement(By.xpath(s)).click();
        Assertions.assertThat(s).contains("EL");
        System.out.println("Language selected as " +s);

        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        s = xp.Xpath("DE");
        driver.findElement(By.xpath(s)).click();
        Assertions.assertThat(s).contains("DE");
        System.out.println("Language selected as " +s);

        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        s = xp.Xpath("EN");
        driver.findElement(By.xpath(s)).click();
        Assertions.assertThat(s).contains("EN");
        System.out.println("Language selected as " +s);
        //driver.findElement(By.xpath(s)).click();

        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        s = xp.Xpath("ES");
        driver.findElement(By.xpath(s)).click();
        Assertions.assertThat(s).contains("ES");
        System.out.println("Language selected as " +s);

        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        s = xp.Xpath("FR");
        driver.findElement(By.xpath(s)).click();
        Assertions.assertThat(s).contains("FR");
        System.out.println("Language selected as " +s);

        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        s = xp.Xpath("NL");
        driver.findElement(By.xpath(s)).click();
        Assertions.assertThat(s).contains("NL");
        System.out.println("Language selected as " +s);

        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        s = xp.Xpath("TR");
        driver.findElement(By.xpath(s)).click();
        Assertions.assertThat(s).contains("TR");
        System.out.println("Language selected as " +s);
    }

    @AfterMethod
    public void postCondition(){
        /*
        logging out or
        closing the driver.
         */
        String s1 = driver.getCurrentUrl();
        System.out.println(s1);
        driver.quit();
    }

}
