package br.com.automacao.run;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        strict = false,
        monochrome = false,
        plugin = {"json:target/cucumber.json", "pretty","html:target/cucumber-reports"},
        features = "features",
        tags = {"@wip"},
        glue = "br.com.automacao/steps",
        snippets = SnippetType.CAMELCASE
)
public class RunTest {


}