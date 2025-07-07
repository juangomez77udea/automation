package co.edu.udea.calidad.Automation.stepdefinitions;

import co.edu.udea.calidad.Automation.questions.LoginQuestions;
import co.edu.udea.calidad.Automation.tasks.login.LoginTasks;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario se encuentra en la página de inicio de sesión de Automation Exercise")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesion() {
        OnStage.theActorCalled("user").wasAbleTo(
                Open.url("http://automationexercise.com")
        );
    }

    @When("hace clic en el boton {string}")
    public void haceClicEnElBoton(String buttonName) {
        theActorInTheSpotlight().attemptsTo(
                LoginTasks.clickLoginSignupButton()
        );
    }

    @Then("verifica que {string} está visible")
    public void verificaQueEstaVisible(String expectedText) {
        theActorInTheSpotlight().should(
                seeThat(LoginQuestions.loginPageTitle(), equalTo(expectedText))
        );
    }

    @When("ingresa el correo electrónico incorrecto {string} y la contraseña {string}")
    public void ingresaElCorreoIncorrectoYContrasena(String email, String password) {
        theActorInTheSpotlight().attemptsTo(
                LoginTasks.withCredentials(email, password)
        );
    }

    @Then("el mensaje de error {string} está visible")
    public void elMensajeDeErrorEstaVisible(String expectedErrorMessage) {
        theActorInTheSpotlight().should(
                seeThat(LoginQuestions.errorMessage(), equalTo(expectedErrorMessage))
        );
    }
}