package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class DescriptionProductUI {

public static final Target INPUT_TXT = Target.the("Input quantity product")
        .locatedBy("//input[@id='quantity-selector-increment-input']");


    public static final Target  TXT_PAGE_TITLE= Target.the("The title of the product")
            .locatedBy("//*[@id=\"product-b2c-ui\"]/div[1]/div[2]/div[2]/section[2]/div[1]/div[2]/h1");


    public static final Target BTN_CHOOSE_OPTIONS = Target.the("Choose size options")
            .locatedBy("//button[@id='add-to-cart-button']");

    public static final Target BTNS_SELECTION_SIZES_OPTIONS = Target.the("Choose a specific size options")
            .locatedBy("//*[@id=\"__next\"]/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/button");



    public static final Target SELECT_SIZE = Target.the("Select product size")
            .locatedBy("//*[@id=product-b2c-ui]/div[1]/div[2]/div[2]/section[2]/div[2]/div/div[1]/div[3]/div[2]/button");


    public static final Target BTN_ADD_CART = Target.the("Add to cart")
            .locatedBy("//*[@id=\"add-to-cart-button-lightbox\"]");

    public static final Target BTN_GO_TO_CART = Target.the("Go to cart page")
            .locatedBy("//*[@id=\"linkButton\"]");




}
