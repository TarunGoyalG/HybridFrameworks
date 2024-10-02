package TESTCASES;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dro {
	WebDriver driver;
	public Dro(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//div[@class='oxd-select-text-input']")
private WebElement m;

public void am() {
	Select mt=new Select(m);
	mt.selectByVisibleText("Admin");


	
}


}
