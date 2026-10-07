package supriya_kottam.TestNG;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Assignment27 {

    public String Xpath(String text){
        return "//a[text()='".concat(text).concat("']");
    }

    @Test
    public void selectlanguage(){
        ChromeDriver_method a = new ChromeDriver_method();
        WebDriver driver = a.lang();

        //a.selectlang();
        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        Assignment27 xp = new Assignment27();
        String s = xp.Xpath("EL");
        driver.findElement(By.xpath(s)).click();
        Assertions.assertThat(s).contains("EL");
        System.out.println("Language selected as " +s);

        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();
        s = xp.Xpath("DE");
        driver.findElement(By.xpath(s)).click();
        Assertions.assertThat(s).contains("DE");
        System.out.println("Language selected as " +s);
       // driver.findElement(By.xpath(s)).click();

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
}


