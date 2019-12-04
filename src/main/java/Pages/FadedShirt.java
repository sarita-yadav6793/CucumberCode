package Pages;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonFunctionsLibrary;
import Utils.Driver;

public class FadedShirt extends Driver {
	private Logger logger;
	
	@FindBy(id="quantity_wanted")
	WebElement txtQuantity;
	
	@FindBy(id="group_1")
	WebElement ddSize;
	
	@FindBy(id="color_13")
	WebElement imgorangecolor;
	
	@FindBy(id="color_14")
	WebElement imgbluecolor;
	
	@FindBy(id="add_to_cart")
	WebElement btnAddToCart;
	
	
	// constructor of the class
	public FadedShirt() {	
		logger= Logger.getLogger(this.getClass());
		cfl= new CommonFunctionsLibrary();
		PageFactory.initElements(driver, this);
	}
			
	
	// add to cart
	public void addToCart(String quantity, String size,String color) {
		cfl.enterTextInTextBox(txtQuantity, quantity);	
		cfl.selectDDByValue(ddSize, size);
		if(color.equals("Blue")) {
			cfl.clickButton(imgbluecolor);
			logger.info("Selected T-shirt color is Blue");
		}
		else {
			cfl.clickButton(imgorangecolor);
			logger.info("Selected T-shirt color is Orange");
		}
		cfl.clickButton(btnAddToCart);
	
	
	
}
	
}