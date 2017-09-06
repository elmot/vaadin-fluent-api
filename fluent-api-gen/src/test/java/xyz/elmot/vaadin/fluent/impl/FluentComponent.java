package xyz.elmot.vaadin.fluent.impl;

import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;

import java.util.Locale;
import java.util.function.Supplier;

public class FluentComponent<T extends AbstractComponent>
		implements
			Supplier<T> {

	protected final T component;

	public FluentComponent(final T component) {
		this.component = component;
	}

	@Override
	public T get() {
		return component;
	}

	public FluentComponent id(String id) {
		component.setId(id);
		return this;
	}

	public FluentComponent primaryStyle(String style) {
		component.setPrimaryStyleName(style);
		return this;
	}

	public FluentComponent styles(String... styles) {
		component.addStyleNames(styles);
		return this;
	}

	public FluentComponent caption(String caption) {
		component.setCaption(caption);
		return this;
	}

	public FluentComponent captionHtml(boolean captionAsHtml) {
		component.setCaptionAsHtml(captionAsHtml);
		return this;
	}

	public FluentComponent locale(Locale locale) {
		component.setLocale(locale);
		return this;
	}

	public FluentComponent icon(Resource icon) {
		component.setIcon(icon);
		return this;
	}

	public FluentComponent themeIcon(CharSequence iconUrl) {
		component.setIcon(new ThemeResource(iconUrl.toString()));
		return this;
	}

	public FluentComponent disabled() {
		component.setEnabled(false);
		return this;
	}

	public FluentComponent hidden() {
		component.setVisible(false);
		return this;
	}

	public FluentComponent description(String description) {
		component.setDescription(description);
		return this;
	}

	public FluentComponent descriptionText(String description) {
		component.setDescription(description, ContentMode.TEXT);
		return this;
	}

	public FluentComponent descriptionHtml(String description) {
		component.setDescription(description, ContentMode.HTML);
		return this;
	}

	public FluentComponent componentError(ErrorMessage componentError) {
		component.setComponentError(componentError);
		return this;
	}

	public FluentComponent heightPx(float height) {
		component.setHeight(height, Sizeable.Unit.PIXELS);
		return this;
	}

	public FluentComponent heightPercent(float height) {
		component.setHeight(height, Sizeable.Unit.PERCENTAGE);
		return this;
	}

	public FluentComponent height(String height) {
		component.setHeight(height);
		return this;
	}

	public FluentComponent widthPx(float width) {
		component.setWidth(width, Sizeable.Unit.PIXELS);
		return this;
	}

	public FluentComponent widthPercent(float width) {
		component.setWidth(width, Sizeable.Unit.PERCENTAGE);
		return this;
	}

	public FluentComponent width(String width) {
		component.setWidth(width);
		return this;
	}

	public FluentComponent width(float width, Sizeable.Unit unit) {
		component.setWidth(width, unit);
		return this;
	}

	public FluentComponent height(float height, Sizeable.Unit unit) {
		component.setHeight(height, unit);
		return this;
	}

	public FluentComponent responsive() {
		component.setResponsive(true);
		return this;
	}

	public FluentComponent sizeFull() {
		component.setSizeFull();
		return this;
	}

	public FluentComponent sizeUndefined() {
		component.setSizeUndefined();
		return this;
	}

	public FluentComponent widthUndefined() {
		component.setWidthUndefined();
		return this;
	}

	public FluentComponent heightUndefined() {
		component.setHeightUndefined();
		return this;
	}
}
