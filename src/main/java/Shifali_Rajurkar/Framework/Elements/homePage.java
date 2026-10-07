package Shifali_Rajurkar.Framework.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class homePage {
    private WebDriverWait wait;
    @FindBy(linkText = "Sign in")
    public WebElement signIn;

    @FindBy(xpath = "//a[@data-test='nav-contact']")
    public WebElement contact;

    //search box
    WebDriver driver;


    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement searchBox;

    @FindBy(xpath = "//button[@data-test='search-submit']")
    WebElement searchSubmitBtn;

    @FindBy(xpath = "//button[@id='btn-increase-quantity']")
    WebElement addCartButton;
    // Constructor
    public homePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(driver, this);
    }
    //Add to cart fuctionality//
    // Search product
    public void searchProduct(String productName) {
        searchBox.sendKeys(productName);
        searchSubmitBtn.click();
    }

// Select exact product
public void selectProduct(String productName) {

    System.out.println("selectProduct " + productName);

    WebElement product = driver.findElement(
            By.xpath("//a[.//*[normalize-space()='" + productName + "']]")
    );

    product.click();
}
    @FindBy(xpath = "//button[@id='btn-add-to-cart']")
    WebElement addToCartButton;
public  void moveToAddCart(){
    addToCartButton.click();
}
//confirmation of add to cart
@FindBy(id = "toast-container")
WebElement toastMessage;
public String getToastMessage() {
    return toastMessage.getText();
}

    @FindBy(xpath = "//input[@id='quantity-input']")
    WebElement cartCount;
    // Add product
    public void addCart() {
        addCartButton.click();
    }
    // Get quantity
    public int getCartCount() {
        return Integer.parseInt(cartCount.getAttribute("value"));
    }
//=====** Remove From Cart functions ** ====================

    @FindBy(xpath = "//a[@data-test='nav-cart']")
    WebElement addcartNavMenu;
    public void addCartMenu() {

        System.out.println("Waiting until toast message disappear.");

        wait.until(ExpectedConditions.invisibilityOf(toastMessage));

        System.out.println("Opening cart");

        wait.until(ExpectedConditions.elementToBeClickable(addcartNavMenu));

        addcartNavMenu.click();

        System.out.println("Cart opened successfully.");
    }

    @FindBy(xpath = "//a[contains(@class,'btn-danger')]")
    WebElement removeFromCartButton;
    public void removeFromCart() {
        System.out.println("Waiting for remove button...");
        wait.until(
                ExpectedConditions.elementToBeClickable(removeFromCartButton)
        );
        System.out.println("Removing product...");
        removeFromCartButton.click();
        System.out.println("Product removed successfully.");
    }
    @FindBy(xpath = "//div[@id='toast-container']//div[@role='alert' and normalize-space()='Product deleted.']")
    WebElement removeToastMessage;
    public String getRemoveCartMessage() {
        wait.until(
                ExpectedConditions.visibilityOf(removeToastMessage)
        );
        return removeToastMessage.getText();
    }
}
