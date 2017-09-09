package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.ui.Button;
import org.vaadin.addon.elmot.fluent.gen.BasedOnVaadinComponent;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
@BasedOnVaadinComponent(Button.class)
public abstract class FluentButton extends FluentComponent<Button> {

    public FluentButton() {
        super(new Button());
    }

    /**
     * Fluent API for {@link com.vaadin.ui.Button#addClickListener(Button.ClickListener)}
     *
     * @return self object
     */
    public void click(Button.ClickListener listener) {
        this.component.addClickListener(listener);
    }

    /**
     * Fluent API for {@link Button#setClickShortcut}
     */
    public abstract void clickShortcut(int keyCode, int... modifiers);

    public abstract void disableOnClick(boolean disableOnClick);

    public abstract void iconAlternateText(String iconAltText) ;
}