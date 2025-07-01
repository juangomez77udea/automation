package co.edu.udea.calidad.Automation.questions;

import co.edu.udea.calidad.Automation.userinterfaces.CartPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CartQuestions {

    /**
     * Crea una Pregunta para obtener el nombre del (primer) producto en la página del carrito.
     *
     * @return Una Question<String> que, cuando se resuelva, devolverá el nombre del producto.
     */
    public static Question<String> theProductInTheCart() {
        return actor -> Text.of(CartPage.PRODUCT_NAME_IN_CART).answeredBy(actor);
    }
}