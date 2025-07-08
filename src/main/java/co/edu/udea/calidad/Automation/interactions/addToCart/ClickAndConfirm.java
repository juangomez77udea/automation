// En: co.edu.udea.calidad.Automation.interactions
package co.edu.udea.calidad.Automation.interactions.addToCart;

import co.edu.udea.calidad.Automation.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickAndConfirm implements Interaction {

    private final Target targetToClick;

    public ClickAndConfirm(Target targetToClick) {
        this.targetToClick = targetToClick;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(targetToClick),
                WaitUntil.the(HomePage.ADDED_TO_CART_MODAL, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static ClickAndConfirm on(Target targetToClick) {
        return instrumented(ClickAndConfirm.class, targetToClick);
    }
}