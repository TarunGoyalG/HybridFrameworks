package PAGEOBJECTTT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFHomepage {
WebDriver driver;
public PFHomepage(WebDriver driver){
	PageFactory.initElements( driver,this);
	
}

@FindBy(xpath ="//i[@class='fe-menu']")
private WebElement dash;

@FindBy(xpath="//img[@src='assets/images/logo-light.png']")
public WebElement logo;

public void dashboard() {
	
	dash.click();
}

public void logom() {
boolean f=logo.isDisplayed();
if(f) {
	System.out.println("Logo displayed");
}else {
	System.out.println("Logo not displayed");
}


}




}
