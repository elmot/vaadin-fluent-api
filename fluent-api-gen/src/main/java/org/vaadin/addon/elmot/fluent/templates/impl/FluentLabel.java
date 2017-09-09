package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Label;
import org.vaadin.addon.elmot.fluent.gen.BasedOnVaadinComponent;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
@BasedOnVaadinComponent(Label.class)
public abstract class FluentLabel extends FluentComponent<Label> {

    public FluentLabel() {
        super(new Label());
    }

    public abstract void contentMode(ContentMode contentMode);

    public abstract void value(String value);

    /**
     * Fluent API for
     * {@link com.vaadin.ui.Label#setValue(String)} and
     * {@link com.vaadin.ui.Label#setContentMode(ContentMode)}
     *
     * @return self object
     */
    public void preformatted(String value) {
        this.component.setValue(value);
        this.component.setContentMode(ContentMode.PREFORMATTED);
    }

    /**
     * Fluent API for
     * {@link com.vaadin.ui.Label#setValue(String)} and
     * {@link com.vaadin.ui.Label#setContentMode(ContentMode)}
     *
     * @return self object
     */
    public void html(String value) {
        this.component.setValue(value);
        this.component.setContentMode(ContentMode.HTML);
    }
}
