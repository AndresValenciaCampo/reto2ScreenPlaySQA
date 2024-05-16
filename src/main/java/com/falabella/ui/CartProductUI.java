package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;


public class CartProductUI {

    public static final Target TXT_NAME_PRODUCT = Target.the("Cart product name")
            .locatedBy("//*[@class='chakra-stack css-1r5t03m']/a[@class='chakra-link css-1esjgy4']");


    public static final Target TXT_QUANTITY_PRODUCT = Target.the("Quantity of product")
            .locatedBy("//div[@id=\"__next\"]/div/div[1]/div/section[1]/div/div[3]/div/div/div/div[2]/div/div[1]/div/div[4]/div/div/div/input");


}
