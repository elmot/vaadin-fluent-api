package xyz.elmot.vaadin.fluent.templates.internal;

import com.vaadin.data.HasValue;
import com.vaadin.ui.TextArea;
import xyz.elmot.vaadin.fluent.templates.FluentComponent;

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
