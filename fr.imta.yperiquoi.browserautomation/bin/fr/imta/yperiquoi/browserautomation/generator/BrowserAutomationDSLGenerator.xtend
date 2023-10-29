/*
 * generated by Xtext 2.32.0
 */
package fr.imta.yperiquoi.browserautomation.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import fr.imta.yperiquoi.browserautomation.browserAutomationDSL.*


/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class BrowserAutomationDSLGenerator extends AbstractGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val model = resource.getContents().get(0) as Model;
        
        
        if (model !== null) {
            val inputFileName = resource.URI.lastSegment.toString();
        	var name = inputFileName.replaceFirst(".badsl", ".java");
        	
        	var className = resource.URI.lastSegment.toString().replaceFirst(".badsl", "")
        	
        	className = Character.toUpperCase(className.charAt(0)) + className.substring(1);
        	
        	name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        
            val seleniumCode = generateSeleniumCode(model, className);
            fsa.generateFile(name, seleniumCode);
        }
	}
	
    def String generateSeleniumCode(Model model, String className) {
        var code = ""
        code +=("import org.openqa.selenium.By;\n")
        code +=("import org.openqa.selenium.WebDriver;\n")
        code +=("import org.openqa.selenium.WebElement;\n")
        code +=("import org.openqa.selenium.chrome.ChromeDriver;\n")
        code +=("import org.openqa.selenium.JavascriptExecutor\n;")
        code +=("import org.openqa.selenium.interactions.Actions;\n")
        code +=("import dev.failsafe.internal.util.Assert;\n")
        code +=("import java.util.*;\n\n")
        
        code +=("public class " + className + " {\n");
        code +=("    public static void main(String[] args) {\n");
       
        for (Command command : model.getCommands()) {
            if (command instanceof OpenBrowser) {
             	code +=("        WebDriver driver = new ChromeDriver();\n\n");
            } else if (command instanceof GoTo) {
                code +=("        // Go to URL\n");
                code +=("        driver.get(\"" + command.getUrlName() + "\");\n\n");
            } else if (command instanceof Click) {
            	if (command.getLinkText() !== null) {
            		code +=("        // Click on a link (use get because it does not work for new)\n");
                	code +=("        WebElement e = driver.findElement(By.xpath(\"//a[text()='" + command.getLinkText() + "']\"));\n");
                	code +=("        driver.get(e.getAttribute(\"href\"));\n"); 
            	} else if (command.getButtonText !== null) {
            		code +=("        // Click on a button\n");
                	code +=("        driver.findElement(By.xpath(\"//input[@value='" + command.getButtonText() + "']\")).click();\n\n");
            	} else if (command.getAlt() !== null) {
            		code +=("        // Click on the image containing alt\n");
        	    	code +=("        driver.findElement(By.xpath(\"//img[@alt='" + command.getAlt() + "']\")).click();\n\n");
            	} else {
            		code +=("		 link.click();\n")
            	}    
            } else if (command instanceof Fill) {
            	if (command.getFieldName() !== null) {
            		code +=("        // Fill a text field\n");
                	code +=("        WebElement textField = driver.findElement(By.name(\"" + command.getFieldName() + "\"));\n");
                	code +=("        textField.sendKeys(\"" + command.getTextToFill() + "\");\n\n");
            	} else {
            		code +=("        // Add text to the search field (first input)\n");
            		code +=("        WebElement labelElement = driver.findElements(By.xpath(\"//label[text()='Rechercher']\")).get(1);\n");
    				code +=("		 WebElement inputElement = driver.findElement(By.id(labelElement.getAttribute(\"for\")));\n")
    				code +=("        inputElement.sendKeys(\"" + command.getTextToFill() + "\");\n\n");
            	} 
            } else if (command instanceof Select) {
            	if (command.getCheckboxName() !== null) {
            		code +=("        // Select a checkbox\n");
                	code +=("        driver.findElement(By.name(\"" + command.getCheckboxName() + "\")).click();\n\n");
            	} else {
            		code +=("        // Check checkboxes by their values\n");
			    	code +=("        List<String> valuesToCheck = Arrays.asList(");
			    	for (String value : command.getValues()) {
			    	    code +=("\"" + value + "\", ");
			    	}
			    	code = code.substring(0, code.length - 2)
		        	code +=(");\n");
		        	code += "        JavascriptExecutor js = (JavascriptExecutor) driver;\n";
    				code += "        js.executeScript(\"window.scrollTo(0, 340);\");\n";
		        	code += "        for(String value: valuesToCheck) {\n";
    				code += "            WebElement labelElement = driver.findElement(By.xpath(\"//label[text()='\" + value + \"']\"));\n";
    				code += "            WebElement inputElement = driver.findElement(By.id(labelElement.getAttribute(\"for\")));\n";
    				code += "            inputElement.click();\n";
    				code += "        }\n";
            	}
            } else if (command instanceof Verify) {
            	if (command.getTextToVerify() !== null) {
            		code +=("        // Verify that the page contains text\n");
                	code +=("        assert driver.getPageSource().contains(\"" + command.getTextToVerify() + "\");\n\n");
            	} else if (command.getLinkToVerify() !== null) {
            		code +=("        // Verify that the page contains link\n");
            		code +=("        assert driver.findElements(By.partialLinkText(\"" + command.getLinkToVerify() + "\")).size() > 0;\n\n");
            	} else {
            		code +=("        // Verify that the page countains the last url and title\n");
            		code +=("        WebElement foundLink = driver.findElement(By.xpath(\"//a[@href=\\\"\"+ url +\"\\\"]\"));\n");
            		code +=("        Assert.notNull(link, \"Link is not found.\");\n");
	            	code +=("		 assert driver.getPageSource().contains(title);\n")
            	}
            } else if (command instanceof Read) {
            	code +=("		 //Get the link to a news\n");
            	code +=("        WebElement link = driver.findElements(By.xpath(\"//a[starts-with(@href, '/fr/actualites')]\")).get(" + command.getNumber() + ");\n")
            	code +=("		 //Store the title of the news\n");
            	code +=("        String title = link.getText();\n")
            	code +=("		 String url = link.getDomAttribute(\"href\");\n")
            } else if (command instanceof Paste) {
            	code +=("        // Add text to the search field (first input)\n");
            	code +=("        WebElement labelElement = driver.findElements(By.xpath(\"//label[text()='Rechercher']\")).get(1);\n");
    			code +=("		 WebElement inputElement = driver.findElement(By.id(labelElement.getAttribute(\"for\")));\n")
    			code +=("        inputElement.sendKeys(title);\n\n");
            } else if (command instanceof Uncheck) {
            	code +=("        // Uncheck all checkboxes\n");
			    code +=("        List<WebElement> checkboxes = driver.findElements(By.xpath(\"//input[@type='checkbox']\"));\n");
			    code +=("        for (WebElement checkbox : checkboxes) {\n");
			    code +=("            if (checkbox.isSelected()) {\n");
			    code +=("                checkbox.click();\n");
			    code +=("            }\n");
			    code +=("        }\n\n")
            } else if (command instanceof Combobox) {
               	code +=("        // Get the label from the combox\n");
			    code +=("        WebElement e = driver.findElement(By.xpath(\"//label[text()='"+ command.getLabel() + "']\"));\n");
               	code +=("        // Open the combobox\n");
			    code +=("        new Actions(driver).moveToLocation(e.getLocation().x, e.getLocation().getY() + 50).click().perform();\n");
               	code +=("        // Click on the option\n");
			    code +=("        driver.findElement(By.xpath(\"//li[text()='"+ command.getOption()  + "']\")).click();\n");        	
            }
        }

        code +=("        driver.quit();\n");
        code +=("    }\n");
        code +=("}\n");

        return code.toString();
    }
}
