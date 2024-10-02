package Multi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tests {

@Test
public void m() {
	

	WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("India"+Keys.ENTER);
		boolean t=true;
		Assertions.assertTrue(t,"ragaj");
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	

