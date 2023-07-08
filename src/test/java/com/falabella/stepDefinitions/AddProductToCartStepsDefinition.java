package com.falabella.stepDefinitions;

import com.falabella.questions.ValidateProductName;
import com.falabella.questions.ValidateProductQuantity;
import com.falabella.task.CartProductTask;
import com.falabella.task.CatalogTask;
import com.falabella.task.DescriptionProductTask;
import com.falabella.task.HomeTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductToCartStepsDefinition {
    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("the user is in the homepage and enter product in the search bar")
    public void theUserIsInTheHomepageAndEnterProductInTheSearchBar() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://www.falabella.com.co/falabella-co")

        );
    }

    @When("the user select a random product from the results list and add units of the same product")
    public void theUserSelectARandomProductFromTheResultsListAndAddUnitsOfTheSameProduct() {

        theActorInTheSpotlight().attemptsTo(
                HomeTask.Home(),
                CatalogTask.catalogTasK()

        );
    }

    @When("the user click on add to cart button")
    public void theUserClickOnAddToCartButton() {

        theActorInTheSpotlight().attemptsTo(
                DescriptionProductTask.descriptionTask(),
                CartProductTask.on()

        );

    }

    @Then("the product name and the units in the shopping cart should be the same from the description page")
    public void theProductNameAndTheUnitsInTheShoppingCartShouldBeTheSameFromTheDescriptionPage() {

        theActorInTheSpotlight().should(
                seeThat(ValidateProductName.validateNames(), Matchers.equalTo(true)),
                seeThat(ValidateProductQuantity.validateQuantities(),Matchers.equalTo(true))

        );

    }
}
