package Dineshrao.Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alerts {
    ChromeDriver driver=new ChromeDriver();
    @Test
    public void ClickAlert() throws Exception{
        ChromeDriverManager.chromedriver().setup();
        driver.get("C:\\Users\\ASUS\\IdeaProjects\\NIT-9AM-June2026\\src\\test\\java\\Selenium\\test.html");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Alert')]")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }
    @Test
    public void Confirm1() throws Exception{
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        Thread.sleep(4000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
    }
    @Test
    public void Confirm2() throws Exception{
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
    }
    @Test
    public void prompt1()throws Exception{
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@name='prompt']")).click();
    driver.switchTo().alert().sendKeys("Hello");
    driver.switchTo().alert().accept();
    String s=driver.switchTo().alert().getText();
    System.out.println(s);
    driver.switchTo().alert().accept();
    }
    @Test
    public void prompt2()throws Exception{
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@name='prompt']")).click();

        driver.switchTo().alert().dismiss();
        String s=driver.switchTo().alert().getText();
        System.out.println(s);
        driver.switchTo().alert().dismiss();
    }
}