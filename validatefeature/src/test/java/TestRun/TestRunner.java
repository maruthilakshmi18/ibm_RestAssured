package TestRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Features/Login.feature",
		glue="steps",
		monochrome=true,
		dryRun=false,
		plugin= {"pretty", "html:BM_Test-Output"}
		
		
		)

public class TestRunner {

	
}
