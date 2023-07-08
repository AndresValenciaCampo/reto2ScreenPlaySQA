package com.falabella.questions;

import com.falabella.interactions.GetProductNameCartDescription;
import com.falabella.interactions.GetProductNameDescription;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateProductName implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {


        String productNameDescription = GetProductNameDescription.productName();


        String productNameCartDescription = GetProductNameCartDescription.productName();


        return productNameDescription.equals(productNameCartDescription);
    }

    public static ValidateProductName validateNames() {
        return new ValidateProductName();
    }

}

