package com.tutorialsninja.automation.stepdef;




import org.junit.Assert;
import org.openqa.selenium.support.ui.Wait;

import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.CheckoutPage;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchResultPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import io.cucumber.java.en.*;

public class Orders {

	HeadersSection headersections = new HeadersSection();
	LoginPage loginpage = new LoginPage();
	SearchResultPage searchresultspage = new SearchResultPage();
	ShoppingCartPage shoppingcartpage = new ShoppingCartPage();
	CheckoutPage checkoutpage = new CheckoutPage();
	OrderSuccessPage ordersuccesspage = new OrderSuccessPage();
	
	
	@Given("I login to the application")
	public void i_login_to_the_application() {
	    Browser.openApplicationURL();
	    HeadersSection.navigateToLoginPage();
	    LoginPage.doLogin();
	    
	}

	

	@When("I add any product to Bag and checkout")
	public void i_add_any_product_to_Bag_and_checkout() {
	    HeadersSection.searchProduct();
	    SearchResultPage.addFirstProductInSearchResultsToCart();
	    HeadersSection.navigateToSHoppingCartPage();
	    ShoppingCartPage.navigateToCheckoutPage();
	}

	@When("I place an order")
	public void i_place_an_order() {
	   CheckoutPage.placeAnOrder();
	}

	@Then("I should see that the order is placed successfully")
	public void i_should_see_that_the_order_is_placed_successfully() {
	   
		Waits.waitUntilElementLocated(5, OrderSuccessPage.successBreadcrumb);
		Assert.assertTrue(Elements.isDisplayed(OrderSuccessPage.successBreadcrumb));
	}

}
