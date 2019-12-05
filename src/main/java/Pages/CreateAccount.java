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
	
	//enter Details to create account
	public void enterTitleDetails() throws IOException {
		comfunctions.selectRadio(radiomr);
		comfunctions.enterTextInTextBox(txtfName, CommonFunctionsLibrary.readDataExcel("First Name"));
		comfunctions.enterTextInTextBox(txtlName, CommonFunctionsLibrary.readDataExcel("Last Name"));
		comfunctions.enterTextInTextBox(txtpass, CommonFunctionsLibrary.readDataExcel("Password"));
		comfunctions.selectDDByValue(dddays, CommonFunctionsLibrary.readDataExcel("Date"));
		comfunctions.selectDDByValue(ddmm, CommonFunctionsLibrary.readDataExcel("Month"));
		comfunctions.selectDDByValue(ddyy, CommonFunctionsLibrary.readDataExcel("Year"));
		
		
	}
	
	//enter address details
	public void enterAddressDetails() throws IOException {
		comfunctions.enterTextInTextBox(txtaddfName, CommonFunctionsLibrary.readDataExcel("Address First Name"));
		comfunctions.enterTextInTextBox(txtaddLName, CommonFunctionsLibrary.readDataExcel("Address Last Name"));
		comfunctions.enterTextInTextBox(txtcompany, CommonFunctionsLibrary.readDataExcel("Company"));
		comfunctions.enterTextInTextBox(txtaddress, CommonFunctionsLibrary.readDataExcel("Address"));
		comfunctions.enterTextInTextBox(txtcity, CommonFunctionsLibrary.readDataExcel("City"));
		comfunctions.selectDDByText(ddstate, CommonFunctionsLibrary.readDataExcel("State"));
		comfunctions.enterTextInTextBox(txtpincode, CommonFunctionsLibrary.readDataExcel("Zip"));
		comfunctions.selectDDByText(ddctry, CommonFunctionsLibrary.readDataExcel("Country"));
		comfunctions.enterTextInTextBox(txtmobile, CommonFunctionsLibrary.readDataExcel("Phone"));
		comfunctions.enterTextInTextBox(txtalias, CommonFunctionsLibrary.readDataExcel("Alias"));
	}
	
	// click register button
	public void clickRegister() {
		comfunctions.clickButton(btnRegister);
	}
	
	
	
	
	
	
}
