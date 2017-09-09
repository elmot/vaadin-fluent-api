package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.CheckBox;
import org.vaadin.addon.elmot.fluent.gen.BasedOnVaadinComponent;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
@BasedOnVaadinComponent(CheckBox.class)
public abstract class FluentCheckBox extends FluentComponent<CheckBox> {

    public FluentCheckBox() {
        super(new CheckBox());
    }

    public abstract void value(Boolean value);

    /**
     * Fluent API for {@link com.vaadin.ui.CheckBox#addValueChangeListener(HasValue.ValueChangeListener)}
     *
     * @return self object
     */
    public void valueChangeListener(HasValue.ValueChangeListener<Boolean> listener) {
        this.component.addValueChangeListener(listener);
    }

    public abstract void requiredIndicatorVisible(boolean requiredIndicatorVisible);

    public abstract void readOnly(boolean readOnly);

}
