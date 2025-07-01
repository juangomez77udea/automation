package co.edu.udea.calidad.Automation.tasks.cart;

import co.edu.udea.calidad.Automation.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddRecommendedProduct implements Task {

    private final String productName;

    public AddRecommendedProduct(String productName) {
        this.productName = productName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // 1. Hace clic en el botón 'Add to cart' del producto especificado
                Click.on(HomePage.ADD_TO_CART_RECOMMENDED_PRODUCT.of(productName)),
                // 2. Espera a que el modal de confirmación aparezca
                WaitUntil.the(HomePage.ADDED_TO_CART_MODAL, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static Performable named(String productName) {
        return instrumented(AddRecommendedProduct.class, productName);
    }
}