package xyz.elmot.vaadin.fluent.templates.internal;

import com.vaadin.event.MouseEvents;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.Component;
import com.vaadin.ui.Panel;
import xyz.elmot.vaadin.fluent.gen.ForcedImport;
import xyz.elmot.vaadin.fluent.templates.FluentComponent;

@ForcedImport(Sizeable.class)
public abstract class FluentPanel extends FluentComponent<Panel> {

    public FluentPanel() {
        super(new Panel());
    }

    public FluentPanel(Component component) {
        this();
        content(component);
    }

    public void click(MouseEvents.ClickListener listener) {
        this.component.addClickListener(listener);
    }

    public abstract FluentPanel tabIndex(int tabIndex);

    public abstract FluentPanel content(Component component);

}
