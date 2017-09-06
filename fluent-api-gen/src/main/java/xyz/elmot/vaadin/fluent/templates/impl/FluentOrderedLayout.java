package xyz.elmot.vaadin.fluent.templates.impl;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class FluentOrderedLayout<T extends AbstractOrderedLayout> extends FluentComponent<T> {

    public FluentOrderedLayout(T component) {
        super(component);
    }

    public FluentOrderedLayout<T> add(Component... components) {
        this.component.addComponents(components);
        return this;
    }

    public <V extends Component> FluentOrderedLayout<T> add(Stream<V> components) {
        components.forEach(c->this.component.addComponent(c));
//        components.forEach(this.component::addComponent);
        return this;
    }

    public <V extends Component> FluentOrderedLayout<T> add(Supplier<V> componentSupplier, Alignment alignment) {
        return add(componentSupplier.get(), alignment);
    }

    private FluentOrderedLayout<T> add(Component childComponent, Alignment alignment) {
        this.component.addComponent(childComponent);
        this.component.setComponentAlignment(childComponent, alignment);
        return this;
    }

    public FluentOrderedLayout<T>  setSpacing(boolean spacing) {
        component.setSpacing(spacing);
        return this;
    }

    public FluentOrderedLayout<T> add(Supplier<? extends Component> componentSupplier, float ratio) {
        return add(componentSupplier.get(), ratio);
    }

    private FluentOrderedLayout<T> add(Component childComponent, float ratio) {
        this.component.addComponent(childComponent);
        this.component.setExpandRatio(childComponent, ratio);
        return this;
    }


    public FluentOrderedLayout<T> add(Supplier<? extends Component> componentSupplier, Alignment alignment, float ratio) {
        return add(componentSupplier.get(), alignment, ratio);
    }

    private FluentOrderedLayout<T> add(Component childComponent, Alignment alignment, float ratio) {
        this.component.addComponent(childComponent);
        this.component.setExpandRatio(childComponent, ratio);
        this.component.setComponentAlignment(childComponent, alignment);
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
