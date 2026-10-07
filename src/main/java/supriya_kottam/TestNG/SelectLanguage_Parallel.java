package supriya_kottam.TestNG;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import supriya_kottam.Framework.Testcases.TC01_Select_Language;

//import static jdk.internal.org.jline.utils.Colors.s;

//import static jdk.internal.org.jline.utils.Colors.s;

public class SelectLanguage_Parallel {
    ChromeDriver driver;

    @Test
    public void EL() throws Exception {
        Thread.sleep(5000);
       ChromeDriver_method c = new ChromeDriver_method();
        WebDriver driver = c.lang();
      driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        driver.findElement(By.xpath("//a[text()='EL']")).click();

    }


    @Test
    public void EN() throws Exception {
        Thread.sleep(5000);
        ChromeDriver_method c = new ChromeDriver_method();
        WebDriver driver = c.lang();
        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        driver.findElement(By.xpath("//a[text()='EN']")).click();
    }

    @Test
    public void ES() throws Exception {
        Thread.sleep(5000);
        ChromeDriver_method c = new ChromeDriver_method();
        WebDriver driver = c.lang();
        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        driver.findElement(By.xpath("//a[text()='ES']")).click();
    }

    @Test
    public void FR() throws Exception {
        Thread.sleep(5000);
        ChromeDriver_method c = new ChromeDriver_method();
        WebDriver driver = c.lang();
        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        driver.findElement(By.xpath("//a[text()='FR']")).click();
    }

    @Test
    public void NL() throws Exception {
        Thread.sleep(5000);
        ChromeDriver_method c = new ChromeDriver_method();
        WebDriver driver = c.lang();
        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        driver.findElement(By.xpath("//a[text()='NL']")).click();
    }

    @Test
    public void TR() throws Exception {
        Thread.sleep(5000);
        ChromeDriver_method c = new ChromeDriver_method();
        WebDriver driver = c.lang();
        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        driver.findElement(By.xpath("//a[text()='TR']")).click();
    }

    @Test
    public void DE() throws Exception {
        Thread.sleep(5000);
        ChromeDriver_method c = new ChromeDriver_method();
        WebDriver driver = c.lang();
        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        driver.findElement(By.xpath("//a[text()='DE']")).click();
    }
}
