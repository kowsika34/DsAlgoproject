package Testrunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue={"StepDefinition", "Hooks"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HTMLReports",
		"com.aventstack.extentreports.cucumber.adpter.ExtentCucumberAdpter:",
		"timeline:test-output-thread/"
		}
)
public class testrunner1  {
	
	
	
	
}


