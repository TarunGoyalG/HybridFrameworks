package Multi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Color {
@Test
public void m() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
WebElement g=	driver.findElement(By.xpath("//input[@id='login-button']"));
	String p = g.getCssValue("color");
String m = org.openqa.selenium.support.Color.fromString(p).asHex();
	System.out.println(m);
	
	
}
}
