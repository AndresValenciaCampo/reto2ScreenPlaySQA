package com.falabella.task;

import com.falabella.interactions.GetProductNameCartDescription;
import com.falabella.interactions.GetQuantityProductCartDescription;
import com.falabella.interactions.GetQuantityProductExel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CartProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                GetProductNameCartDescription.items(),
                GetQuantityProductExel.dataQuantity(),
                GetQuantityProductCartDescription.item()

        );

    }

    public static Performable on() {
        return instrumented(CartProductTask.class);
    }
}
