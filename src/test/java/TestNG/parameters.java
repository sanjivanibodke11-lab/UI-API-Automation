package TestNG;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.apache.groovy.json.internal.Chr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {

    @Parameters({"browser","username","password"})
    @Test
    public void params(String browser, String uname, String pwd){
        System.out.println(uname);
        System.out.println(pwd);
        String username = uname;
        String pass = pwd;

        WebDriver driver;
        if(browser.equalsIgnoreCase("chrome")){
            ChromeDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")){
            FirefoxDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else{
            EdgeDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.findElement(By.xpath(""))
                .sendKeys(username);
        driver.findElement(By.xpath(""))
                .sendKeys(pass);
    }

}
