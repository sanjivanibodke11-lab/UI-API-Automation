package Shifali_Rajurkar.TestNG;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class assignment27 {
    //all method can use drivers
    WebDriver driver;
    public String generateXpath(String text) {
        return "//a[text()='" + text + "']";
    }

    public void selectLanguage(String language) {
        //select language
        driver.findElement(By.xpath("//button[@aria-label='Select language']")).click();

        //ex:language = "EN" then languagelocator = "//a[text()='EN']"
        String languagelocator = generateXpath(language);


        driver.findElement(By.xpath(languagelocator)).click();
        Assertions.assertThat(languagelocator).contains(language);
        System.out.println("Language selected: " + language);
    }

    @Test
    public void selectLanguage() {

        ChromeDriverMethod common = new ChromeDriverMethod();
        driver = common.openBrowser();

        selectLanguage("EL");
        selectLanguage("DE");
        selectLanguage("EN");
        selectLanguage("ES");
        selectLanguage("FR");
        selectLanguage("NL");
        selectLanguage("TR");
    }
}
