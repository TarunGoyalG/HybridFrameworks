package Multi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ja {
	 public static void main(String[] args) {
	      WebDriver driver=new ChromeDriver();
	      
	 
	        driver.get("https://testautomationpractice.blogspot.com/");

	
	        List<WebElement> priceElements = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[3]0"));

	        double sum = 0.0;

	    
	        for (int i = 0; i < priceElements.size(); i++) {
	           
	            if ((i + 1) % 2 == 0) {
	 
	                String priceText = priceElements.get(i).getText().replace("$", "");
	                double price = Double.parseDouble(priceText);
	                sum += price;
	            }
	        }

	        System.out.println("Sum of prices at even positions: $" + sum);

	       
	        driver.quit();
	    }
}
