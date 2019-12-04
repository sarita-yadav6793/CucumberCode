package TestImplementation;

import Pages.Authentication;
import Pages.Homepage;
import Pages.MyAccount;
import Pages.PersonalInformation;
import Utils.CommonFunctionsLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyUpdatedDetails {
	Homepage hp= new Homepage();
	Authentication at= new Authentication();
	MyAccount ma= new MyAccount();
	PersonalInformation pi= new PersonalInformation();
	public static String edited_name= null;
	
	@Given("^User is on Sign In page$")
	public void user_is_on_Sign_In_page() throws Throwable {
		hp.clickSignIn();
		at.SignEmail((CommonFunctionsLibrary.readDataExcel("Email")+"@gmail.com"), CommonFunctionsLibrary.readDataExcel("Password"));
		at.clickSignIn();
		
	}

	@When("^User clicks on My personal info$")
	public void user_clicks_on_My_personal_info() throws Throwable {
		ma.clickPersonalInfo();
	    
	}

	@When("^changes first name as \"([^\"]*)\"$")
	public void changes_first_name_as(String fname) throws Throwable {
	  edited_name= pi.editDetails(fname);
	  pi.enterPass(CommonFunctionsLibrary.readDataExcel("Password"));
	   pi.clickSave();
	}

	@Then("^User should be able to validate updated information$")
	public void user_should_be_able_to_validate_updated_information() throws Throwable {
	    hp.verifyName(edited_name);
	}

}
