package co.edu.udea.calidad.Automation.tasks.cart;

import co.edu.udea.calidad.Automation.interactions.addToCart.ClickAndConfirm;
import co.edu.udea.calidad.Automation.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddRecommendedProduct implements Task {

    private final String productName;

    public AddRecommendedProduct(String productName) {
        this.productName = productName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickAndConfirm.on(HomePage.ADD_TO_CART_RECOMMENDED_PRODUCT.of(productName))
        );
    }

    public static Performable named(String productName) {
        return instrumented(AddRecommendedProduct.class, productName);
    }
}