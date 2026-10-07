package Selenium;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class takeAScreenshot {
    public static void main(String[] args) throws Exception {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        TakesScreenshot ts = driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        System.out.println(src);
        File destination = new File("./ss-1.png"); //root of the project
        FileUtils.copyFile(src,destination);
        File src1 = driver.findElement(By.linkText("Sign in"))
                .getScreenshotAs(OutputType.FILE);
        File destination1 = new File("./ss-2.png"); //root of the project
        FileUtils.copyFile(src1,destination1);

    }
}
