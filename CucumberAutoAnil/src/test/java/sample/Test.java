package sample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(


plugin={"pretty",
		"html:target/cucumber-htmlreport",
		"json:target/cucumber-report1.json",
	"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
}
)
public class Test {
	
	

}
