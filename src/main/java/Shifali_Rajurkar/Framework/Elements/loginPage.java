package Shifali_Rajurkar.Framework.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class loginPage {
    WebDriver driver;
    Properties properties;
    // Declare file path only once
    private static final String CONFIG_PATH =
            System.getProperty("user.dir")
                    + "\\src\\main\\java\\Shifali_Rajurkar\\Framework\\TestData\\config.properties";
    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(className ="btnSubmit")
    public  WebElement btnSubmit;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    public WebElement register;

    public loginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

        properties = new Properties();

        try {
            FileInputStream file = new FileInputStream(CONFIG_PATH);
            properties.load(file);
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void userLogin() {

        // Open login page
        driver.get(properties.getProperty("SignupUrl"));

        // Get credentials from properties file
        String username = properties.getProperty("username");
        String passwordValue = properties.getProperty("password");

        // Enter credentials
        email.sendKeys(username);
        password.sendKeys(passwordValue);

        // Click login
        btnSubmit.click();
    }
}
