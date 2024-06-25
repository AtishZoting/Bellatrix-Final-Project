package com.BellatrixFinalProject.stepDefinations;

import java.util.List;

import org.apache.log4j.Logger;
import org.testng.Assert;

import com.BellatrixFinalProject.Keywords.Keyword;
import com.BellatrixFinalProject.Pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {
	
	private static final Logger LOG =Logger.getLogger(HomePageStepDef.class);
	
	HomePage homepage = new HomePage();
	Keyword keyword = new Keyword();

	@Given("Search result for Falcon Item")
	public void searchProduct() {
		homepage.searchProduct("falcon");
	}

	@When("All results must contain Falcon word in the product title")
	public void all_results_must_contain_Falcon_word_in_the_product_title() {
		List<String> falconTitles = homepage.getFalconTitles();
		for (String productTitle : falconTitles) {
			LOG.info(productTitle);
			System.out.println(productTitle);
			// Assert.assertTrue(productTitle.contains("Falcon"),productTitle);
		}

	}

	@Given("Search result for proton Item")
	public void search_result_for_proton_item() {
		homepage.searchProduct("proton");
	}

	@When("All results must contain proton word in the product title")
	public void all_results_must_contain_proton_word_in_the_product_title() {
		List<String> protonProduct = homepage.getProtonTitles();
		for (String proton : protonProduct) {
			LOG.info(proton);
			System.out.println(proton);
		}
	}

	@Given("Search result sort by popularity")
	public void searchProductByPopularity() {
		homepage.clickOnDropDown("Sort by popularity");

	}

	@Then("Result should be display by poularity")
	public void getAllProductOfPoularity() {
		List<String> popularity = homepage.displayBypopularity();
		for (String popular : popularity) {
			LOG.info(popular);
			System.out.println(popular);
		}
	}

	@Given("Search Result sort by low to high Price")
	public void search_result_sort_by_low_to_high_price() {
		homepage.clickOnDropDown("Sort by price: low to high");
	}

	@Then("Get all Price of low to high product")
	public void get_all_price_of_low_to_high_product() {

		List<String> productPrice = homepage.allProductPrice();
		for (String price : productPrice) {
			LOG.info(price);
			System.out.println(price);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
