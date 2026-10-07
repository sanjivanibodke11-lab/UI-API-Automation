package supriya_kottam.TestNG;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.Callable;

//import static jdk.internal.org.jline.utils.Colors.s;

public class iframe_Assignment {

    @Test
    public void iframe(){
        ChromeDriverManager.chromedriver().setup();
        String path = System.getProperty("user.dir");
        ChromeDriver driver = new ChromeDriver();
        driver.get(path+"\\src\\main\\java\\theQAGuy007\\assignmentFiles\\iframes.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@width='400']")));
        driver.findElement(By.xpath("//input[@placeholder='Input inside Iframe 1']")).sendKeys("Iframe");
        driver.findElement(By.xpath("//button[text()='Button in Iframe 1']")).click();
        driver.switchTo().parentFrame();


        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@width='450']")));
        driver.findElement(By.xpath("//input[@placeholder='Input inside Iframe 1.1']")).sendKeys("Iframe 1.1");
        driver.findElement(By.xpath("//button[text()='Button in Iframe 1.1']")).click();
        //driver.switchTo().parentFrame();

        driver.switchTo().frame(0);
       driver.findElement(By.xpath("//input[@placeholder='Input inside Iframe 1.2']")).sendKeys("Iframe 1.2.1");
       driver.findElement(By.xpath("//button[text()='Button in Iframe 1.2']")).click();
       driver.switchTo().parentFrame();

       //I can't able to enter the input  inside the child parents

    }
}
