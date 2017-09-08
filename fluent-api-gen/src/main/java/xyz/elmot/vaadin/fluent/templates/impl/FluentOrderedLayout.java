package xyz.elmot.vaadin.fluent.templates.impl;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;

import java.util.stream.Stream;

public class FluentOrderedLayout<T extends AbstractOrderedLayout> extends FluentComponent<T> {

    public FluentOrderedLayout(T component) {
        super(component);
    }

    public FluentOrderedLayout<T> addAll(Component... components) {
        this.component.addComponents(components);
        return this;
    }

    public <V extends Component> FluentOrderedLayout<T> addAll(Stream<V> components) {
        components.forEach(c->this.component.addComponent(c));//javac bug, do not convert to method ref
        return this;
    }

    public FluentOrderedLayout<T> add(FluentComponent<?> fluentComponent, Alignment alignment) {
        return add(fluentComponent.get(), alignment);
    }

    public FluentOrderedLayout<T> add(Component childComponent, Alignment alignment) {
        this.component.addComponent(childComponent);
        this.component.setComponentAlignment(childComponent, alignment);
        return this;
    }

    public FluentOrderedLayout<T> add(FluentComponent<?> fluentComponent, double ratio) {
        return add(fluentComponent.get(), ratio);
    }

    public FluentOrderedLayout<T> addAll(FluentComponent<?> ...fluentComponents) {
        for (FluentComponent<?> fluentComponent : fluentComponents) {
            this.component.addComponent(fluentComponent.get());
        }
        return this;
    }

    public FluentOrderedLayout<T> add(Component childComponent, double ratio) {
        this.component.addComponent(childComponent);
        this.component.setExpandRatio(childComponent, (float) ratio);
        return this;
    }


    public FluentOrderedLayout<T> add(FluentComponent<?> fluentComponent, Alignment alignment, double ratio) {
        return add(fluentComponent.get(), alignment, ratio);
    }

    public FluentOrderedLayout<T> add(Component childComponent, Alignment alignment, double ratio) {
        this.component.addComponent(childComponent);
        this.component.setExpandRatio(childComponent, (float) ratio);
        this.component.setComponentAlignment(childComponent, alignment);
        return this;
    }

    public FluentOrderedLayout<T>  setSpacing(boolean spacing) {
        component.setSpacing(spacing);
        return this;
    }

    public FluentOrderedLayout<T> margin(boolean enabled) {
        this.component.setMargin(enabled);
        return this;
    }

    public FluentOrderedLayout<T> margin(boolean vertical, boolean horizontal) {
        return margin(new MarginInfo(vertical, horizontal));
    }

    public FluentOrderedLayout<T> margin(boolean top,boolean right,boolean bottom,boolean left) {
        return margin(new MarginInfo(top, right, bottom, left));
    }

    public FluentOrderedLayout<T> margin(MarginInfo marginInfo) {
        this.component.setMargin(marginInfo);
        return this;
    }

    public FluentOrderedLayout<T> defaultComponentAlignment(Alignment defaultAlignment) {
        this.component.setDefaultComponentAlignment(defaultAlignment);
        return this;
    }
}
