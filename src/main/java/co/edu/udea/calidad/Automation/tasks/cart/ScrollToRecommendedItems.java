package co.edu.udea.calidad.Automation.tasks.cart;

import co.edu.udea.calidad.Automation.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ScrollToRecommendedItems implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // 1. Hace scroll hasta que el título 'RECOMMENDED ITEMS' sea visible
                Scroll.to(HomePage.RECOMMENDED_ITEMS_TITLE),
                // 2.  Espera explícitamente a que sea visible
                WaitUntil.the(HomePage.RECOMMENDED_ITEMS_TITLE, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static Performable andVerify() {
        return instrumented(ScrollToRecommendedItems.class);
    }
}