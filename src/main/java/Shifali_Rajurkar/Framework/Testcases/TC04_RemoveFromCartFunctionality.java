package Shifali_Rajurkar.Framework.Testcases;

import Shifali_Rajurkar.Framework.Elements.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Properties;

public class TC04_RemoveFromCartFunctionality {

    WebDriver driver;
    homePage homePage;
    Properties properties;

    TC03_AddToCartFunctionality addToCart =
            new TC03_AddToCartFunctionality();

    @BeforeMethod
    public void openBrowser() throws Exception {

        // Open browser and initialize objects from TC03
        addToCart.openBrowser();

        driver = addToCart.driver;
        homePage = addToCart.homePage;
        properties = addToCart.properties;
    }

    @Test
    public void removeFromCart() throws Exception {

        // Step 1: Add product to cart
        addToCart.addCartFunctionality();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Step 2: Open cart
        homePage.addCartMenu();

        // Step 3: Remove product from cart
         homePage.removeFromCart();
        Thread.sleep(2000);
        // Get remove message
        String actualMessage = homePage.getRemoveCartMessage();
        System.out.println("actualMessage --->"+actualMessage);
        // Verify message
        Assert.assertEquals(
                actualMessage, "Product deleted."
        );
    }
    @AfterMethod
    public void closeBrowser() {
       addToCart.closeBrowser();
    }
}
