package Shifali_Rajurkar.Framework.Testcases;

import Shifali_Rajurkar.Framework.Elements.homePage;
import Shifali_Rajurkar.TestNG.ChromeDriverMethod;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;

public class TC03_AddToCartFunctionality {

    WebDriver driver;
    homePage homePage;
    Properties properties;

    @BeforeMethod
    public void openBrowser() throws Exception {

        ChromeDriverMethod common = new ChromeDriverMethod();
        driver = common.openBrowser();
        Thread.sleep(2000);
        homePage = new homePage(driver);

        // Read properties file
        properties = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Shifali_Rajurkar\\Framework\\TestData\\config.properties");
        properties.load(file);
    }

    @Test
    public void addCartFunctionality() throws Exception {

        String productName = properties.getProperty("productName");
        homePage.searchProduct(productName);

        // Click exact Claw Hammer from search results
        homePage.selectProduct(productName);

        int requiredCount = Integer.parseInt(properties.getProperty("cartCount"));
        //click for add to cart element
        while (homePage.getCartCount() < requiredCount) {
            homePage.addCart();
        }
        homePage.moveToAddCart();
        Thread.sleep(2000);
        //assertion
        String actualMessage = homePage.getToastMessage();
        System.out.println("toast msg -->>" + actualMessage);
        Assert.assertEquals(actualMessage, "Product added to shopping cart.");
    }
    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
