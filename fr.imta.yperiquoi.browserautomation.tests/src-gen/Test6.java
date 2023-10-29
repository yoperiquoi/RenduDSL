import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor
;import org.openqa.selenium.interactions.Actions;
import dev.failsafe.internal.util.Assert;
import java.util.*;

public class Test6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Go to URL
        driver.get("http://www.imt-atlantique.fr/fr/rechercher");

        // Add text to the search field (first input)
        WebElement labelElement = driver.findElements(By.xpath("//label[text()='Rechercher']")).get(1);
		 WebElement inputElement = driver.findElement(By.id(labelElement.getAttribute("for")));
        inputElement.sendKeys("2006");

        // Get the label from the combox
        WebElement e = driver.findElement(By.xpath("//label[text()='Période de publication']"));
        // Open the combobox
        new Actions(driver).moveToLocation(e.getLocation().x, e.getLocation().getY() + 50).click().perform();
        // Click on the option
        driver.findElement(By.xpath("//li[text()='Le mois dernier']")).click();
        // Click on a button
        driver.findElement(By.xpath("//input[@value='Appliquer les filtres']")).click();

        // Verify that the page contains text
        assert driver.getPageSource().contains("Aucun résultat ne correspond à votre recherche");

        driver.quit();
    }
}
