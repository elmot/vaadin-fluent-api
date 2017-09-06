package xyz.elmot.vaadin.fluent.templates.impl;

import com.vaadin.event.MouseEvents;
import com.vaadin.server.Resource;
import com.vaadin.ui.Image;

public abstract class FluentImage extends FluentComponent<Image> {

    public FluentImage() {
        super(new Image());
    }

    public abstract void source(Resource resource);

    public void altText(String altText) {
        this.component.setAlternateText(altText);
    }

    public void click(MouseEvents.ClickListener listener) {
        this.component.addClickListener(listener);
    }
}
