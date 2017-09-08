package xyz.elmot.vaadin.fluent.templates.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.CheckBox;

public abstract class FluentCheckBox extends FluentComponent<CheckBox> {

    public FluentCheckBox() {
        super(new CheckBox());
    }

    public abstract void  value(Boolean value);

    public void valueChangeListener(HasValue.ValueChangeListener<Boolean> listener) {
        this.component.addValueChangeListener(listener);
    }

    public abstract void   requiredIndicatorVisible(boolean requiredIndicatorVisible);

    public abstract void readOnly(boolean readOnly);

}
