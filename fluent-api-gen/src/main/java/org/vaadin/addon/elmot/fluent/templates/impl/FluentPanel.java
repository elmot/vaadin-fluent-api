package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.event.MouseEvents;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.Component;
import com.vaadin.ui.Panel;
import org.vaadin.addon.elmot.fluent.gen.BasedOnVaadinComponent;
import org.vaadin.addon.elmot.fluent.gen.ForcedImport;

@ForcedImport(Sizeable.class)
@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
@BasedOnVaadinComponent(Panel.class)
public abstract class FluentPanel extends FluentComponent<Panel> {

    public FluentPanel() {
        super(new Panel());
    }

    /**
     * Creates new Fluent API envelope for {@link com.vaadin.ui.Panel} with the component inside
     *
     * @param component to be put inside
     * @see org.vaadin.addon.elmot.fluent.Fluent
     */
    public FluentPanel(Component component) {
        this();
        content(component);
    }

    /**
     * Fluent API for {@link com.vaadin.ui.Panel#addClickListener(MouseEvents.ClickListener)}
     *
     * @return self object
     */
    public void click(MouseEvents.ClickListener listener) {
        this.component.addClickListener(listener);
    }

    public abstract FluentPanel tabIndex(int tabIndex);

    public abstract FluentPanel content(Component component);

}
