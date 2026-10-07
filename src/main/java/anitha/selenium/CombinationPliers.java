package anitha.selenium;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class CombinationPliers {
    public static void main(String[] args) {
        ChromeDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://practicesoftwaretesting.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        // xpath  by attribute
        WebElement element=driver.findElement(By.xpath("(//span[@data-test='product-price'])[1]"));
        String S = element.getText();
        System.out.println(S);
        // xpath by visibleText
        WebElement D=driver.findElement(By.xpath("//h5[text()=' Combination Pliers ']"));
        String S1 = D.getText();
        System.out.println(S1);
        Assertions.assertThat(S1.contains("Combination Pliers")).isTrue();
        System.out.println(S);
    }
}