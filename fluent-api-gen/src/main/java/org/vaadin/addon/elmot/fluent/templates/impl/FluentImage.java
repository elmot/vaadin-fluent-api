package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.event.MouseEvents;
import com.vaadin.server.Resource;
import com.vaadin.ui.Image;
import org.vaadin.addon.elmot.fluent.gen.BasedOnVaadinComponent;


@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
@BasedOnVaadinComponent(Image.class)
public abstract class FluentImage extends FluentComponent<Image> {

    public FluentImage() {
        super(new Image());
    }

    /**
     * Fluent API for {@link com.vaadin.ui.Image#setSource(Resource)}
     *
     * @return self object
     */
    public abstract void source(Resource resource);

    /**
     * Fluent API for {@link com.vaadin.ui.Image#setAlternateText(String)}
     *
     * @return self object
     */
    public void altText(String altText) {
        this.component.setAlternateText(altText);
    }

    /**
     * Fluent API for {@link com.vaadin.ui.Image#addClickListener(MouseEvents.ClickListener)}
     *
     * @return self object
     */
    public void click(MouseEvents.ClickListener listener) {
        this.component.addClickListener(listener);
    }
}
