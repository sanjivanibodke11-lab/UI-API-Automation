package TestNG;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
    @DataProvider(name="sample")
    public Object[][] getData(){
        return new Object[][]{{"1","1"},{"2","2"},{"3","3"},{"4","4"}};
    }

    @Test(dataProvider = "sample")
    public void dp(String username, String pass){
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("email"))
                .sendKeys(username);
        driver.findElement(By.name("pass"))
                .sendKeys(pass);
    }
}
