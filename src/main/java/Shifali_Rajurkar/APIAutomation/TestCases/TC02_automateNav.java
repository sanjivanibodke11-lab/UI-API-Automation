package Shifali_Rajurkar.APIAutomation.TestCases;

import Shifali_Rajurkar.TestNG.ChromeDriverMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TC02_automateNav {

    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setUp() {

        // Create Chrome browser
        ChromeDriverMethod common = new ChromeDriverMethod();
        driver = common.openBrowser();

        // Open HTML file
        driver.get(
                System.getProperty("user.dir")
                        + "\\src\\main\\java\\theQAGuy007\\assignmentFiles\\navigations.html"
        );

        // Create Actions object for mouse hover
        actions = new Actions(driver);
    }

    @Test
    public void navigationTest() {

        // Find all navigation links
        List<WebElement> links =
                driver.findElements(By.cssSelector("nav a"));

        for (WebElement link : links) {

            // Print menu name
            System.out.println("Menu: " + link.getText());

            // Move mouse to menu
            actions.moveToElement(link).perform();

            // Keep hover visible for 500 milliseconds
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // Click menu
            actions.click().perform();

            // Display message
            String message =
                    driver.findElement(By.id("message")).getText();

            System.out.println("Message: " + message);
        }
    }

    @AfterMethod
    public void closeBrowser() {

        // Close browser
        if (driver != null) {
            driver.quit();
        }
    }
}
