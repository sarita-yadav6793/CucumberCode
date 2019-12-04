package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonFunctionsLibrary;
import Utils.Driver;

public class MyAccount extends Driver{
	private Logger logger;
	
	@FindBy(xpath="//a[@title='Information']")
	WebElement btninfo;
	
	// constructor of the class
	public MyAccount() {
		logger= Logger.getLogger(this.getClass());
		cfl= new CommonFunctionsLibrary();
		PageFactory.initElements(driver, this);
	}
		
	//click personal info
	public void clickPersonalInfo() {
		cfl.clickButton(btninfo);
	}
		

}
