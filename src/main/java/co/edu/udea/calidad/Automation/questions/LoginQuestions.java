package co.edu.udea.calidad.Automation.questions;

import co.edu.udea.calidad.Automation.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginQuestions {

    /**
     * Crea una Pregunta que obtiene el texto del título 'Login to your account'.
     *
     * @return Una Question<String> que, cuando se resuelva, devolverá el texto del elemento.
     */
    public static Question<String> loginPageTitle() {
        return actor -> Text.of(LoginPage.LOGIN_TO_ACCOUNT_TEXT).answeredBy(actor);
    }

    /**
     * Crea una Pregunta que obtiene el texto del mensaje de error de login.
     *
     * @return Una Question<String> que, cuando se resuelva, devolverá el texto del mensaje de error.
     */
    public static Question<String> errorMessage() {
        return actor -> Text.of(LoginPage.ERROR_MESSAGE).answeredBy(actor);
    }
}