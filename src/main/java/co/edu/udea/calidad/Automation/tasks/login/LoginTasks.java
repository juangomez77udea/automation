package co.edu.udea.calidad.Automation.tasks.login;

import co.edu.udea.calidad.Automation.interactions.login.FillLoginForm;
import co.edu.udea.calidad.Automation.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTasks implements Task {

    private final String email;
    private final String password;

    public LoginTasks(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                FillLoginForm.with(this.email, this.password)
        );
    }

    public static Performable withCredentials(String email, String password) {
        return instrumented(LoginTasks.class, email, password);
    }

    public static Performable clickLoginSignupButton() {
        return Click.on(LoginPage.SIGNUP_LOGIN_BUTTON);
    }
}