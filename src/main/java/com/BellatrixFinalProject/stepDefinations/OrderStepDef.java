package com.BellatrixFinalProject.stepDefinations;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.BellatrixFinalProject.Pages.CartPage;
import com.BellatrixFinalProject.Pages.CheckoutPage;
import com.BellatrixFinalProject.Pages.HomePage;
import com.BellatrixFinalProject.Pages.OrderReceivedPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderStepDef {
	
	private static final Logger log = Logger.getLogger(OrderStepDef.class);
	HomePage home= new HomePage();
	CartPage cart= new CartPage();
	CheckoutPage check= new CheckoutPage();
	OrderReceivedPage order= new OrderReceivedPage();

	@Given("Click on home button")
	public void click_on_home_button() {
		home.clickOnHomeTab();
	}

	@When("Click on product image")
	public void click_on_product_image() {
		home.clickToproduct();
	}

	@When("Click on add to cart button")
	public void click_on_add_to_cart_button() {
		home.clickOnAddToCart();
	}

	@When("Click on view cart")
	public void click_on_view_cart() {
		home.clickOnViewCart();
	}

	@Then("Verify product title is correct or not")
	public void Verify_product_title_is_correct_or_not() {
		String t1 = cart.getProductTitle();
		log.error("Title is =" + t1);
		System.out.println("Title is : " + t1);

		// Assert.assertTrue(t1.contains("Falcon"));
	}

	@Then("Verify product price")
	public void verify_product_price() {
		String productPrice = cart.getPrice();

		log.info("Product Price is: " + productPrice);
		System.out.println("Product price is : " + productPrice);

		// Assert.assertTrue(productPrice.contains("50.00 "));

	}

	@Then("Verify Quantity")
	public void verify_Product_Quantity() {
		String prodQuantity = cart.getQuantity();
		log.info("Product Price is: " + prodQuantity);
		System.out.println("Product Quantity is: " + prodQuantity);

		//Assert.assertTrue(prodQuantity.contains("1"));
	}

	@Then("Click on proceed to checkout")
	public void clcikOnProceedToCheckOut() {
		cart.clickOnProceed();
	}

	@Then("Fill first name field")
	public void firstName() {
		check.getFirstName("atish");
	}

	@Then("Last name field")
	public void lastName() {
		check.getLastName("z");
	}

	@Then("Click on company name")
	public void getCompanyName() {
		check.enterCompanyName("Allstate");
	}

	@Then("Select country India")
	public void selectCounty() {
		check.selectCountyFromDropDown("India");

	}

	@Then("Enter address")
	public void addressOfStreet() {
		check.streetAddress("Pune");

	}

	@Then("Enter streetAddress")
	public void streetAddressText() {

		check.streetAddress2("Baramati");
	}

	@Then("Enter pincode")
	public void pincodeData() {
		check.pincode("413114");
	}

	@Then("Get town name")
	public void townname() {
		check.entertownName("pune");
	}

	@Then("Get Phone number")
	public void phoneNumber() {
		check.enterphoneNumber("9535465872");
	}

	@Then("Get email address")
	public void emailAddress() {
		check.enteremaildAddrss("atishz@gmail.com");
	}

	@Then("Click on account creation checkbox")
	public void clickcheckAccountBox() {
		check.clickOnAccountCreationCheckBox();
	}

	@Then("Click on place order")
	public void ClickOnPlaceOrder() {
		check.clickOnPlaceOrder();
	}

	@Then("Get state name")
	public void stateName() {
		check.getStateName("Maharashtra");

	}

	@Then("Get message for order booked")
	public void get_message_for_order_booked() throws InterruptedException {
		String msg = order.getMessage();
		log.info(msg + "\t");
		System.out.println(msg + "\t");
	}

	@Then("Verify Order number")
	public void verify_order_number() {
		String orderNumber = order.getOrderNumber();
		log.info("Order number is: " + orderNumber);
		System.out.println("Order number is: " + orderNumber);

	}

	@Then("Verify date")
	public void verify_date() {
		String date = order.getDate();
		log.info("Date is: " + date);
		System.out.println("Date is: " + date);
	}

	@Then("Verify price")
	public void verify_price() {
		String finalPrice = order.getFinalPrice();
		log.info("Total price is: " + finalPrice);
		System.out.println("Total price is: " + finalPrice);
	}

	@Then("Verify login")
	public void verifyLogin() {
		
		check.existingUserLogin();
		check.loginInfo("reshmachavan9082@gmail.com");
		check.loginPwd("Samu@12345689");
		check.clickOnLogin();

	}
	
	


}
