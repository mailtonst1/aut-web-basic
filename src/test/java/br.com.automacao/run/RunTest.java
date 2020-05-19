package br.com.automacao.run;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        strict = true,
        plugin = {"json:target/cucumber.json"},
        features = "features",
        tags = {"@mailton"},
        glue = "br/com/automacao/steps"
)
public class RunTest {


}