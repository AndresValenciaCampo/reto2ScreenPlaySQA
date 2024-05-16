package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public final static Target TXT_SEARCH= Target.the("Textbox search")
            .locatedBy("//input[@id='testId-SearchBar-Input']");

}
