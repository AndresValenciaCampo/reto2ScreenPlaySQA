package com.falabella.interactions;

import com.falabella.utils.LeerExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetQuantityProductExel implements Interaction {

private static String quantity;
    @Override
    public <T extends Actor> void performAs(T actor) {

        ArrayList<Map<String, String>> data = null;
        try {
            data = LeerExcel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Product");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        quantity = data.get(0).get("Quantity");

    }


    public static Performable dataQuantity(){
        return instrumented(GetQuantityProductExel.class);
    }

    public static String data1(){
        return quantity;
    }

}
