package runner;




import org.testng.annotations.BeforeTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Utility.ConfigFileReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@SuppressWarnings("unused")
//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue={"StepDefinition","Hooks"},
monochrome=true,
plugin= {"pretty","junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HTMLReports",
		//"com.aventstack.extentreports.cucumber.adpter.ExtentCucumberAdpter:",
		//"time line:test-output-thread/"
		},
 publish =true
)

public class testrunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
@BeforeTest
@Parameters({"browser"})
public void beforeTest(String browser) throws Throwable{
	ConfigFileReader.setBrowserType(browser);
	System.out.println(browser);
}
}
