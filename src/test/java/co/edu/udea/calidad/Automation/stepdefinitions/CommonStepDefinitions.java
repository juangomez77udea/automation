package co.edu.udea.calidad.Automation.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CommonStepDefinitions {

    /**
     * Este método se ejecuta ANTES de cada escenario.
     * Prepara el "escenario" (Stage) con un "elenco en línea" (OnlineCast).
     */
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    /**
     * Este es el paso reutilizable para abrir la página de inicio.
     * Coincide con "Given the user is on the Automation Exercise home page"
     */
    @Given("the user is on the Automation Exercise home page")
    public void userIsOnTheHomePage() {
        OnStage.theActorCalled("user").wasAbleTo(
                Open.url("http://automationexercise.com")
        );
    }
}