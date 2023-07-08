package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartProductUI {

    public static final Target TXT_NAME_PRODUCT = Target.the("Cart product name")
            .locatedBy("//div[@class='css-1jbx2v6']/p");


    public static final Target TXT_QUANTITY_PRODUCT = Target.the("Quantity of product")
            .locatedBy("//div[@class='jsx-4231101419 product-count']/input");



}




