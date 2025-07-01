package co.edu.udea.calidad.Automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target PRODUCT_NAME_IN_CART = Target.the("Nombre del producto en el carrito")
            .locatedBy("//td[@class='cart_description']/h4/a");

}