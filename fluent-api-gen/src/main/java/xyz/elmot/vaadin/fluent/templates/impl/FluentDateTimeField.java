package xyz.elmot.vaadin.fluent.templates.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.DateTimeField;

import java.time.LocalDateTime;

public abstract class FluentDateTimeField extends FluentComponent<DateTimeField> {

    public FluentDateTimeField() {
        super(new DateTimeField());
    }

    public abstract void value(LocalDateTime value);

    public void valueChangeListener(HasValue.ValueChangeListener<LocalDateTime> listener) {
        this.component.addValueChangeListener(listener);
    }

    public abstract void requiredIndicatorVisible(boolean requiredIndicatorVisible);

    public abstract void readOnly(boolean readOnly);

    public abstract void placeholder(String placeholder);

    public abstract void textFieldEnabled(boolean state);

    public abstract void assistiveText(String description);
}
