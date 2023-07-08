package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DescriptionProductUI {

public static final Target INPUT_TXT = Target.the("Input quantity product")
        .locatedBy("//input[@id='quantity-selector-increment-input']");


    public static final Target BTN_CART = Target.the("Add to cart product")
            .locatedBy("//button[@id='add-to-cart-button']");


    public static final Target BTN_CART_PURCHASE = Target.the("Go to cart page")
            .locatedBy("//a[@id='linkButton']");


    public static final Target  TXT_PAGE_TITLE= Target.the("The title of the product")
            .locatedBy("//section[2]/div[1]/div[2]/h1/div");




}
