package xyz.elmot.vaadin.fluent.templates.internal;

import com.vaadin.server.Resource;
import com.vaadin.shared.ui.BorderStyle;
import com.vaadin.ui.Link;
import xyz.elmot.vaadin.fluent.templates.FluentComponent;

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
