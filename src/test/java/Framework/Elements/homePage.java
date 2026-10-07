package Framework.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {

    @FindBy(linkText = "Sign in")
    public WebElement signIn;

    @FindBy(xpath = "//a[@data-test='nav-contact']")
    public WebElement contact;
}
