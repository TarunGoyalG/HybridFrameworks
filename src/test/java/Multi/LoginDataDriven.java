package Multi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginDataDriven {
@Test
public void m() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	DataDriven d=new DataDriven(".//Data.xlsx");
	String sheet="Login";
	int row=d.getRowCount(sheet);
	for(int i=2;i<=row;i++) {
		String user=d.getCellData(sheet, "username", i);
		String pass=d.getCellData(sheet, "password", i);
		System.out.println(user+" "+pass);
		
		
		
		
	}
	
	
	
}
}
