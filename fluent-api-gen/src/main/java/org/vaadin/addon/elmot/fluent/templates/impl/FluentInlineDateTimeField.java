package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.InlineDateTimeField;
import org.vaadin.addon.elmot.fluent.gen.BasedOnVaadinComponent;

import java.time.LocalDateTime;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
@BasedOnVaadinComponent(InlineDateTimeField.class)
public abstract class FluentInlineDateTimeField extends FluentComponent<InlineDateTimeField> {

    public FluentInlineDateTimeField() {
        super(new InlineDateTimeField());
    }

    public abstract void value(LocalDateTime value);

    /**
     * Fluent API for {@link com.vaadin.ui.InlineDateTimeField#addValueChangeListener(HasValue.ValueChangeListener)}
     *
     * @return self object
     */
    public void valueChangeListener(HasValue.ValueChangeListener<LocalDateTime> listener) {
        this.component.addValueChangeListener(listener);
    }

    public abstract void requiredIndicatorVisible(boolean requiredIndicatorVisible);

    public abstract void readOnly(boolean readOnly);

}
