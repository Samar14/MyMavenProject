package fourstayrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//we need to tell cucumber which feature file we want to run.
@CucumberOptions(
	    //run this feature under the fuature file.
		features="src/test/resources/feature",
		glue="fourstay/step_def",
		tags="@Justtest",
		dryRun=false
		)

public class TestRunner {

}
