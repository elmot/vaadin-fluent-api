package xyz.elmot.vaadin.fluent.templates.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.TextArea;

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
