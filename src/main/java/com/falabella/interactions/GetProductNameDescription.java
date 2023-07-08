package com.falabella.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;


import static com.falabella.ui.DescriptionProductUI.TXT_PAGE_TITLE;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class GetProductNameDescription implements Interaction {
    private static String productName;
    @Override
    public <T extends Actor> void performAs(T actor) {

        productName = TXT_PAGE_TITLE.resolveFor(actor).getText();


    }
    public static Performable items(){
        return instrumented(GetProductNameDescription.class);
    }
    public static String productName(){
        return productName;
    }

}
