import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor
;import org.openqa.selenium.interactions.Actions;
import dev.failsafe.internal.util.Assert;
import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Go to URL
        driver.get("http://www.imt-atlantique.fr/fr/formation/trouver-ma-formation");

        // Uncheck all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                checkbox.click();
            }
        }

        // Check checkboxes by their values
        List<String> valuesToCheck = Arrays.asList("Anglais", "A domicile", "Temps plein");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 340);");
        for(String value: valuesToCheck) {
            WebElement labelElement = driver.findElement(By.xpath("//label[text()='" + value + "']"));
            WebElement inputElement = driver.findElement(By.id(labelElement.getAttribute("for")));
            inputElement.click();
        }
        // Click on a button
        driver.findElement(By.xpath("//input[@value='Appliquer les critères']")).click();

        // Verify that the page contains text
        assert driver.getPageSource().contains("No found course matching your criteria.");

        driver.quit();
    }
}
