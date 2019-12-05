package StepDefs;

import Pages.Authentication;
import Pages.Homepage;
import Pages.MyAccount;
import Pages.PersonalInformation;
import Utils.CommonFunctionsLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyUpdatedDetailsSteps {
	Homepage hpage= new Homepage();
	Authentication auth= new Authentication();
	MyAccount myacct= new MyAccount();
	PersonalInformation perinfo= new PersonalInformation();
	public static String edited_name= null;
	
	@Given("^User is on Sign In page$")
	public void signIn() throws Throwable {
		hpage.clickSignIn();
		auth.SignEmail((CommonFunctionsLibrary.readDataExcel("Email")+"@gmail.com"), CommonFunctionsLibrary.readDataExcel("Password"));
		auth.clickSignIn();
		
	}

	@When("^User clicks on My personal info$")
	public void clickPersonalInfo() throws Throwable {
		myacct.clickPersonalInfo();
	    
	}

	@When("^changes first name as \"([^\"]*)\"$")
	public void editFirstName(String fname) throws Throwable {
	  edited_name= perinfo.editDetails(fname);
	  perinfo.enterPass(CommonFunctionsLibrary.readDataExcel("Password"));
	  perinfo.clickSave();
	}

	@Then("^User should be able to validate updated information$")
	public void verifyUpdatedInfo() throws Throwable {
		hpage.verifyName(edited_name);
	}

}
