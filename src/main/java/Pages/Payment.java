package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonFunctionsLibrary;
import Utils.Driver;

public class Payment extends Driver{
	private Logger logger;
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	WebElement linkpaybybankwire;
	
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
	WebElement btnconfirmOrder;
	
	@FindBy(xpath="//a[@title='Back to orders']")
	WebElement btnbackOrder;
	
	@FindBy(xpath="//*[@id='center_column']/div/text()[11]")
	WebElement txtorderconfirmation;
	
	
	// constructor of the class
	public Payment() {
		logger= Logger.getLogger(this.getClass());
		comfunctions= new CommonFunctionsLibrary();
		PageFactory.initElements(driver, this);
	}
	
	// click link pay by wire
	public void selectPayByBankWire() {
		comfunctions.clickButton(linkpaybybankwire);
	}
	
	//click proceed to checkout
	public void clickConfirm() {
		comfunctions.clickButton(btnconfirmOrder);
	}
		
	//click proceed to checkout
	public void clickBackToOrders() {
		comfunctions.clickButton(btnbackOrder);
	}
	
	//get order number
	public String orderNumber() {
		String orderno= txtorderconfirmation.getAttribute("text");
		System.out.println(orderno);
		return orderno;
	}
		

}
