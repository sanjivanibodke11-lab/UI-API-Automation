package supriya_kottam.TestNG;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class mouseover_Assignment {
    @Test
    public void mouseover(){
        ChromeDriverManager.chromedriver().setup();
        String path = System.getProperty("user.dir");
        ChromeDriver driver = new ChromeDriver();
        driver.get(path+"\\src\\main\\java\\theQAGuy007\\assignmentFiles\\mouseActions.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       driver.findElement(By.xpath("//div[text()='Click Me']")).click();
      String s = driver.findElement(By.xpath("//div[text()='✅ Click detected!']")).getText();
        Assertions.assertThat(s).contains(" Click detected!");
        System.out.println("Click Me worked");

        WebElement element = driver.findElement(By.xpath("//div[text()='Double Click Me']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
        String s1 = driver.findElement(By.cssSelector("#dblClickFeedback")).getText();
        Assertions.assertThat(s1).contains("Double Click detected!");
        System.out.println("Double Click Me worked");

        WebElement element1 = driver.findElement(By.xpath("//div[text()='Right Click Me']"));
        actions.contextClick(element1).perform();
        String s2 = driver.findElement(By.cssSelector("#rightClickFeedback")).getText();
        Assertions.assertThat(s2).contains("Right Click detected!");
        System.out.println("Right Click worked");

        WebElement element2 = driver.findElement(By.xpath("//div[text()='Hover Over Me']"));
        actions.moveToElement(element2).perform();
        String s3 = driver.findElement(By.cssSelector("#hoverFeedback")).getText();
        Assertions.assertThat(s3).contains("Mouse entered!");
        System.out.println("Mouse Over worked");

        WebElement element5 = driver.findElement(By.xpath("//div[text()='Click & Hold Me']"));
        actions.clickAndHold(element5).perform();
        actions.release();
        String s5 = driver.findElement(By.cssSelector("#holdFeedback")).getText();
        Assertions.assertThat(s5).contains("Hold interrupted after 0 second(s)");
        System.out.println("Click & Hold Me Worked");

        // Assertion is not working for clickandhold and drag and drop is not working.

        WebElement element3 = driver.findElement(By.xpath("//div[text()='Drag Me']"));
        WebElement element4 = driver.findElement(By.xpath("//div[text()='Drop Here']"));
        actions.dragAndDrop(element3,element4).perform();
        String s4= driver.findElement(By.cssSelector("#dragFeedback")).getText();
        Assertions.assertThat(s4).contains("Dropped successfully!");
        System.out.println("Drag and Drop Worked");
    }
}
