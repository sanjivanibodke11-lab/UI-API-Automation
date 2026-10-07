package Shifali_Rajurkar.Framework.Testcases;

import Shifali_Rajurkar.Framework.Elements.adminDashboard;
import Shifali_Rajurkar.Framework.Elements.homePage;
import Shifali_Rajurkar.Framework.Elements.loginPage;
import Shifali_Rajurkar.TestNG.ChromeDriverMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC05_adminChangeOrderStatus {

    WebDriver driver;
    loginPage lp;
    adminDashboard ad;

    @BeforeMethod
    public void openBrowser() {

        ChromeDriverMethod common = new ChromeDriverMethod();
        driver = common.openBrowser();

        // Login Page
        lp = new loginPage(driver);
        ad = new adminDashboard(driver);
    }
    @Test
    public void userlogin() throws Exception {
        lp.userLogin();
        Thread.sleep(2000);
        ad.editOrderStatus();
        ad.changeOrderStatus();
    }

    @AfterMethod
    public void closeBrowser() {
     // driver.quit();
    }
}