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
	
	@Given("^User navigate to personal info$")
	public void user_navigate_to_personal_info() throws Throwable {
		myacct.clickPersonalInfo();
	}

	@When("^User changes first name as \"([^\"]*)\"$")
	public void user_changes_first_name_as(String fname) throws Throwable {
		 edited_name= perinfo.editDetails(fname);
		 perinfo.enterPass(CommonFunctionsLibrary.readData("Password"));
		 perinfo.clickSave();
	}

	@Then("^User should be able to validate updated information$")
	public void verifyUpdatedInfo() throws Throwable {
		hpage.verifyName(edited_name);
	}

}
