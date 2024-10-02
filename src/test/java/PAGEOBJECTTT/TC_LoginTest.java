package PAGEOBJECTTT;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC_LoginTest  extends BaseClass{
	PFLoginpage p;
	@Test
	public void loginTest() {
		
		log.info("url is open");
		 p=new 	PFLoginpage(driver);
		p.setUsername(user);
		log.info("username enter");
		p.setpass(pass);
		log.info("password enter");
		p.clic();
		log.info("click");
		Assert.fail();
	
	}
	
	
	
}
