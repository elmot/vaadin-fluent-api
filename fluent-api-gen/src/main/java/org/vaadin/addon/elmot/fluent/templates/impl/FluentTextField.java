package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.TextField;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public abstract class FluentTextField extends FluentComponent<TextField> {

    public FluentTextField() {
        super(new TextField());
    }

    public abstract void value(String value);

    public void valueChangeListener(HasValue.ValueChangeListener<String> listener) {
        this.component.addValueChangeListener(listener);
    }

    public abstract void  requiredIndicatorVisible(boolean requiredIndicatorVisible);

    public abstract void readOnly(boolean readOnly);
}
