package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.AccountSuccess;
import com.tutorialsninja.automation.pages.HeadersSection;
import com.tutorialsninja.automation.pages.RegisterPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;



public class Register {

	HeadersSection headerSection = new HeadersSection();
	RegisterPage registerPage = new RegisterPage();
	AccountSuccess accountSuccess = new AccountSuccess();
	
	
	@Given("^I launch the application$")
	public void i_launch_the_application()  {
	    Base.driver.get(Base.reader.getUrl());
	}

	@And("^I navigate to Account Registration page$")
	public void i_naviate_to_Account_Registration_page()  {
	    Elements.click(HeadersSection.myAccountLink);
	    Elements.click(HeadersSection.register);
	}

	@When("^I provide all the bellow details$")
	public void i_provide_all_the_bellow_details(DataTable dataTable) {
	
		RegisterPage.enterAllDetails(dataTable);
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy() {
	   Elements.click(RegisterPage.privacyPolicy);
	}

	@And("^I click the continue button$")
	public void i_click_the_continue_button() throws Throwable {
	    Elements.click(RegisterPage.continueButton);
	}

	@Then("^I should see the user account was created successfully$")
	public void i_should_see_the_user_account_was_created_successfully()  {
	    
		Assert.assertTrue(Elements.isDisplayed(AccountSuccess.successBreadcrumb));
		
		
	}
	
	@Then("^I should see that the User Account is not created$")
	public void i_should_see_that_the_User_Account_is_not_created() {
	    Elements.isDisplayed(RegisterPage.registerBreadcrumb);
	    //do boolean logic
	}

	@And("^I should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields() {
	    
	}

	
}
