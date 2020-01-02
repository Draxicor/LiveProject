package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Register {

	@Given("^I launch the application$")
	public void i_launch_the_application()  {
	    Base.driver.get(Base.reader.getUrl());
	}

	@And("^I naviate to Account Registration page$")
	public void i_naviate_to_Account_Registration_page()  {
	    
	}

	@When("^I provide all the bellow details$")
	public void i_provide_all_the_bellow_details(DataTable dataTable) {
	   
	}

	@And("^I select the privacy policy$")
	public void i_select_the_privacy_policy() {
	   
	}

	@And("^I click the continue button$")
	public void i_click_the_continue_button() throws Throwable {
	    
	}

	@Then("^I should see the user account was created successfully$")
	public void i_should_see_the_user_account_was_created_successfully() throws Throwable {
	    
	}

	
}
