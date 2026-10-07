package Cucumber.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Cucumber/Feature",
glue="Cucumber.StepDefs", tags="@ScenarioOutline",dryRun = false)
public class runner2 {
}
