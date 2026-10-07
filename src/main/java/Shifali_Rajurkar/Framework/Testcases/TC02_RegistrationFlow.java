package Shifali_Rajurkar.Framework.Testcases;

import Shifali_Rajurkar.Framework.Elements.homePage;
import Shifali_Rajurkar.Framework.Elements.loginPage;
import Shifali_Rajurkar.Framework.Elements.registrationPage;
import Shifali_Rajurkar.TestNG.ChromeDriverMethod;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TC02_RegistrationFlow {

    WebDriver driver;
    Properties prop;

    @BeforeMethod
    public void openBrowser() throws IOException {

        ChromeDriverMethod common = new ChromeDriverMethod();

        driver = common.openBrowser();

        // Load config.properties
        prop = new Properties();
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Shifali_Rajurkar\\Framework\\TestData\\config.properties");
        prop.load(file);

        file.close();

        String url = prop.getProperty("url");

        driver.get(url);
    }

    // Registration Test

    @Test
    public void registre() throws Exception {

        // Home Page
        homePage hp = PageFactory.initElements(
                driver,
                homePage.class
        );

        hp.signIn.click();

        Thread.sleep(2000);

        // Login Page


        loginPage lp = PageFactory.initElements(
                driver,
                loginPage.class
        );

        lp.register.click();

        Thread.sleep(2000);

        // Registration Page

        registrationPage rp = PageFactory.initElements(
                driver,
                registrationPage.class
        );
        // First Name
        rp.firstName.sendKeys(
                prop.getProperty("firstName")
        );
        // Last Name
        rp.lastName.sendKeys(
                prop.getProperty("lastName")
        );
        // Date of Birth
        rp.dob.sendKeys(
                prop.getProperty("dob")
        );
        // Country
        rp.selectCountry(
                prop.getProperty("country")
        );
        // Postal Code
        rp.postalCode.sendKeys(
                prop.getProperty("postalCode")
        );
        // House Number
        rp.houseNumber.sendKeys(
                prop.getProperty("houseNumber")
        );
        // Street
        rp.street.sendKeys(
                prop.getProperty("street")
        );
        // City
        rp.city.sendKeys(
                prop.getProperty("city")
        );
        // State
        rp.state.sendKeys(
                prop.getProperty("state")
        );
        // Phone
        rp.phone.sendKeys(
                prop.getProperty("phone")
        );
        // Email
        rp.email.sendKeys(
                prop.getProperty("email")
        );
        // Password
        rp.password.sendKeys(
                prop.getProperty("password")
        );
        // Password Validation
        Assertions.assertThat(rp.password.getAttribute("value")).isEqualTo(prop.getProperty("password"));
        System.out.println("Password validated successfully");

        // Register
        rp.btnRegister.click();
        Thread.sleep(2000);
    }

    // Close Browser

    @AfterMethod
    public void closeBrowser() {

        driver.quit();
    }
}
