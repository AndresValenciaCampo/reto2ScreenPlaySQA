package com.falabella.interactions;

import com.falabella.utils.LeerExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.falabella.ui.DescriptionProductUI.INPUT_TXT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickQuantityProduct implements Interaction {
    String quantity;
    @Override
    public <T extends Actor> void performAs(T actor) {

        ArrayList<Map<String, String>> data = null;
        try {
            data = LeerExcel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Product");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        quantity = data.get(0).get("Quantity");

        actor.attemptsTo(Clear.field(INPUT_TXT));
        actor.attemptsTo(Enter.theValue(quantity).into(INPUT_TXT));

    }

    public static Performable clickQuantity(){
        return instrumented(ClickQuantityProduct.class);
    }
}
