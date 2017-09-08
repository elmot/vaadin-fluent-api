package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.TextArea;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public abstract class FluentTextArea extends FluentComponent<TextArea> {

    public FluentTextArea() {
        super(new TextArea());
    }

    public abstract void value(String value);

    public void valueChangeListener(HasValue.ValueChangeListener<String> listener) {
        this.component.addValueChangeListener(listener);
    }

    public abstract void  requiredIndicatorVisible(boolean requiredIndicatorVisible);

    public abstract void readOnly(boolean readOnly);
}
