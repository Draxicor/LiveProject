package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckoutPage {
	
	public CheckoutPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="button-payment-address")
	public static WebElement continueButtonofBillingDetailsSection;
	
	@FindBy(id="button-shipping-address")
	public static WebElement continueButtonofDeliveryDetails;
	
	@FindBy(id="button-shipping-method")
	public static WebElement continueButtonOfDeliveryMethod;

	@FindBy(name="agree")
	public static WebElement termsOfConditions;
	
	@FindBy(id="button-payment-method")
	public static WebElement continueButtonofPaymentDetails;
	
	@FindBy(id="button-confirm")
	public static WebElement confirmOrderButon;
	
	public static void placeAnOrder() {
		Elements.click(continueButtonofBillingDetailsSection);
		Elements.click(continueButtonofDeliveryDetails);
		Elements.click(continueButtonOfDeliveryMethod);
		Elements.click(termsOfConditions);
		Elements.click(continueButtonofPaymentDetails);
		Elements.click(confirmOrderButon);
	
	}
}
