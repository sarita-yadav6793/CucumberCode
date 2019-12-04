package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonFunctionsLibrary;
import Utils.Driver;

public class TShirts extends Driver{
	private Logger logger;
	
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	WebElement imgfadedtshirt;
	
	// constructor of the class
	public TShirts() {	
		logger= Logger.getLogger(this.getClass());
		cfl= new CommonFunctionsLibrary();
		PageFactory.initElements(driver, this);
	}
		
	
	//click tshirts
	public void selectTShirts() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", imgfadedtshirt);
	}
	

}
