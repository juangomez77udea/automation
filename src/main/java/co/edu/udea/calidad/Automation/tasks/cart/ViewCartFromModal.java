package co.edu.udea.calidad.Automation.tasks.cart;

import co.edu.udea.calidad.Automation.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewCartFromModal implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.VIEW_CART_BUTTON_IN_MODAL)
        );
    }

    public static Performable click() {
        return instrumented(ViewCartFromModal.class);
    }
}