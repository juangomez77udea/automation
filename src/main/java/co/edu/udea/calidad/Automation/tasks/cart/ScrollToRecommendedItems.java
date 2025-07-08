package co.edu.udea.calidad.Automation.tasks.cart;

import co.edu.udea.calidad.Automation.interactions.addToCart.ScrollUntilVisible;
import co.edu.udea.calidad.Automation.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollToRecommendedItems implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ScrollUntilVisible.to(HomePage.RECOMMENDED_ITEMS_TITLE)
        );
    }

    public static Performable andVerify() {
        return instrumented(ScrollToRecommendedItems.class);
    }
}