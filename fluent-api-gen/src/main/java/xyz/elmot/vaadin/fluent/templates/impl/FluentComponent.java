package xyz.elmot.vaadin.fluent.templates.impl;

import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;

import java.util.Locale;
import java.util.function.Supplier;

public class FluentComponent<T extends AbstractComponent> implements Supplier<T> {

    protected final T component;

    public FluentComponent(final T component) {
        this.component = component;
    }

    @Override
    public T get() {
        return component;
    }

    public void id(String id) {
        component.setId(id);
    }

    public void primaryStyle(String style) {
        component.setPrimaryStyleName(style);

    }

    public void styles(String... styles) {
        component.addStyleNames(styles);

    }

    public void caption(String caption) {
        component.setCaption(caption);

    }

    public void captionHtml(boolean captionAsHtml) {
        component.setCaptionAsHtml(captionAsHtml);

    }

    public void locale(Locale locale) {
        component.setLocale(locale);

    }

    public void icon(Resource icon) {
        component.setIcon(icon);

    }

    public void themeIcon(CharSequence iconUrl) {
        component.setIcon(new ThemeResource(iconUrl.toString()));

    }

    public void disabled() {
        component.setEnabled(false);

    }

    public void hidden() {
        component.setVisible(false);

    }

    public void description(String description) {
        component.setDescription(description);

    }

    public void descriptionText(String description) {
        component.setDescription(description, ContentMode.TEXT);

    }

    public void descriptionHtml(String description) {
        component.setDescription(description, ContentMode.HTML);

    }

    public void componentError(ErrorMessage componentError) {
        component.setComponentError(componentError);

    }

    public void heightPx(float height) {
        component.setHeight(height, Sizeable.Unit.PIXELS);

    }

    public void heightPercent(float height) {
        component.setHeight(height, Sizeable.Unit.PERCENTAGE);

    }

    public void height(String height) {
        component.setHeight(height);

    }

    public void widthPx(float width) {
        component.setWidth(width, Sizeable.Unit.PIXELS);

    }

    public void widthPercent(float width) {
        component.setWidth(width, Sizeable.Unit.PERCENTAGE);

    }

    public void width(String width) {
        component.setWidth(width);

    }

    public void width(float width, Sizeable.Unit unit) {
        component.setWidth(width, unit);

    }

    public void height(float height, Sizeable.Unit unit) {
        component.setHeight(height, unit);

    }

    public void responsive() {
        component.setResponsive(true);

    }

    public void sizeFull() {
        component.setSizeFull();

    }

    public void sizeUndefined() {
        component.setSizeUndefined();

    }

    public void widthUndefined() {
        component.setWidthUndefined();

    }

    public void heightUndefined() {
        component.setHeightUndefined();
    }
}
