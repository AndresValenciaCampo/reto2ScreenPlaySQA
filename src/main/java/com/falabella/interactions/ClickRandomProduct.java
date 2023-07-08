package com.falabella.interactions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.Random;

import static com.falabella.ui.CatalogUI.LBL_NAME_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRandomProduct implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        ListOfWebElementFacades Listproducts = LBL_NAME_PRODUCT.resolveAllFor(actor);

        Random random = new Random();
        int indexRandom = random.nextInt(Listproducts.size());

        Listproducts.get(indexRandom).click();
    }

    public static Performable click(){
        return  instrumented(ClickRandomProduct.class);
    }
}
