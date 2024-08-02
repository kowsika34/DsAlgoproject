package Testrunner;


	import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features/signin2.feature",
	glue={"StepDefinition", "Apphooks"},
	monochrome=true,
	plugin= {"pretty","junit:target/JUnitReports/report.xml",
			"json:target/JSONReports/report.json",
			"html:target/HTMLReports"}
	)
	public class Testrunner2 {
		
		
	}

			

	

