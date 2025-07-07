package co.edu.udea.calidad.Automation.tasks.login;

import co.edu.udea.calidad.Automation.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTasks implements Task {

    private final String email;
    private final String password;

    // Constructor para cuando necesitemos pasar datos a la tarea
    public LoginTasks(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * Este es el método principal que se ejecuta cuando el actor realiza la tarea.
     * Contiene la secuencia de acciones a realizar.
     * @param actor El actor que está realizando la tarea.
     */

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // 1. Escribir el email en el campo de email
                Enter.theValue(email).into(LoginPage.EMAIL_INPUT),
                // 2. Escribir la contraseña en el campo de contraseña
                Enter.theValue(password).into(LoginPage.PASSWORD_INPUT),
                // 3. Hacer clic en el botón final de login
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    /**
     * Crear una instancia de la tarea
     * de una manera más legible en los Step Definitions.
     * @param email El email del usuario.
     * @param password La contraseña del usuario.
     * @return Una instancia de la tarea lista para ser ejecutada.
     */
    public static Performable withCredentials(String email, String password) {
        return instrumented(LoginTasks.class, email, password);
    }

    /**
     * Método estático para la acción simple de hacer clic en el botón inicial de login/signup.
     * Devuelve una acción 'Click' directamente, ya que no requiere datos.
     * @return La acción de hacer clic.
     */
    public static Performable clickLoginSignupButton() {
        return Click.on(LoginPage.SIGNUP_LOGIN_BUTTON);
    }
}