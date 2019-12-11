package Pages;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.CommonFunctionsLibrary;
import Utils.Driver;

public class Authentication extends Driver{
	private Logger logger;
	
	@FindBy(id="SubmitCreate")
	WebElement btnCreateAccount;
	
	@FindBy(id="email_create")
	WebElement txtemail;
	
	@FindBy(id="email")
	WebElement txtsignemail;
	
	@FindBy(id="passwd")
	WebElement txtsignpass;
	
	@FindBy(id="SubmitLogin")
	WebElement btnSignIn;

	
	// constructor of the class
	public Authentication() {
		logger= Logger.getLogger(this.getClass());
		comfunctions= new CommonFunctionsLibrary();
		PageFactory.initElements(driver, this);
	}
	
	//click create account
	public void clickCreateAccount() {
		comfunctions.clickButton(btnCreateAccount);
	}
	
	//enter email address
	public void enterEmail(String email) throws IOException {
		comfunctions.enterTextInTextBox(txtemail, email);
	}
	
	
	//enter sign in email
	public void SignEmail(String email, String pass) {
		comfunctions.enterTextInTextBox(txtsignemail, email);
		comfunctions.enterTextInTextBox(txtsignpass, pass);
		
	}
	
	//click sign in
	public void clickSignIn() {
		comfunctions.clickButton(btnSignIn);
	}

}
