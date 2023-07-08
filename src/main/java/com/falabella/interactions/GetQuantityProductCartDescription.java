package com.falabella.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static com.falabella.ui.CartProductUI.TXT_QUANTITY_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetQuantityProductCartDescription implements Interaction {

private static String quantityCart;
    @Override
    public <T extends Actor> void performAs(T actor) {

        quantityCart = TXT_QUANTITY_PRODUCT.resolveFor(actor).getValue();


    }

    public static Performable item(){
        return instrumented(GetQuantityProductCartDescription.class);
    }

    public static String data2(){
        return quantityCart;
    }

}
