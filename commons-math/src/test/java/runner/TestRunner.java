package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/Destination","json:target/cucumber.json" },features={"target/generated-test-sources/cucumber"},glue={"stepDefinition"},strict = true)

public class TestRunner {
	
}
