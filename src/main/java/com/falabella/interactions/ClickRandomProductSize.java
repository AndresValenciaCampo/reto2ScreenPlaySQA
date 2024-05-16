package com.falabella.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static com.falabella.ui.DescriptionProductUI.BTNS_SELECTION_SIZES_OPTIONS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRandomProductSize implements Interaction {

    private Target buttonContainer;
    public ClickRandomProductSize() {
        this.buttonContainer = BTNS_SELECTION_SIZES_OPTIONS;
    }

    private List<WebElementFacade> getEnabledButtons(List<WebElementFacade> allButtons) {
        return allButtons.stream()
                .filter(button -> !button.hasClass("disabled"))
                .collect(Collectors.toList());
    }
    private WebElementFacade getRandomElement(List<WebElementFacade> buttons) {
        return buttons.get(new Random().nextInt(buttons.size()));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> allButtons = buttonContainer.resolveAllFor(actor);
        List<WebElementFacade> enabledButtons = getEnabledButtons(allButtons);

        if (!enabledButtons.isEmpty()) {
            WebElementFacade randomButton = getRandomElement(enabledButtons);
            randomButton.click();
        }

    }

    public static Performable selectRandomSize(){
        return  instrumented(ClickRandomProductSize.class);
    }
}
