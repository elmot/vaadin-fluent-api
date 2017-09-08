package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.ui.Button;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public abstract class FluentButton extends FluentComponent<Button> {

    public FluentButton() {
        super(new Button());
    }

    public void click(Button.ClickListener listener) {
        this.component.addClickListener(listener);
    }

    public abstract void clickShortcut(int keyCode, int... modifiers);

    public abstract void disableOnClick(boolean disableOnClick);

    public abstract void iconAlternateText(String iconAltText) ;
}