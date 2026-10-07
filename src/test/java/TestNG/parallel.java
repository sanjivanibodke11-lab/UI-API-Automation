package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel extends reporting{
    @Test
    public void x() throws Exception{
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        System.out.println("x");
        driver.quit();
        test = reports.createTest("TC001","Sample1");
    }

    @Test
    public void z() throws Exception{
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        System.out.println("z");
        driver.quit();
        test = reports.createTest("TC002","Sample2");
    }

    @Test
    public void a() throws Exception{
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        System.out.println("a");
        driver.quit();
        test = reports.createTest("TC003","Sample3");
    }

    @Test
    public void d() throws Exception{
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        System.out.println("d");
        driver.quit();
        test = reports.createTest("TC004","Sample4");
    }

    @Test(groups = "Smoke")
    public void p() throws Exception{
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        System.out.println("p");
        driver.quit();
        test = reports.createTest("TC005","Sample5");
    }

    @Test
    public void g() throws Exception{
        ChromeDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        System.out.println("g");
        driver.quit();
        test = reports.createTest("TC006","Sample6");
    }
}
