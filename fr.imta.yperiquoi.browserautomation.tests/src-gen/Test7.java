import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor
;import org.openqa.selenium.interactions.Actions;
import dev.failsafe.internal.util.Assert;
import java.util.*;

public class Test7 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Go to URL
        driver.get("http://www.imt-atlantique.fr/fr");

		 //Get the link to a news
        WebElement link = driver.findElements(By.xpath("//a[starts-with(@href, '/fr/actualites')]")).get(1);
		 //Store the title of the news
        String title = link.getText();
		 String url = link.getDomAttribute("href");
		 link.click();
        // Verify that the page countains the last url and title
        WebElement foundLink = driver.findElement(By.xpath("//a[@href=\""+ url +"\"]"));
        Assert.notNull(link, "Link is not found.");
		 assert driver.getPageSource().contains(title);
        driver.quit();
    }
}
