package co.edu.udea.calidad.Automation.interactions.login;

import co.edu.udea.calidad.Automation.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillLoginForm implements Interaction {

    private final String email;
    private final String password;

    public FillLoginForm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(LoginPage.EMAIL_INPUT),
                Enter.theValue(password).into(LoginPage.PASSWORD_INPUT),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    public static FillLoginForm with(String email, String password) {
        return instrumented(FillLoginForm.class, email, password);
    }
}