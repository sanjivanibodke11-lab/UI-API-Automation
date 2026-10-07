package Dineshrao.TestNG;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogIn {
    @Test
    public void css(){
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("customer@practicesoftwaretesting.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("welcome01");
        driver.findElement(By.cssSelector(".btnSubmit")).click();
            try{
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println(e);
            }
        String s=driver.getCurrentUrl();
        System.out.println(s);
         Assertions.assertThat(s).contains("/account");
        System.out.println("LogIn Sucessful");

        }

}
