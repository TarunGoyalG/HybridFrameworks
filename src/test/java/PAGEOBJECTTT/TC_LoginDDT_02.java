package PAGEOBJECTTT;

import javax.xml.crypto.Data;

import org.testng.annotations.Test;

import UTILITIES.Datai;

public class TC_LoginDDT_02 extends BaseClass{

	@Test(dataProvider="Niv", dataProviderClass = Datai.class)
	public void loginDDT(String usert,String passt) throws InterruptedException {
		PFLoginpage pt=new PFLoginpage(driver);
		//driver.get("https://project1.qualibytes.com/backend/admin/index.php");
		pt.setUsername(usert);
		pt.setpass(passt);
		pt.clic();
		Thread.sleep(6000);
		PFHomepage pa=new PFHomepage(driver);
		pa.logom();
		pa.dashboard();
	}
	
	
	
	
	
}
