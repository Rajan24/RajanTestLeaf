package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "src/test/java/features/Login.feature",glue = "teststep")
@RunWith(Cucumber.class)
public class RunTest {
	
	

}
