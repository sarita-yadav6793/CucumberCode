package Pages;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonFunctionsLibrary;
import Utils.Driver;

public class Address extends Driver{
	private Logger logger;
	
	@FindBy(name="processAddress")
	WebElement btnproceed;
	
	// constructor of the class
	public Address() {
		
		logger= Logger.getLogger(this.getClass());
		cfl= new CommonFunctionsLibrary();
		PageFactory.initElements(driver, this);
	}
	
	// click proceed
	public void clickProcced() {
		cfl.clickButton(btnproceed);
	}

}
