package com.falabella.questions;

import com.falabella.interactions.GetQuantityProductCartDescription;
import com.falabella.interactions.GetQuantityProductExel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateProductQuantity implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {

        String quantityExel = GetQuantityProductExel.data1();
        System.out.println("quantity en validateProduct " + quantityExel);


        String quantityCart = GetQuantityProductCartDescription.data2();
        System.out.println("quantityCart en validateProduct " + quantityCart);


        return quantityExel.equals(quantityCart);
    }

    public static ValidateProductQuantity validateQuantities() {
        return new ValidateProductQuantity();
    }
}
