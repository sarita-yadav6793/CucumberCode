package Pages;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
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
		cfl= new CommonFunctionsLibrary();
		PageFactory.initElements(driver, this);
	}
	
	//enter Details to create account
	public void enterTitleDetails() throws IOException {
		cfl.selectRadio(radiomr);
		cfl.enterTextInTextBox(txtfName, CommonFunctionsLibrary.readDataExcel("First Name"));
		cfl.enterTextInTextBox(txtlName, CommonFunctionsLibrary.readDataExcel("Last Name"));
		cfl.enterTextInTextBox(txtpass, CommonFunctionsLibrary.readDataExcel("Password"));
		cfl.selectDDByValue(dddays, CommonFunctionsLibrary.readDataExcel("Date"));
		cfl.selectDDByValue(ddmm, CommonFunctionsLibrary.readDataExcel("Month"));
		cfl.selectDDByValue(ddyy, CommonFunctionsLibrary.readDataExcel("Year"));
		
		
	}
	
	//enter address details
	public void enterAddressDetails() throws IOException {
		cfl.enterTextInTextBox(txtaddfName, CommonFunctionsLibrary.readDataExcel("Address First Name"));
		cfl.enterTextInTextBox(txtaddLName, CommonFunctionsLibrary.readDataExcel("Address Last Name"));
		cfl.enterTextInTextBox(txtcompany, CommonFunctionsLibrary.readDataExcel("Company"));
		cfl.enterTextInTextBox(txtaddress, CommonFunctionsLibrary.readDataExcel("Address"));
		cfl.enterTextInTextBox(txtcity, CommonFunctionsLibrary.readDataExcel("City"));
		cfl.selectDDByText(ddstate, CommonFunctionsLibrary.readDataExcel("State"));
		cfl.enterTextInTextBox(txtpincode, CommonFunctionsLibrary.readDataExcel("Zip"));
		cfl.selectDDByText(ddctry, CommonFunctionsLibrary.readDataExcel("Country"));
		cfl.enterTextInTextBox(txtmobile, CommonFunctionsLibrary.readDataExcel("Phone"));
		cfl.enterTextInTextBox(txtalias, CommonFunctionsLibrary.readDataExcel("Alias"));
	}
	
	// click register button
	public void clickRegister() {
		cfl.clickButton(btnRegister);
	}
	
	
	
	
	
	
}
