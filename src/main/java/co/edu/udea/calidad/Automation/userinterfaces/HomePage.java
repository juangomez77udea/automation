package co.edu.udea.calidad.Automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target RECOMMENDED_ITEMS_TITLE = Target.the("Titulo 'RECOMMENDED ITEMS'")
            .located(By.xpath("//h2[text()='recommended items']"));

    public static final Target ADD_TO_CART_RECOMMENDED_PRODUCT = Target.the("Boton 'Add to cart' para el producto recomendado '{0}'")
            .locatedBy("//div[contains(@class, 'recommended_items')]//p[text()='{0}']/following-sibling::a[contains(@class, 'add-to-cart')]");

    public static final Target ADDED_TO_CART_MODAL = Target.the("Modal de confirmacion 'Added!'")
            .located(By.id("cartModal"));

    public static final Target VIEW_CART_BUTTON_IN_MODAL = Target.the("Boton 'View Cart' en el modal")
            .located(By.xpath("//div[@id='cartModal']//a[@href='/view_cart']"));
}