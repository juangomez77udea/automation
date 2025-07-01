package co.edu.udea.calidad.Automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/cart/add_recommended_item.feature",
        glue = "co.edu.udea.calidad.Automation.stepdefinitions",
        tags = "@AddToCart",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AddRecommendedItemRunner {

}