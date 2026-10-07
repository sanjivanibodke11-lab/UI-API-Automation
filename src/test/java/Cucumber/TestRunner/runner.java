package Cucumber.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Cucumber/Feature/sample.feature",
glue="Cucumber.StepDefs", tags="@Sanity")
public class runner {
}
