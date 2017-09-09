package org.vaadin.addon.elmot.fluent.gen;

import com.vaadin.ui.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface BasedOnVaadinComponent {
    Class<? extends Component> value();
}
