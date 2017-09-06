package xyz.elmot.vaadin.fluent.templates.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.DateField;

import java.time.LocalDate;

public abstract class FluentDateField extends FluentComponent<DateField> {

    public FluentDateField() {
        super(new DateField());
    }

    public abstract void value(LocalDate value);

    public void valueChangeListener(HasValue.ValueChangeListener<LocalDate> listener) {
        this.component.addValueChangeListener(listener);
    }

    public abstract void requiredIndicatorVisible(boolean requiredIndicatorVisible);

    public abstract void readOnly(boolean readOnly);

    public abstract void placeholder(String placeholder);

    public abstract void textFieldEnabled(boolean state);

    public abstract void assistiveText(String description);
}
