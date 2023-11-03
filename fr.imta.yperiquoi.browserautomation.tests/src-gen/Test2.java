import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import dev.failsafe.internal.util.Assert;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Go to URL
        driver.get("http://www.imt-atlantique.fr/fr");

        // Click on a link (use get because it does not work for new)
        WebElement e = driver.findElement(By.xpath("//a[text()='Toutes les actualités']"));
        driver.get(e.getAttribute("href"));
        // Verify that the page contains link
        assert driver.findElements(By.partialLinkText("Accueil")).size() > 0;

        driver.quit();
    }
}
