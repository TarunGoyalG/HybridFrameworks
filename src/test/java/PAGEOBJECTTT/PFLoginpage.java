package PAGEOBJECTTT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFLoginpage {

	public WebDriver driver;
	
	public PFLoginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	
	
	

	@FindBy(xpath="//input[@id='emailaddress']")
public WebElement user;

	@FindBy(xpath="//input[@id='password']")
public WebElement pass;

	@FindBy(xpath="//button[@name='admin_login']")
public WebElement butt;

public void setUsername(String n) {
	user.sendKeys(n);
}

public void setpass(String m) {
	pass.sendKeys(m);
}
public void clic() {
	butt.click();
}
}
