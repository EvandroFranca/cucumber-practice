package practice.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import practice.util.GlobalHooks;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber-report/cucumber.json"},
        features = {"src/test/resources/features"},
        glue = {"practice/steps"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@api_user"
                )

public class RunnerTest extends GlobalHooks {
}
