package com.falabella.task;

import com.falabella.utils.LeerExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.falabella.ui.HomeUI.TXT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;



public class HomeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String product;
        try {
            ArrayList<Map<String, String>> data = LeerExcel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Product");
            product = data.get(0).get("Product");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(

                Enter.theValue(product).into(TXT_SEARCH).thenHit(Keys.ENTER)
        );
    }

    public static Performable Home() {
        return instrumented(HomeTask.class);
    }


}

