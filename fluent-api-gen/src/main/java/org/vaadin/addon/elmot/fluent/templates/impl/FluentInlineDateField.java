package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.InlineDateField;
import org.vaadin.addon.elmot.fluent.gen.BasedOnVaadinComponent;

import java.time.LocalDate;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
@BasedOnVaadinComponent(InlineDateField.class)
public abstract class FluentInlineDateField extends FluentComponent<InlineDateField> {

    public FluentInlineDateField() {
        super(new InlineDateField());
    }

    public abstract void value(LocalDate value);

    /**
     * Fluent API for {@link com.vaadin.ui.InlineDateField#addValueChangeListener(HasValue.ValueChangeListener)}
     *
     * @return self object
     */
    public void valueChangeListener(HasValue.ValueChangeListener<LocalDate> listener) {
        this.component.addValueChangeListener(listener);
    }

    public abstract void requiredIndicatorVisible(boolean requiredIndicatorVisible);

    public abstract void readOnly(boolean readOnly);

}
