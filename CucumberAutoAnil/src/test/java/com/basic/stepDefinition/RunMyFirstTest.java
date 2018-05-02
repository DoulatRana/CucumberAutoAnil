package com.basic.stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		dryRun=false,
		features={"src/test/resources/com/basic/featurefile/"},
		glue={"com/basic/stepDefinition/"},

plugin={"pretty",
		"html:target/cucumber-htmlreport",
		"json:target/cucumber-report1.json",
	"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
}
)
public class RunMyFirstTest {
		
	

}
