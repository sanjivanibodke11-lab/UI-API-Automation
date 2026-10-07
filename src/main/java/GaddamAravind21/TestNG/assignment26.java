package GaddamAravind21.TestNG;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assignment26 {
    @Test
    public void logoutFlow() {
        assignment25 a1 = new assignment25();
        a1.loginFlow();
        a1.driver.findElement(By.id("menu")).click();
        a1.driver.findElement(By.xpath("//a[@data-test='nav-sign-out']")).click();
       a1.driver.findElement(By.id("email"));

        String s = a1.driver.getCurrentUrl();
       // System.out.println(s);
        Assertions.assertThat(s).contains("login");
    }

}
