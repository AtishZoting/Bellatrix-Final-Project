package com.BellatrixFinalProject.stepDefinations;

import org.apache.log4j.Logger;

import com.BellatrixFinalProject.Pages.CartPage;
import com.BellatrixFinalProject.Pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestCasesStepDef {

	private static final Logger LOG = Logger.getLogger(TestCasesStepDef.class);

	CartPage cartpage = new CartPage();
	HomePage homepage = new HomePage();

	@Given("click on falcon  add cart button")
	public void click_on_falcon_add_cart_button() {
		homepage.clickOnAddCartButton();
	}

	@And("click on falcon view cart")
	public void click_on_view_cart() {
		homepage.clickOnViewCartButton();
	}

	@And("go to home tab")
	public void go_to_home_tab() {
		homepage.clickOnHomeMenu();
	}

	@And("click on proton rocket add cart button")
	public void click_on_proton_rocket_add_cart_button() {
		homepage.addToCartForProtonRocket();
	}

	@And("click on proton view cart")
	public void clickOnViewCart() {
		homepage.viewToCartForProtonRocket();
	}

	@Then("get total values of added products")
	public void get_total_values_of_added_products() {
		String totalAmount = cartpage.totalValueOfProduct();
		LOG.info(totalAmount);
	}

	@Given("Click on cart Menu button")
	public void click_on_cart_menu_button() {
		cartpage.clickOnCart();
	}

	@Then("get msg on Cart")
	public void get_msg_on_cart() {
		cartpage.getTextOnCart();

	}

	@Given("Add in cart Falcon9 in cart")
	public void add_in_cart_falcon9_in_cart() {
		homepage.clickOnAddCartButton();
	}

	@Then("Click on view cart button")
	public void click_on_view_cart_button() {
		homepage.clickOnViewCartButton();

	}

	@Then("verify wheather added product shows in cart and gets product name and its price")
	public void verify_wheather_added_product_shows_in_cart_and_gets_product_name_and_its_price() {
		String productName = cartpage.addCartProductshowsW();
		LOG.info("Product Name = " + productName);
		System.out.println("Product Name = " + productName);

		String productPrice = cartpage.showsProductPriceInCartProduct();
		LOG.info("Product Name = " + productPrice);
		System.out.println("Product Name = " + productPrice);

	
	}

	@Then("proceed to check out Menu")
	public void proceed_to_check_out_menu() {

	}

	@Then("fill all details in check out window")
	public void fill_all_details_in_check_out_window() {

	}

	@Then("place order")
	public void place_order() {

	}

	@Then("verify order number date n order received meassage")
	public void verify_order_number_date_n_order_received_meassage() {

	}

}
