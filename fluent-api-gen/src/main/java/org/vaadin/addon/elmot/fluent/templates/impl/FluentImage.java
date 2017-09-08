package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.event.MouseEvents;
import com.vaadin.server.Resource;
import com.vaadin.ui.Image;

import java.util.function.Consumer;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public abstract class FluentImage extends FluentComponent<Image> {

    public FluentImage() {
        super(new Image());
    }

    @Override
    public FluentComponent<? extends Image> setup(Consumer<Image> setupCode) {
        return super.setup(setupCode);
    }

    public abstract void source(Resource resource);

    public void altText(String altText) {
        this.component.setAlternateText(altText);
    }

    public void click(MouseEvents.ClickListener listener) {
        this.component.addClickListener(listener);
    }
}
