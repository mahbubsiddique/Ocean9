package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "steps"	
		)

public class SmokeTestRunner extends AbstractTestNGCucumberTests{

}
