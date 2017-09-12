package org.vaadin.addon.elmot.fluent.templates.impl;

import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import org.vaadin.addon.elmot.fluent.gen.BasedOnVaadinComponent;

import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Generic Fluent API envelope for Vaadin components
 *
 * @param <T> component type
 * @see AbstractComponent
 * @see org.vaadin.addon.elmot.fluent.Fluent
 */
@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
@BasedOnVaadinComponent(AbstractComponent.class)
public class FluentComponent<T extends AbstractComponent> implements Supplier<T> {

    protected final T component;

    /**
     * Creates a new Fluent envelope for the given component
     *
     * @param component component to be used
     * @see org.vaadin.addon.elmot.fluent.Fluent#use
     * @see org.vaadin.addon.elmot.fluent.Fluent#$
     */
    public FluentComponent(final T component) {
        this.component = component;
    }

    /**
     * Returns enveloped component
     *
     * @return enveloped component
     */
    @Override
    public T get() {
        return component;
    }

    /**
     * Executes an arbitrary code on the component. Example:<br>
     * <br>
     * {@code Fluent.$(new Grid()).setup(grid -> grid.setBeanType(YourBean.class)).id("grid");}
     *
     * @param setupCode some code to execute
     */
    public FluentComponent<? extends T> setup(Consumer<T> setupCode) {
        setupCode.accept(component);
        return this;
    }

    /**
     * Fluent API for {@link AbstractComponent#setId}
     *
     * @return self object
     */
    public void id(String id) {
        component.setId(id);
    }

    /**
     * Fluent API for {@link AbstractComponent#setPrimaryStyleName(String)}
     *
     * @return self object
     */
    public void primaryStyle(String style) {
        component.setPrimaryStyleName(style);

    }

    /**
     * Fluent API for {@link AbstractComponent#addStyleNames}
     *
     * @return self object
     */
    public void styles(String... styles) {
        component.addStyleNames(styles);

    }

    /**
     * Fluent API for {@link AbstractComponent#setCaption(String)}
     *
     * @return self object
     */
    public void caption(String caption) {
        component.setCaption(caption);

    }

    /**
     * Fluent API for {@link AbstractComponent#setCaption(String)} and
     * {@link AbstractComponent#setCaptionAsHtml(boolean)} }
     *
     * @return self object
     */
    public void captionHtml(boolean captionAsHtml) {
        component.setCaptionAsHtml(captionAsHtml);

    }

    /**
     * Fluent API for {@link AbstractComponent#setLocale(Locale)}
     *
     * @return self object
     */
    public void locale(Locale locale) {
        component.setLocale(locale);

    }

    /**
     * Fluent API for {@link AbstractComponent#setIcon(Resource)}
     *
     * @return self object
     */
    public void icon(Resource icon) {
        component.setIcon(icon);

    }

    /**
     * Fluent API for {@link AbstractComponent#setIcon(Resource)}
     * parametrized with {@link ThemeResource}
     *
     * @return self object
     */
    public void themeIcon(CharSequence iconUrl) {
        component.setIcon(new ThemeResource(iconUrl.toString()));

    }

    /**
     * Fluent API for {@link AbstractComponent#setEnabled(boolean)}
     *
     * @return self object
     */
    public void disabled() {
        component.setEnabled(false);

    }

    /**
     * Fluent API for {@link AbstractComponent#setVisible(boolean) }
     *
     * @return self object
     */
    public void hidden() {
        component.setVisible(false);

    }

    /**
     * Fluent API for {@link AbstractComponent#setDescription(String)}
     *
     * @return self object
     */
    public void description(String description) {
        component.setDescription(description);

    }

    /**
     * Fluent API for {@link AbstractComponent#setDescription(String, ContentMode)} (String)} and
     *
     * @return self object
     */
    public void descriptionText(String description) {
        component.setDescription(description, ContentMode.TEXT);

    }

    /**
     * Fluent API for {@link AbstractComponent#setDescription(String, ContentMode)} (String)} and
     *
     * @return self object
     */
    public void descriptionHtml(String description) {
        component.setDescription(description, ContentMode.HTML);

    }

    /**
     * Fluent API for {@link AbstractComponent#setComponentError(ErrorMessage)}
     *
     * @return self object
     */
    public void componentError(ErrorMessage componentError) {
        component.setComponentError(componentError);

    }

    /**
     * Fluent API for {@link AbstractComponent#setHeight(float, Sizeable.Unit)}
     *
     * @param height in pixels
     * @return self object
     */
    public void heightPx(float height) {
        component.setHeight(height, Sizeable.Unit.PIXELS);

    }

    /**
     * Fluent API for {@link AbstractComponent#setHeight(float, Sizeable.Unit)}
     *
     * @param height in percents
     * @return self object
     */
    public void heightPercent(float height) {
        component.setHeight(height, Sizeable.Unit.PERCENTAGE);

    }

    /**
     * Fluent API for {@link AbstractComponent#setHeight(String)}
     *
     * @param height as text
     * @return self object
     */
    public void height(String height) {
        component.setHeight(height);

    }

    /**
     * Fluent API for {@link AbstractComponent#setWidth(float, Sizeable.Unit)}
     *
     * @param width in pixels
     * @return self object
     */
    public void widthPx(float width) {
        component.setWidth(width, Sizeable.Unit.PIXELS);

    }

    /**
     * Fluent API for {@link AbstractComponent#setWidth(float, Sizeable.Unit)}
     *
     * @param width in percents
     * @return self object
     */
    public void widthPercent(float width) {
        component.setWidth(width, Sizeable.Unit.PERCENTAGE);

    }

    /**
     * Fluent API for {@link AbstractComponent#setWidth(String)}
     *
     * @param width as string
     * @return self object
     */
    public void width(String width) {
        component.setWidth(width);

    }

    /**
     * Fluent API for {@link AbstractComponent#setWidth(float, Sizeable.Unit)}
     *
     * @param width value
     * @param unit units
     * @return self object
     */
    public void width(float width, Sizeable.Unit unit) {
        component.setWidth(width, unit);

    }

    /**
     * Fluent API for {@link AbstractComponent#setHeight(float, Sizeable.Unit)}
     *
     * @param height value
     * @param unit units
     * @return self object
     */
    public void height(float height, Sizeable.Unit unit) {
        component.setHeight(height, unit);

    }

    /**
     * Fluent API for {@link AbstractComponent#setResponsive(boolean)}
     *
     * @return self object
     */
    public void responsive() {
        component.setResponsive(true);

    }

    /**
     * Fluent API for {@link AbstractComponent#setSizeFull()}
     *
     * @return self object
     */
    public void sizeFull() {
        component.setSizeFull();

    }

    /**
     * Fluent API for {@link AbstractComponent#setSizeUndefined()}
     *
     * @return self object
     */
    public void sizeUndefined() {
        component.setSizeUndefined();

    }

    /**
     * Fluent API for {@link AbstractComponent#setWidthUndefined()}
     *
     * @return self object
     */
    public void widthUndefined() {
        component.setWidthUndefined();

    }

    /**
     * Fluent API for {@link AbstractComponent#setHeightUndefined()}
     *
     * @return self object
     */
    public void heightUndefined() {
        component.setHeightUndefined();
    }
}
