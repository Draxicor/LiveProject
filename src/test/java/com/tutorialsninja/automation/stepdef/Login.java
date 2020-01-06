package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.MyAccountPage;

import io.cucumber.java.en.*;


public class Login {

	HeadersSection headersSection = new HeadersSection();
	LoginPage loginPage = new LoginPage();
	MyAccountPage myAccountPage = new MyAccountPage();
	
	
	@Given("I navigate to Account Login page")
	public void i_navigate_to_Account_Login_page() {
	
		Elements.click(HeadersSection.myAccountLink);
		Elements.click(HeadersSection.login);
	}

	@When("I login to the Application using Username {string} and Password {string}")
	public void i_login_to_the_Application_using_Username_and_Password(String email, String password)  {
		LoginPage.doLogin(email, password);
	}

	@Then("I should see that the User is able to login successfully")
	public void i_should_see_that_the_User_is_able_to_login_successfully() {
	    Assert.assertTrue(Elements.isDisplayed(MyAccountPage.registerffiliateAccount));
	}
}
