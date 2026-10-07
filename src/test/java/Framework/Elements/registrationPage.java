package Framework.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registrationPage {
    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(id = "last_name")
    public WebElement lastName;

    @FindBy(id = "dob")
    public WebElement dob;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "postal_code")
    public WebElement postalCode;

    @FindBy(id = "house_number")
    public WebElement houseNumber;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Register')]")
    public WebElement btnRegister;
}
