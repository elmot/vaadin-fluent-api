package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.DateField;
import org.vaadin.addon.elmot.fluent.gen.BasedOnVaadinComponent;

import java.time.LocalDate;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
@BasedOnVaadinComponent(DateField.class)
public abstract class FluentDateField extends FluentComponent<DateField> {

    public FluentDateField() {
        super(new DateField());
    }

    public abstract void value(LocalDate value);

    /**
     * Fluent API for {@link com.vaadin.ui.DateField#addValueChangeListener(HasValue.ValueChangeListener)}
     *
     * @return self object
     */
    public void valueChangeListener(HasValue.ValueChangeListener<LocalDate> listener) {
        this.component.addValueChangeListener(listener);
    }

    public abstract void requiredIndicatorVisible(boolean requiredIndicatorVisible);

    public abstract void readOnly(boolean readOnly);

    public abstract void placeholder(String placeholder);

    public abstract void textFieldEnabled(boolean state);

    public abstract void assistiveText(String description);
}
