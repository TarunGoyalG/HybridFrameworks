package PAGEOBJECTTT;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import UTILITIES.ReadConfig;

public class BaseClass {
	ReadConfig ft=new ReadConfig();
	
 public String baseurl=ft.geturl();
 public String user=ft.getuser();
 public String pass=ft.getpass();
 public static WebDriver driver;
 public static Logger log;
 @Parameters("Browser")
 	@BeforeMethod
 	public void setup(String br) {
 		if(br.equals("chrome")) {
 		driver=new ChromeDriver();
 		}
 		else if(br.equals("firefox")) {
 			driver=new FirefoxDriver();
 		}else if(br.equals("ie")) {
 			driver=new InternetExplorerDriver();
 		}
 		log=LogManager.getLogger("BaseClass");
 		driver.get(baseurl);
 	}
 	
	@AfterMethod
 	public void tearDown() {
 		driver.close();
 		
 		
 	}
 	
	public String capture(String tname) {
		String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String m=System.getProperty("user.dir")+"\\Screenshot\\"+tname+"-"+timestamp;
		File fm=new File(m);
		f.renameTo(fm);
		return m;
		
		
	}
 	
}
