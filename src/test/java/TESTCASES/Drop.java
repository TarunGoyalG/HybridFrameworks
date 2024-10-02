package TESTCASES;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Drop {
	
	Dro au;
	
@Test
public void m() throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.tagName("button")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Admin']")).click();
	Thread.sleep(3000);
	au=new Dro(driver);
au.am();
System.out.println("Test case successfully executed");

}
}
