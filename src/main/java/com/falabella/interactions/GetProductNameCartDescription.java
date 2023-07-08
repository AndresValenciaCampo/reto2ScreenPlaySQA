package com.falabella.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static com.falabella.ui.CartProductUI.TXT_NAME_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class GetProductNameCartDescription implements Interaction {
    private static String nameProduct;
    @Override
    public <T extends Actor> void performAs(T actor) {

        nameProduct = TXT_NAME_PRODUCT.resolveFor(actor).getText();

    }
    public static Performable items(){
        return instrumented(GetProductNameCartDescription.class);
    }

    public static String productName(){
        return nameProduct;
    }

}
