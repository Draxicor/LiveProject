package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)

@CucumberOptions(
		//code to generate the HTML reports in the "target" folder
		plugin= {"html:target/cucumber_html_report"},
		//code to direct the features and step definitions folder
		features= {"classpath:FeatureFiles/Register.feature"},
		glue= {"classpath:com.tutorialsninja.automation.stepdef"},
		//code to run just the tagged scenarios/not run the ~ scenarios
		tags= {"@Register","@One"}
		//{"@Books,@Baby"} runs cases with any of those tags
		//{"@Books","@Baby"} only runs cases that have both those tags
		
		
		
		)
public class Runner {

}
