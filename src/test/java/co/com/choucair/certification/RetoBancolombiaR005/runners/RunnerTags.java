package co.com.choucair.certification.RetoBancolombiaR005.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/validatePDF.feature",
        tags = "@stories",
        glue = "co.com.choucair.certification.RetoBancolombiaR005.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}
