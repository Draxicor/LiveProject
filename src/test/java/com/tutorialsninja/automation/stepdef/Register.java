package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.sun.tools.sjavac.Log;
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
	
		RegisterPage.enterAllRegistrationDetails(dataTable, "valid");
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy() {
	   Elements.click(RegisterPage.privacyPolicy);
	}

	@And("^I click the continue button$")
	public void i_click_the_continue_button() {
	    Elements.click(RegisterPage.continueButton);
	}

	@Then("^I should see the user account was created successfully$")
	public void i_should_see_the_user_account_was_created_successfully()  {
	    
		Assert.assertTrue(Elements.isDisplayed(AccountSuccess.successBreadcrumb));
		
		
	}
	
	@Then("^I should see that the User Account is not created$")
	public void i_should_see_that_the_User_Account_is_not_created() {
	   Assert.assertTrue(Elements.isDisplayed(RegisterPage.registerBreadcrumb));
	}

	@And("^I should see the error messages informing the user to fill the mandatory fields$")
	public void i_should_see_the_error_messages_informing_the_user_to_fill_the_mandatory_fields() {
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.warning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.firstNamewarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.lastNamewarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.emailWarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.telephoneWarning));
	    Assert.assertTrue(Elements.isDisplayed(RegisterPage.passwordWarning));
	}

	@And("^I subscribe to Newsletter$")
	public void i_subscribe_to_Newsletter() {
	    Elements.click(RegisterPage.newsletterYes);
	}
	
	@When("^I provide the below duplicate details into the fields$")
	public void i_provide_the_below_duplicate_details_into_the_fields(io.cucumber.datatable.DataTable dataTable) {
		RegisterPage.enterAllRegistrationDetails(dataTable, "duplicate");
	}

	@Then("^I should see the warning message stating that the user is already created$")
	public void i_should_see_the_warning_message_stating_that_the_user_is_already_created() {
		Assert.assertTrue(Elements.VerifyTextEquals(RegisterPage.warning, "Warning: E-Mail Address is already registered!"));
	}
}
