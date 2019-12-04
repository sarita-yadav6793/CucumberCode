package TestImplementation;

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

public class PlaceOrder {
	CreateAccount ca= new CreateAccount();
	Homepage hp= new Homepage();
	Authentication at= new Authentication();
	FadedShirt fs= new FadedShirt();
	TShirts ts= new TShirts();
	Checkout co= new Checkout();
	Address ad= new Address();
	Shipping sh=new Shipping();
	Payment py= new Payment();
	OrderHistory oh= new OrderHistory();
	public static String email_id= null;
	
	
	@Given("^User is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
		hp.clickMyAcct();
		String email=CommonFunctionsLibrary.readDataExcel("Email");
		at.enterEmail(email+"@gmail.com");
		at.clickCreateAccount();
		ca.enterTitleDetails();
		ca.enterAddressDetails();
		ca.clickRegister();
	}

		@When("^User adds T-Shirts to cart$")
		public void user_adds_T_Shirts_to_cart() throws Throwable {
			hp.clickTshirts();
		    ts.selectTShirts();
		    fs.addToCart(CommonFunctionsLibrary.readDataExcel("Quantity"), CommonFunctionsLibrary.readDataExcel("Size"), CommonFunctionsLibrary.readDataExcel("Color"));
		}

		@When("^place order after making payment$")
		public void place_order_after_making_payment() throws Throwable {
			co.clickProceedToCheckout();
		    co.clickProceed();
		    ad.clickProcced();
		    sh.checkTerms();
		    sh.clickProceed();
		    py.selectPayByBankWire();
			py.clickConfirm();
		}

		@Then("^user is able to verify order in order history$")
		public void user_is_able_to_verify_order_in_order_history() throws Throwable {
			py.clickBackToOrders();
			oh.verifyOrder();
		}
	    
	}


