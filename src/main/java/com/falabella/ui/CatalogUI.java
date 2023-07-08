package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CatalogUI {

    public static final Target LBL_NAME_PRODUCT = Target.the("products collection")
            .locatedBy("//div[@class='jsx-1576191951 pod-title-wrapper' and not(@is-empty)]");


}
