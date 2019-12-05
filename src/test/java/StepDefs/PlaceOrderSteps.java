package StepDefs;

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
	
	
	@Given("^User is on Home page$")
	public void registerAccount() throws Throwable {
		hpage.clickMyAcct();
		String email=CommonFunctionsLibrary.readDataExcel("Email");
		auth.enterEmail(email+"@gmail.com");
		auth.clickCreateAccount();
		createacct.enterTitleDetails();
		createacct.enterAddressDetails();
		createacct.clickRegister();
	}

	@When("^User adds T-Shirts to cart$")
	public void addToCart() throws Throwable {
		hpage.clickTshirts();
		tshirt.selectTShirts();
		fshirt.addToCart(CommonFunctionsLibrary.readDataExcel("Quantity"), CommonFunctionsLibrary.readDataExcel("Size"), CommonFunctionsLibrary.readDataExcel("Color"));
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
		}

	@Then("^user is able to verify order in order history$")
	public void validateOrderHistory() throws Throwable {
		pymt.clickBackToOrders();
		orderhist.verifyOrder();
	}
	    
	}


