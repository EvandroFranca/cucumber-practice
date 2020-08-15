package cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-report/cucumber.json"},
        features = {"src/test/resources/cucumber/features"},
        glue = {"cucumber/steps"}
                )

public class RunnerTest {
}
