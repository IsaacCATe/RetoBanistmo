package co.com.Banistmo.Reto.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions
        (
                features = "src/test/resources/features",
                tags = "@Open",
                glue =    "co.com.Banistmo.Reto.stepdefinitions",
                plugin = "pretty",
                snippets = CucumberOptions.SnippetType.CAMELCASE
        )

@RunWith(CucumberWithSerenity.class)

public class RunnerTag {
}
