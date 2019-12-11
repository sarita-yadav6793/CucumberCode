package Pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonFunctionsLibrary;
import Utils.Driver;

public class OrderHistory extends Driver{
	private Logger logger;
	
	@FindBy(id="order-list")
	WebElement tblOrderList;
	
	@FindBys(@FindBy(xpath="//table[@id='order-list']/tbody/tr"))
	List<WebElement> tblRows;
	
	
	
	// constructor of the class
	public OrderHistory() {
		
		logger= Logger.getLogger(this.getClass());
		comfunctions= new CommonFunctionsLibrary();
		PageFactory.initElements(driver, this);
	}
	
	//verify order history table
	public void verifyOrder(String order_txt) {
		boolean flag= false;
		String order_no=null;
		for(int i=1;i<=tblRows.size();i++) {
			order_no= driver.findElement(By.xpath("//table[@id='order-list']/tbody/tr["+i+"]/td[1]")).getText();
			if(order_txt.contains(order_no)) {
				flag=true;
				break;
			}
		}
			if(flag==true) {
				logger.info("Order History table is present with order " + order_no);
			}
			else {
				logger.info("Order History table is not present with order" );
			
			}
		
	}
}
