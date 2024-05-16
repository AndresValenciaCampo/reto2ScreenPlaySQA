package com.falabella.task;

import com.falabella.interactions.ClickQuantityProduct;

import com.falabella.interactions.ClickRandomProductSize;
import com.falabella.interactions.GetProductNameDescription;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.falabella.ui.DescriptionProductUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class DescriptionProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                ClickQuantityProduct.clickQuantity(),
                GetProductNameDescription.items(),
                Click.on(BTN_CHOOSE_OPTIONS),
                ClickRandomProductSize.selectRandomSize(),
                Click.on(BTN_ADD_CART),
                Click.on(BTN_GO_TO_CART)

        );


    }

    public static Performable descriptionTask() {
        return instrumented(DescriptionProductTask.class);

    }
}
