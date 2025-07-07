package co.edu.udea.calidad.Automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login/page_home_automation.feature",
        glue = "co.edu.udea.calidad.Automation.stepdefinitions",
        tags = "@LoginIncorrecto",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginIncorrectoRunner {

}