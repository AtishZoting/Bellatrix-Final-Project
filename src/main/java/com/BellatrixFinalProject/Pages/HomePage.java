package com.BellatrixFinalProject.Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BellatrixFinalProject.Keywords.Keyword;
import com.BellatrixFinalProject.stepDefinations.TestBase;

public class HomePage {
	Keyword keyword = new Keyword();

	public HomePage() {
		PageFactory.initElements(TestBase.getDriver(), this);
	}

	@FindBy(css = "input[id=\"woocommerce-product-search-field-0\"]")
	WebElement searchComponent;

	public void searchProduct(String productName) {
		searchComponent.sendKeys(productName);
		searchComponent.sendKeys(Keys.ENTER);
	}

	@FindBy(css = "h2[class=\"woocommerce-loop-product__title\"]")
	List<WebElement> falconProductTitles;

	public List<String> getFalconTitles() {
		return keyword.getTexts(falconProductTitles);
	}

	@FindBy(css = "h2.woocommerce-loop-product__title")
	List<WebElement> protonProductTitles;

	public List<String> getProtonTitles() {
		return keyword.getTexts(protonProductTitles);

	}

	@FindBy(css = "#main > div:nth-child(2) > form > select")
	WebElement dropDown;

	public void clickOnDropDown(String textTOVisible) {
		keyword.dropDown(dropDown, textTOVisible);
	}

	@FindBy(css = "h2.woocommerce-loop-product__title")
	List<WebElement> sortPopularity;

	public List<String> displayBypopularity() {
		return keyword.getTexts(sortPopularity);
	}

	@FindBy(css = "span.price")
	List<WebElement> allPrice;

	public List<String> allProductPrice() {
		return keyword.getTexts(allPrice);
	}

	@FindBy(css = "#main > ul > li.product.type-product.post-28.status-publish.first.onbackorder.product_cat-big-rockets.has-post-thumbnail.sale.downloadable.taxable.shipping-taxable.purchasable.product-type-simple > a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")
	WebElement clickOnAddCartForFalcon9;

	public void clickOnAddCartButton() {
		clickOnAddCartForFalcon9.click();
	}

	@FindBy(css = "#main > ul > li.product.type-product.post-28.status-publish.first.onbackorder.product_cat-big-rockets.has-post-thumbnail.sale.downloadable.taxable.shipping-taxable.purchasable.product-type-simple > a.added_to_cart.wc-forward")
	WebElement viewCartFalcon9;

	public void clickOnViewCartButton() {
		viewCartFalcon9.click();
	}
	

	@FindBy(css="#site-navigation > div:nth-child(2) > ul > li:nth-child(1) > a")
	WebElement home;
	
	public void clickOnHomeMenu() {
		home.click();
	}
	
	@FindBy(css="#main > ul > li.product.type-product.post-12.status-publish.instock.product_cat-big-rockets.has-post-thumbnail.sale.taxable.shipping-taxable.purchasable.product-type-simple > a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")
	WebElement addToCartForProtonRocket;
	
	public void addToCartForProtonRocket() {
		addToCartForProtonRocket.click();
	}

	@FindBy(css="#main > ul > li.product.type-product.post-12.status-publish.instock.product_cat-big-rockets.has-post-thumbnail.sale.taxable.shipping-taxable.purchasable.product-type-simple > a.added_to_cart.wc-forward")
	WebElement viewCartForProtonRocket;

	public void viewToCartForProtonRocket() {
		viewCartForProtonRocket.click();
	}
	

	@FindBy(css = "#site-navigation > div:nth-child(2) > ul > li.current_page_item > a")
	WebElement homeTab;

	public void clickOnHomeTab() {
		homeTab.click();
	}

	@FindBy(css = "#main > ul > li.product.type-product.post-28.status-publish.first.onbackorder.product_cat-big-rockets.has-post-thumbnail.sale.downloadable.taxable.shipping-taxable.purchasable.product-type-simple > a.woocommerce-LoopProduct-link.woocommerce-loop-product__link > img")
	WebElement productClick;

	public void clickToproduct() {
		productClick.click();
	}

	@FindBy(css = "#product-28 > div.summary.entry-summary > form > button")
	WebElement clickOnAddToCartBtn;

	public void clickOnAddToCart() {
		clickOnAddToCartBtn.click();
	}

	@FindBy(css = "#content > div > div.woocommerce > div > a")
	WebElement viewCartBtn;

	public void clickOnViewCart() {
		viewCartBtn.click();
	}


}	
