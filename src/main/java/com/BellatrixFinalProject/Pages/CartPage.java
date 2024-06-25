package com.BellatrixFinalProject.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BellatrixFinalProject.Keywords.Keyword;
import com.BellatrixFinalProject.stepDefinations.TestBase;

public class CartPage {

	Keyword keyword = new Keyword();

	public CartPage() {
		PageFactory.initElements(TestBase.getDriver(), this);
	}

	@FindBy(css = "#site-navigation > div:nth-child(2) > ul > li.page_item.page-item-6.current_page_item > a")
	WebElement cartMenu;

	public void clickOnCart() {
		cartMenu.click();
	}

	@FindBy(css = "p.cart-empty.woocommerce-info")
	WebElement cartMsg;

	public String getTextOnCart() {
		String msg = cartMsg.getText();
		return msg;
	}

	@FindBy(css = "#post-6 > div > div > form > table > tbody > tr:nth-child(2) > td > button")
	WebElement updateCart;

	public void clickOnUpdateCart() {
		updateCart.click();
	}

	@FindBy(css = "#post-6 > div > div > div.cart-collaterals > div > table > tbody > tr.order-total > td")
	WebElement total;

	public String totalValueOfProduct() {
		String totalvalue = total.getText();
		return totalvalue;
	}

	@FindBy(css = "a.checkout-button.button.alt.wc-forward")
	WebElement checkOut;

	public void proceedToCheckOut() {
		checkOut.click();
	}

	@FindBy(css = "div.woocommerce tr td.product-name>a")
	WebElement addCartProduct;

	public String addCartProductshowsW() {
		String product = addCartProduct.getText();
		return product;
	}

	@FindBy(css="div.cart_totals>table td[data-title=\"Total\"] bdi")
	WebElement productPrice;
	
	public String showsProductPriceInCartProduct() {
		return productPrice.getText();
			
	}
	@FindBy(css = "#post-6 > div > div > form > table > tbody > tr.woocommerce-cart-form__cart-item.cart_item > td.product-name > a")
	WebElement title;

	public String getProductTitle() {
		String ProductTitle = title.getText();
		return ProductTitle;
	}

	@FindBy(css = "div.quantity input")
	WebElement quantity;

	public String getQuantity() {
		String quant = quantity.getText();
		//System.out.println("Quantity is: "+quant);
		return quant;
	}

	@FindBy(css = "#post-6 > div > div > form > table > tbody > tr.woocommerce-cart-form__cart-item.cart_item > td.product-price > span > bdi")
	WebElement price;

	public String getPrice() {
		String totalPrice = price.getText();
		return totalPrice;
	}

	@FindBy(css = "#post-6 > div > div > div.cart-collaterals > div > div > a")
	WebElement proceed;

	public void clickOnProceed() {
		proceed.click();
	}

}
