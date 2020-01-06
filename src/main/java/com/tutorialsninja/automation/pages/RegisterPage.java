package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import io.cucumber.datatable.DataTable;



public class RegisterPage {
	
	public RegisterPage() {
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(id="input-firstname")
	public static WebElement firstName;
	
	@FindBy(id="input-lastname")
	public static WebElement lastName;
	
	@FindBy(id="input-email")
	public static WebElement email;
	
	@FindBy(id="input-telephone")
	public static WebElement telephone;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(id="input-confirm")
	public static WebElement confirmPassword;
	 
	@FindBy(name="agree")
	public static WebElement privacyPolicy;
	
	@FindBy(css="div.container:nth-child(4) div.row div.col-sm-9 form.form-horizontal:nth-child(3) div.buttons:nth-child(4) div.pull-right > input.btn.btn-primary:nth-child(3)")
	public static WebElement continueButton;
	
	@FindBy(linkText="Register")
	public static WebElement registerBreadcrumb;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement warning;
	
	@FindBy(css="input[name='newsletter'][value='1']")
	public static WebElement newsletterYes;
	
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement firstNamewarning;
	
	@FindBy(css="input[id='input-lastname']+div")
	public static WebElement lastNamewarning;
	
	@FindBy(css="input[id='input-email']+div")
	public static WebElement emailWarning;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement telephoneWarning;
	
	@FindBy(css="input[id='input-password']+div")
	public static WebElement passwordWarning;
	
	
	
public static void enterAllRegistrationDetails(DataTable dataTable,String detailsType) {
		
		Map<String,String> map = dataTable.asMap(String.class,String.class);
		Elements.TypeText(RegisterPage.firstName,map.get("FirstName"));
		Elements.TypeText(RegisterPage.lastName,map.get("LastName"));
		Elements.TypeText(RegisterPage.telephone,map.get("Telephone"));
		Elements.TypeText(RegisterPage.password,map.get("Password"));
		Elements.TypeText(RegisterPage.confirmPassword,map.get("Password"));
		
		if(detailsType.equalsIgnoreCase("duplicate"))
			Elements.TypeText(RegisterPage.email,map.get("Email"));
		else
			Elements.TypeText(RegisterPage.email,System.currentTimeMillis()+map.get("Email"));
	
	}
}
