package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import org.vaadin.addon.elmot.fluent.gen.BasedOnVaadinComponent;

import java.util.stream.Stream;

/**
 * Fluent API envelope for Vaadin {@link com.vaadin.ui.HorizontalLayout} and {@link com.vaadin.ui.VerticalLayout}.
 *
 * @see org.vaadin.addon.elmot.fluent.Fluent
 */
@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
@BasedOnVaadinComponent(AbstractOrderedLayout.class)
public class FluentOrderedLayout<T extends AbstractOrderedLayout> extends FluentComponent<T> {

    /**
     * Creates a new fluent envelope for the given layout
     * @param component layout to be used
     */
    public FluentOrderedLayout(T component) {
        super(component);
    }

    /**
     * Fluent API for {@link ComponentContainer#addComponents(Component...)}
     *
     * @return self object
     */
    public FluentOrderedLayout<T> addAll(Component... components) {
        this.component.addComponents(components);
        return this;
    }

    /**
     * Fluent + Stream API for {@link ComponentContainer#addComponents(Component...)}
     *
     * @return self object
     */
    public <V extends Component> FluentOrderedLayout<T> addAll(Stream<V> components) {
        //noinspection Convert2MethodRef
        components.forEach(c->this.component.addComponent(c));//javac bug, do not convert to method ref
        return this;
    }

    /**
     * Fluent API for {@link ComponentContainer#addComponent(Component)} and
     * {@link AbstractOrderedLayout#setComponentAlignment(Component, Alignment)}
     *
     * @return self object
     */
    public FluentOrderedLayout<T> add(FluentComponent<?> fluentComponent, Alignment alignment) {
        return add(fluentComponent.get(), alignment);
    }

    /**
     * Fluent API for {@link ComponentContainer#addComponent(Component)} and
     * {@link AbstractOrderedLayout#setComponentAlignment(Component, Alignment)}
     *
     * @return self object
     */
    public FluentOrderedLayout<T> add(Component childComponent, Alignment alignment) {
        this.component.addComponent(childComponent);
        this.component.setComponentAlignment(childComponent, alignment);
        return this;
    }

    /**
     * Fluent API for {@link ComponentContainer#addComponent(Component)} and
     * {@link AbstractOrderedLayout#setExpandRatio(Component, float)}
     *
     * @return self object
     */
    public FluentOrderedLayout<T> add(FluentComponent<?> fluentComponent, double ratio) {
        return add(fluentComponent.get(), ratio);
    }

    /**
     * Fluent API for {@link ComponentContainer#addComponents(Component...)}
     *
     * @return self object
     */
    public FluentOrderedLayout<T> addAll(FluentComponent<?> ...fluentComponents) {
        for (FluentComponent<?> fluentComponent : fluentComponents) {
            this.component.addComponent(fluentComponent.get());
        }
        return this;
    }

    /**
     * Fluent API for {@link ComponentContainer#addComponent(Component)} and
     * {@link AbstractOrderedLayout#setExpandRatio(Component, float)}
     *
     * @return self object
     */
    public FluentOrderedLayout<T> add(Component childComponent, double ratio) {
        this.component.addComponent(childComponent);
        this.component.setExpandRatio(childComponent, (float) ratio);
        return this;
    }

    /**
     * Fluent API for {@link ComponentContainer#addComponent(Component)},
     * {@link AbstractOrderedLayout#setComponentAlignment(Component, Alignment)} and
     * {@link AbstractOrderedLayout#setExpandRatio(Component, float)}
     *
     * @return self object
     */
    public FluentOrderedLayout<T> add(FluentComponent<?> fluentComponent, Alignment alignment, double ratio) {
        return add(fluentComponent.get(), alignment, ratio);
    }

    /**
     * Fluent API for {@link ComponentContainer#addComponent(Component)},
     * {@link AbstractOrderedLayout#setComponentAlignment(Component, Alignment)} and
     * {@link AbstractOrderedLayout#setExpandRatio(Component, float)}
     *
     * @return self object
     */
    public FluentOrderedLayout<T> add(Component childComponent, Alignment alignment, double ratio) {
        this.component.addComponent(childComponent);
        this.component.setExpandRatio(childComponent, (float) ratio);
        this.component.setComponentAlignment(childComponent, alignment);
        return this;
    }

    /**
     * Fluent API for {@link AbstractOrderedLayout#setSpacing(boolean)}
     *
     * @return self object
     */
    public FluentOrderedLayout<T>  spacing(boolean spacing) {
        component.setSpacing(spacing);
        return this;
    }

    /**
     * Fluent API for {@link AbstractOrderedLayout#setMargin(boolean)}
     *
     * @return self object
     */
    public FluentOrderedLayout<T> margin(boolean enabled) {
        this.component.setMargin(enabled);
        return this;
    }

    /**
     * Fluent API for {@link AbstractOrderedLayout#setMargin(MarginInfo)}
     *
     * @return self object
     */
    public FluentOrderedLayout<T> margin(boolean vertical, boolean horizontal) {
        return margin(new MarginInfo(vertical, horizontal));
    }

    /**
     * Fluent API for {@link AbstractOrderedLayout#setMargin(MarginInfo)}
     *
     * @return self object
     */
    public FluentOrderedLayout<T> margin(boolean top,boolean right,boolean bottom,boolean left) {
        return margin(new MarginInfo(top, right, bottom, left));
    }

    /**
     * Fluent API for {@link AbstractOrderedLayout#setMargin(MarginInfo)}
     *
     * @return self object
     */
    public FluentOrderedLayout<T> margin(MarginInfo marginInfo) {
        this.component.setMargin(marginInfo);
        return this;
    }

    /**
     * Fluent API for {@link AbstractOrderedLayout#setDefaultComponentAlignment(Alignment)}
     *
     * @return self object
     */
    public FluentOrderedLayout<T> defaultComponentAlignment(Alignment defaultAlignment) {
        this.component.setDefaultComponentAlignment(defaultAlignment);
        return this;
    }
}
