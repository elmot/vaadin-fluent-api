package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.TextArea;
import org.vaadin.addon.elmot.fluent.gen.BasedOnVaadinComponent;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
@BasedOnVaadinComponent(TextArea.class)
public abstract class FluentTextArea extends FluentComponent<TextArea> {

    public FluentTextArea() {
        super(new TextArea());
    }

    public abstract void value(String value);

    /**
     * Fluent API for {@link com.vaadin.ui.TextArea#addValueChangeListener(HasValue.ValueChangeListener)}
     *
     * @return self object
     */
    public void valueChangeListener(HasValue.ValueChangeListener<String> listener) {
        this.component.addValueChangeListener(listener);
    }

    public abstract void  requiredIndicatorVisible(boolean requiredIndicatorVisible);

    public abstract void readOnly(boolean readOnly);
}
