package co.edu.udea.calidad.Automation.stepdefinitions;

import co.edu.udea.calidad.Automation.questions.CartQuestions;
import co.edu.udea.calidad.Automation.tasks.cart.AddRecommendedProduct;
import co.edu.udea.calidad.Automation.tasks.cart.ScrollToRecommendedItems;
import co.edu.udea.calidad.Automation.tasks.cart.ViewCartFromModal;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class AddToCartStepDefinitions {

    @When("the user scrolls down to the recommended items section")
    public void userScrollsDownToTheRecommendedItemsSection() {
        // ¡ACCIÓN! Llama a la Tarea para hacer scroll
        theActorInTheSpotlight().attemptsTo(
                ScrollToRecommendedItems.andVerify()
        );
    }

    @When("the user adds the {string} recommended product to the cart")
    public void userAddsTheRecommendedProductToTheCart(String productName) {
        // ¡ACCIÓN! Llama a la Tarea para agregar el producto, pasándole el nombre
        theActorInTheSpotlight().attemptsTo(
                AddRecommendedProduct.named(productName)
        );
    }

    @When("the user clicks on the 'View Cart' button in the confirmation modal")
    public void userClicksOnTheViewCartButtonInTheConfirmationModal() {
        // ¡ACCIÓN! Llama a la Tarea para hacer clic en el botón del modal
        theActorInTheSpotlight().attemptsTo(
                ViewCartFromModal.click()
        );
    }

    @Then("the user should see {string} displayed in the cart page")
    public void userShouldSeeDisplayedInTheCartPage(String productName) {
        // ¡VERIFICACIÓN! El actor DEBERÍA VER QUE la pregunta del nombre del producto es IGUAL A el nombre esperado.
        theActorInTheSpotlight().should(
                seeThat(CartQuestions.theProductInTheCart(), equalTo(productName))
        );
    }
}