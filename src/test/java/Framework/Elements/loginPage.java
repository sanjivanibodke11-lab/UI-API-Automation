package Framework.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="password")
    public WebElement password;
}
