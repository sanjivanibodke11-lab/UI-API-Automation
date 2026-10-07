package Framework.TestCases;

import Framework.Elements.homePage;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC01_NavigateToLoginPage {
    ChromeDriver driver; //null

    /*
    Pre-Condition - @Before
    TestCase - @Test
    Post-Condition - @After
     */

    @BeforeMethod
    public void preCondition(){
        /*
        opening chromeDriver
         */
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    @Test
    public void tc01() throws Exception{
        /*
        click on Sign in & verify navigation
         */
//        driver.findElement(By.linkText("Sign in")).click();
        homePage hp = PageFactory.initElements(driver, homePage.class);
        hp.signIn.click();
        Thread.sleep(2000);
        Assertions.assertThat(driver.getCurrentUrl())
                .contains("login");
        System.out.println("Navigated to Sign In successfully");
    }

    @AfterMethod
    public void postCondition(){
        /*
        logging out or
        closing the driver.
         */
        driver.quit();
    }

}
