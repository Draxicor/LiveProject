package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;



@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/Login.feature"},
glue={"classpath:com.tutorialsninja.automation.stepdef"},
plugin={"html:target/cucumber_html_report"},
tags={"@Login","@One"})
public class Runner {
	
	

}