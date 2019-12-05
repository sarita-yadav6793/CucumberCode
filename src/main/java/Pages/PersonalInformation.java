package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonFunctionsLibrary;
import Utils.Driver;

public class PersonalInformation extends Driver{
private Logger logger;
	
	@FindBy(id="firstname")
	WebElement txtfname;
	
	@FindBy(id="old_passwd")
	WebElement txtoldpass;
	
	@FindBy(id="passwd")
	WebElement txtnewpass;
	
	@FindBy(name="submitIdentity")
	WebElement btnSave;
	
	
	
	// constructor of the class
	public PersonalInformation() {
		
		logger= Logger.getLogger(this.getClass());
		comfunctions= new CommonFunctionsLibrary();
		PageFactory.initElements(driver, this);
	}
	
	// enter changes
	public String editDetails(String fname) {
		comfunctions.enterTextInTextBox(txtfname, fname);
		return txtfname.getAttribute("value");
		
	}
	
	//enter password
	public void enterPass(String pass) {
		comfunctions.enterTextInTextBox(txtoldpass, pass);
	}
	
	//click save btn
	public void clickSave() {
		comfunctions.clickButton(btnSave);
	}

}
