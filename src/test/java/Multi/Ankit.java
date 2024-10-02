package Multi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ankit {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("India");
	//driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")).click();
	driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys(Keys.ENTER);
	Thread.sleep(10000);
	WebElement element=driver.findElement(By.xpath("//img[@class='IOZdEc RrNlDb']/../../../../div"));
	System.out.println(element.getAttribute("aria-label"));
	Assert.assertEquals(element.getAttribute("aria-label"), "image of the flag of India");
	
	
	driver.quit();
}
}