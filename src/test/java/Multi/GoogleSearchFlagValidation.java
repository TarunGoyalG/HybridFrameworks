package Multi;


	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

	public class GoogleSearchFlagValidation {
	    public static void main(String[] args) throws InterruptedException {
	    	  
			ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--remote-allow-origins=*");

	       WebDriver driver = new ChromeDriver(options);

	           driver.get("https://www.google.com");
	          
	            WebElement searchBox = driver.findElement(By.className("gLFyf"));
	            searchBox.sendKeys("India");
	            searchBox.submit();

	           Thread.sleep(3000);  

	           WebElement imagesTab = driver.findElement(By.id("rimg_1"));
	            imagesTab.click();

	       
	            Thread.sleep(3000);

	           List<WebElement> images = driver.findElements(By.tagName("img"));
	            boolean indiaImageFound = false;
	            boolean indiaFlagFound = false;

	            for (WebElement image : images) {
	                String altText = image.getAttribute("alt");
	                String srcText = image.getAttribute("src");

	              
	                if (altText.contains("India") || srcText.contains("India")) {
	                    indiaImageFound = true;
	                    System.out.println("Image related to 'India' found.");
	                    break;
	                }
	                // If no India keyword, check for the presence of the word "flag"
	                else if (altText.contains("flag") || srcText.contains("flag")) {
	                    // Assuming that if the flag is present and the context is India, it's the Indian flag
	                    System.out.println("Flag image found: " + srcText);
	                    indiaFlagFound = true;
	                    break;
	                }
	            }

	            if (indiaImageFound) {
	                System.out.println("Validation passed: An image related to 'India' was found.");
	            } else if (indiaFlagFound)
	            {
	                System.out.println("Validation passed: The Indian flag was found.");
	            } else {
	                System.out.println("Validation failed: No image related to 'India' or Indian flag found.");
	            }

		      
		}
}
