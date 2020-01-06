package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;



@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/Search.feature","classpath:FeatureFiles/Login.feature","classpath:FeatureFiles/Register.feature"},
glue={"classpath:com.tutorialsninja.automation.stepdef"},
plugin={"html:target/cucumber_html_report"}

)
public class Runner {
	
	

}