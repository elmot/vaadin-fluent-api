package org.vaadin.addon.elmot.fluent.gen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface ForcedImport {
    Class[] value();
}
