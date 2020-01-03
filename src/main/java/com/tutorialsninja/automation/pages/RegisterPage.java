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
	
	public static void enterAllDetails(DataTable dataTable) {
		 Map<String, String> map = dataTable.asMap(String.class,String.class);
		   
		   Elements.TypeText(RegisterPage.firstName, map.get("FirstName"));
		   Elements.TypeText(RegisterPage.lastName, map.get("LastName"));
		   Elements.TypeText(RegisterPage.email, System.currentTimeMillis()+map.get("Email"));
		   //Elements.TypeText(RegisterPage.email, map.get("Email"));
		   Elements.TypeText(RegisterPage.telephone, map.get("Telephone"));
		   Elements.TypeText(RegisterPage.password, map.get("Password"));
		   Elements.TypeText(RegisterPage.confirmPassword, map.get("Password"));
	}
}
