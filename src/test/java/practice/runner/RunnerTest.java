package practice.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-report/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"practice/steps"},
        //junit = "--step-notifications",
        snippets = CucumberOptions.SnippetType.CAMELCASE
                )

public class RunnerTest {
}
