package Shifali_Rajurkar.Framework.Testcases;

import Shifali_Rajurkar.TestNG.ChromeDriverMethod;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TC01_SelectLanguage {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        ChromeDriverMethod common = new ChromeDriverMethod();
        driver = common.openBrowser();
    }

    public String generateXpath(String text) {
        return "//a[text()='" + text + "']";
    }

    public void selectLanguage(String language) {

        driver.findElement(
                By.xpath("//button[@aria-label='Select language']")
        ).click();

        String languagelocator = generateXpath(language);

        driver.findElement(
                By.xpath(languagelocator)
        ).click();

        Assertions.assertThat(languagelocator).contains(language);

        System.out.println("Language selected: " + language);
    }

    @Test
    public void selectLanguage() {

        selectLanguage("EL");
        selectLanguage("DE");
        selectLanguage("EN");
        selectLanguage("ES");
        selectLanguage("FR");
        selectLanguage("NL");
        selectLanguage("TR");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }

}
