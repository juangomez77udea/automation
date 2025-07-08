package co.edu.udea.calidad.Automation.interactions.addToCart;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ScrollUntilVisible implements Interaction {

    private final Target target;

    public ScrollUntilVisible(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(target),
                WaitUntil.the(target, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static ScrollUntilVisible to(Target target) {
        return instrumented(ScrollUntilVisible.class, target);
    }
}