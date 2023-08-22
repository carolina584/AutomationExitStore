package co.com.choucair.exitstore.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue="co.com.choucair.exitstore.stepdefinitions",
        snippets=SnippetType.CAMELCASE)
public class ExitStoreRunner {

	
}
