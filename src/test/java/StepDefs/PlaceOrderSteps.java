package StepDefs;

import org.apache.log4j.Logger;

import Pages.Address;
import Pages.Authentication;
import Pages.Checkout;
import Pages.CreateAccount;
import Pages.FadedShirt;
import Pages.Homepage;
import Pages.OrderHistory;
import Pages.Payment;
import Pages.Shipping;
import Pages.TShirts;
import Utils.CommonFunctionsLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlaceOrderSteps {
	CreateAccount createacct= new CreateAccount();
	Homepage hpage= new Homepage();
	Authentication auth= new Authentication();
	FadedShirt fshirt= new FadedShirt();
	TShirts tshirt= new TShirts();
	Checkout cout= new Checkout();
	Address add= new Address();
	Shipping shipping=new Shipping();
	Payment pymt= new Payment();
	OrderHistory orderhist= new OrderHistory();
	public static String email_id= null;
	public static String order_txt= null;
		
	
	@Given("^User navigate to login page$")
	public void user_navigate_to_login_page() throws Throwable {
	    hpage.clickSignIn();
	}

	@When("^User submits username and password$")
	public void user_submits_username_and_password() throws Throwable {
		auth.SignEmail((CommonFunctionsLibrary.readData("Email")), CommonFunctionsLibrary.readData("Password"));
		auth.clickSignIn();
	}

	@Then("^User is able to login$")
	public void user_is_able_to_login() throws Throwable {
		
	}
	
	@Given("^User search for Tshirt$")
	public void user_search_for_Tshirt() throws Throwable {
		hpage.clickTshirts();
		tshirt.selectTShirts();
	}

	@When("^User adds T-Shirts to cart$")
	public void addToCart() throws Throwable {	
		fshirt.addToCart(CommonFunctionsLibrary.readData("Quantity"), CommonFunctionsLibrary.readData("Size"), CommonFunctionsLibrary.readData("Color"));
	}

	@When("^place order after making payment$")
	public void placeOrder() throws Throwable {
		cout.clickProceedToCheckout();
		cout.clickProceed();
		add.clickProcced();
		shipping.checkTerms();
		shipping.clickProceed();
		pymt.selectPayByBankWire();
		pymt.clickConfirm();
		order_txt= pymt.orderNumber();
		
		}

	@Then("^user is able to verify order in order history$")
	public void validateOrderHistory() throws Throwable {
		pymt.clickBackToOrders();
		hpage.clickMyOrders();
		orderhist.verifyOrder(order_txt);
	}
	    
	}


