package Pages;

import org.apache.log4j.Logger;
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
		comfunctions= new CommonFunctionsLibrary();
		PageFactory.initElements(driver, this);
	}
			
	
	// add to cart
	public void addToCart(String quantity, String size,String color) {
		comfunctions.enterTextInTextBox(txtQuantity, quantity);	
		comfunctions.selectDDByValue(ddSize, size);
		if(color.equals("Blue")) {
			comfunctions.clickButton(imgbluecolor);
			logger.info("Selected T-shirt color is Blue");
		}
		else {
			comfunctions.clickButton(imgorangecolor);
			logger.info("Selected T-shirt color is Orange");
		}
		comfunctions.clickButton(btnAddToCart);
	
	
	
}
	
}