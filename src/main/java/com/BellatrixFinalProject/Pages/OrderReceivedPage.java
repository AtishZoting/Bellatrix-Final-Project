package com.BellatrixFinalProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BellatrixFinalProject.Utilities.WaitFor;
import com.BellatrixFinalProject.stepDefinations.TestBase;

public class OrderReceivedPage {
	public OrderReceivedPage() {
		PageFactory.initElements(TestBase.getDriver(), this);
	}

	@FindBy(css = "#post-7 > div > div > div > p")
	WebElement messsage;

	public String getMessage() {

		By message = By.cssSelector("#post-7 > div > div > div > p");

		WaitFor.elementToBeVisiable(message);

//		By msg = By.cssSelector("#post-7 > div > div > div > p");
//		WaitFor.elementToBePresentInList(msg);
		return messsage.getText();

	}

	@FindBy(css = "li.woocommerce-order-overview__order.order strong")
	WebElement orderNo;

	public String getOrderNumber() {
		return orderNo.getText();
	}

	@FindBy(css = "#post-7 > div > div > div > ul > li.woocommerce-order-overview__date.date > strong")
	WebElement date;

	public String getDate() {
		return date.getText();
	}

	@FindBy(css = "#post-7 > div > div > div > ul > li.woocommerce-order-overview__total.total > strong > span > bdi")
	WebElement finalPrice;

	public String getFinalPrice() {
		return finalPrice.getText();
	}

}
