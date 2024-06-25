package com.BellatrixFinalProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.BellatrixFinalProject.Keywords.Keyword;
import com.BellatrixFinalProject.Utilities.WaitFor;
import com.BellatrixFinalProject.stepDefinations.TestBase;

public class CheckoutPage {

	Keyword keyword = new Keyword();

	public CheckoutPage() {
		PageFactory.initElements(TestBase.getDriver(), this);
	}

	@FindBy(css = "#billing_first_name")
	WebElement firstName;

	public void getFirstName(String nameText) {
		firstName.sendKeys(nameText);
	}

	@FindBy(css = "#billing_last_name")
	WebElement lastName;

	public void getLastName(String lastNameText) {
		lastName.sendKeys(lastNameText);
	}

	@FindBy(css = "input#billing_company")
	WebElement company;

	public void enterCompanyName(String enterCompanyName) {
		company.sendKeys(enterCompanyName);
	}

	@FindBy(css = "select#billing_country")
	WebElement dropDownTab;

	public void selectCountyFromDropDown(String textToSelect) {
		keyword.dropDown(dropDownTab, textToSelect);
		
		
//		try {
//
//			// Wait until the element is visible and interactable
//			By button = By.cssSelector("#billing_country");
//			WaitFor.elementToBeVisiable(button);
//
//			// Perform actions on the element
//			keyword.dropDown(dropDownTab, textToSelect);
//		} catch (ElementNotInteractableException e) {
//			System.out.println("Element not interactable: " + e.getMessage());
//		}
	}


	@FindBy(css = "input#billing_address_1")
	WebElement streetAddress;

	public void streetAddress(String streetAddressText) {
		streetAddress.sendKeys(streetAddressText);

	}

	@FindBy(css = "input#billing_address_2")
	WebElement streetAddress2;

	public void streetAddress2(String streetAddressText2) {
		streetAddress2.sendKeys(streetAddressText2);

	}

	@FindBy(css = "input#billing_postcode")
	WebElement pincode;

	public void pincode(String pincodes) {
		pincode.sendKeys(pincodes);
	}

	@FindBy(css = "input#billing_city")
	WebElement town;

	public void entertownName(String townText) {
		town.sendKeys(townText);
	}

	@FindBy(css = "select#billing_state")
	WebElement state1;

	public void getStateName(String textToEnter) {
		keyword.dropDown(state1, textToEnter);
	}

	@FindBy(css = "input#billing_phone")
	WebElement phone;

	public void enterphoneNumber(String phoneText) {
		phone.sendKeys(phoneText);
	}

	@FindBy(css = "input#billing_email")
	WebElement email;

	public void enteremaildAddrss(String emailText) {
		email.sendKeys(emailText);
	}

	@FindBy(css = "input#createaccount")
	WebElement checkBox;

	public void clickOnAccountCreationCheckBox() {
		checkBox.click();
	}

	@FindBy(css = "button#place_order")
	WebElement placeOrderBtn;

	public void clickOnPlaceOrder() {
		placeOrderBtn.click();

	}

	// =========@@@@@@@==========
	// CheckoutLogin account details

	@FindBy(css = "input#username")
	WebElement login;

	public void loginInfo(String uname) {
		login.sendKeys(uname);

	}

	@FindBy(css = "input#password")
	WebElement pwd;

	public void loginPwd(String password) {
		pwd.sendKeys(password);
	}

	@FindBy(css = "button.woocommerce-button.button.woocommerce-form-login__submit")
	WebElement logIn;

	public void clickOnLogin() {
		logIn.click();
	}

	@FindBy(css = "#post-7 > div > div > div.woocommerce-form-login-toggle > div > a")
	WebElement clikHere;

	public void existingUserLogin() {
		clikHere.click();

	}

}