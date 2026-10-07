package Shifali_Rajurkar.Framework.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class adminDashboard {

    WebDriver driver;

    @FindBy(xpath = "//a[text()='Edit']")
    public WebElement EditStatusButton;

    @FindBy(id = "status")
    public WebElement statusDropdown;

    @FindBy(xpath = "//button[contains(text(),'Update status')]")
    public WebElement updateStatusButton;

    @FindBy(xpath = "//*[contains(text(),'Status updated!')]")
    public WebElement statusUpdatedMessage;

    @FindBy(className = "alert-success")
    public WebElement successMessage;


    public adminDashboard(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void editOrderStatus() {

        EditStatusButton.click();
    }


    public void changeOrderStatus() {

        Select select = new Select(statusDropdown);

        // Get current selected status
        String currentStatus = select.getFirstSelectedOption().getText();

        System.out.println("Current Status:- " + currentStatus);

        // Get all options
        List<WebElement> options = select.getOptions();

        // Find first enabled option which is not current
        for (WebElement option : options) {

            if (!option.getText().equalsIgnoreCase(currentStatus)) {
                option.click();
                break;
            }
        }
        // Click Update Status
        updateStatusButton.click();

        // Verify message
        Assert.assertEquals(
                statusUpdatedMessage.getText(),
                "Status updated!"
        );
    }


}
