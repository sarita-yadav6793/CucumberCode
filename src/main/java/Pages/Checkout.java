package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utils.CommonFunctionsLibrary;
import Utils.Driver;

public class Checkout extends Driver{
	private Logger logger;
	
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement btnptcout;
	
	@FindBy(xpath="//p[@class='cart_navigation clearfix']/a[1]")
	WebElement btncout;

	
	// constructor of the class
	public Checkout() {		
		logger= Logger.getLogger(this.getClass());
		comfunctions= new CommonFunctionsLibrary();
		PageFactory.initElements(driver, this);
	}
	
	//click proceed to checkout
	public void clickProceedToCheckout() {
		comfunctions.clickButton(btnptcout);
	}
	
	//click proceed
	public void clickProceed() {
		comfunctions.clickButton(btncout);
	}

}		
