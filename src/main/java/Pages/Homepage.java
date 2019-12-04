package Pages;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utils.CommonFunctionsLibrary;
import Utils.Driver;


public class Homepage extends Driver{
	private Logger logger;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li[3]")
	WebElement tabTshirts;
	
	@FindBy(linkText="My account")
	WebElement linkmyaccount;
	
	@FindBy(linkText="My orders")
	WebElement linkmyorders;
	
	@FindBy(xpath="//a[@title='View my customer account']/span")
	WebElement lblname;
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	WebElement linksignin;
		
	
	// constructor of the class
	public Homepage() {
		logger= Logger.getLogger(this.getClass());
		cfl= new CommonFunctionsLibrary();
		PageFactory.initElements(driver, this);
	}
	
	// click Tshirts tab
	public void clickTshirts() {
		cfl.clickButton(tabTshirts);
	}
	
	
	// click My account tab
	public void clickMyAcct() {
		cfl.clickButton(linkmyaccount);
	}
		
		
	// click My orders tab
	public void clickMyOrders() {
		cfl.clickButton(linkmyorders);
	}
		
	//verify user name
	public void verifyName(String name) {
		String[] arrname= lblname.getText().split(" ");
		Assert.assertTrue("Updated information is not verified",arrname[0].equalsIgnoreCase(name));
		logger.info("Updated information is verified");
	}
	
	//click sign in
	public void clickSignIn() {
		cfl.clickButton(linksignin);
	}
		

}
