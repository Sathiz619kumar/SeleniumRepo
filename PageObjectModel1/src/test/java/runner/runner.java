package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/TC_002_CreateLead.feature", glue="stepsDefinition", monochrome=true, publish=true)
public class runner extends AbstractTestNGCucumberTests {

}
