package Pages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonFunctionsLibrary;
import Utils.Driver;

public class CreateAccount extends Driver {
	private Logger logger;
	
	@FindBy(id="id_gender1")
	WebElement radiomr;
	
	@FindBy(id="customer_firstname")
	WebElement txtfName;
	
	@FindBy(id="customer_lastname")
	WebElement txtlName;
	
	@FindBy(id="passwd")
	WebElement txtpass;
	
	@FindBy(id="days")
	WebElement dddays;
	
	@FindBy(id="months")
	WebElement ddmm;
	
	@FindBy(id="years")
	WebElement ddyy;
	
	@FindBy(id="firstname")
	WebElement txtaddfName;
	
	@FindBy(id="lastname")
	WebElement txtaddLName;
	
	@FindBy(id="company")
	WebElement txtcompany;
	
	@FindBy(id="address1")
	WebElement txtaddress;
	
	@FindBy(id="city")
	WebElement txtcity;
	
	@FindBy(id="id_state")
	WebElement ddstate;
	
	@FindBy(id="postcode")
	WebElement txtpincode;
	
	@FindBy(id="id_country")
	WebElement ddctry;
	
	@FindBy(id="phone_mobile")
	WebElement txtmobile;
	
	@FindBy(id="alias")
	WebElement txtalias;
	
	@FindBy(id="submitAccount")
	WebElement btnRegister;
	
	
	// constructor of the class
	public CreateAccount() {
		logger= Logger.getLogger(this.getClass());
		comfunctions= new CommonFunctionsLibrary();
		PageFactory.initElements(driver, this);
	}
	
	// click register button
	public void clickRegister() {
		comfunctions.clickButton(btnRegister);
	}
	
	
	
	
	
	
}
