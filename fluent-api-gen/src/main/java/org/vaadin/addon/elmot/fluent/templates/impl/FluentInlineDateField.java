package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.InlineDateField;

import java.time.LocalDate;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public abstract class FluentInlineDateField extends FluentComponent<InlineDateField> {

    public FluentInlineDateField() {
        super(new InlineDateField());
    }

    public abstract void value(LocalDate value);

    public void valueChangeListener(HasValue.ValueChangeListener<LocalDate> listener) {
        this.component.addValueChangeListener(listener);
    }

    public abstract void requiredIndicatorVisible(boolean requiredIndicatorVisible);

    public abstract void readOnly(boolean readOnly);

}
