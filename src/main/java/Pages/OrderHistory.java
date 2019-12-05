package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonFunctionsLibrary;
import Utils.Driver;

public class OrderHistory extends Driver{
	private Logger logger;
	
	@FindBy(id="order-list")
	WebElement tblOrderList;
	
	@FindBy(xpath="//table[@id='order-list']/tbody/tr")
	WebElement tblRows;
	
	// constructor of the class
	public OrderHistory() {
		
		logger= Logger.getLogger(this.getClass());
		comfunctions= new CommonFunctionsLibrary();
		PageFactory.initElements(driver, this);
	}
	
	//verify order history table
	public void verifyOrder() {
		if(tblOrderList.isDisplayed()  && tblRows.isDisplayed()) {
			logger.info("Order History table is present with orders");
			
		}else {
			logger.info("Order History table is not present with orders");
		}
	}

}
