package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;


public class CatalogUI {

    public static final Target LBL_NAME_PRODUCT = Target.the("products collection")
            .locatedBy("#testId-searchResults-products > div");

}
