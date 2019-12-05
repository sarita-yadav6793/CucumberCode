package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonFunctionsLibrary;
import Utils.Driver;

public class Shipping extends Driver{
	private Logger logger;
	
	@FindBy(id="cgv")
	WebElement chkterms;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	WebElement btnProceed;	
	
	// constructor of the class
	public Shipping() {	
		logger= Logger.getLogger(this.getClass());
		comfunctions= new CommonFunctionsLibrary();
		PageFactory.initElements(driver, this);
	}
	
	// check terms
	public void checkTerms() {
		comfunctions.selectCheckBox(chkterms);
	}
	
	//click proceed to checkout
	public void clickProceed() {
		comfunctions.clickButton(btnProceed);
	}
	
	

}
