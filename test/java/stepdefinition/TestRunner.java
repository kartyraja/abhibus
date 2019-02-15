

package stepdefinition;


import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature/feature.feature", dryRun=false,glue = { "stepdefinition" }, plugin = {
		"html:target1" } )
public class TestRunner {

}
