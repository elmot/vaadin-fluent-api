package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.server.Resource;
import com.vaadin.shared.ui.BorderStyle;
import com.vaadin.ui.Link;
import org.vaadin.addon.elmot.fluent.gen.BasedOnVaadinComponent;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
@BasedOnVaadinComponent(Link.class)
public abstract class FluentLink extends FluentComponent<Link> {

    public FluentLink() {
        super(new Link());
    }

    public abstract void targetBorder(BorderStyle targetBorder);

    public abstract void targetHeight(int targetHeight);

    public abstract void targetName(String targetName);

    public abstract void  targetWidth(int targetWidth);

    public abstract void  resource(Resource resource);
}
