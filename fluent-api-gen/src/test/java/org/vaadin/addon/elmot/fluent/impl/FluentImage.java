package org.vaadin.addon.elmot.fluent.impl;

import com.vaadin.event.MouseEvents;
import com.vaadin.server.Resource;
import com.vaadin.ui.Image;

import java.util.function.Consumer;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class FluentImage extends FluentComponent<Image> {

	public FluentImage() {
		super(new Image());
	}

	@Override
	public FluentComponent<? extends Image> setup(Consumer<Image> setupCode) {
		return super.setup(setupCode);
	}

	public FluentImage source(Resource resource) {
		this.component.setSource(resource);
		return this;
	}

	public FluentImage altText(String altText) {
		this.component.setAlternateText(altText);
		return this;
	}

	public FluentImage click(MouseEvents.ClickListener listener) {
		this.component.addClickListener(listener);
		return this;
	}

	@Override
	public FluentImage id(String id) {
		super.id(id);
		return this;
	}

	@Override
	public FluentImage primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	@Override
	public FluentImage styles(String... styles) {
		super.styles(styles);
		return this;
	}

	@Override
	public FluentImage caption(String caption) {
		super.caption(caption);
		return this;
	}

	@Override
	public FluentImage captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	@Override
	public FluentImage locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	@Override
	public FluentImage icon(Resource icon) {
		super.icon(icon);
		return this;
	}

	@Override
	public FluentImage themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	@Override
	public FluentImage disabled() {
		super.disabled();
		return this;
	}

	@Override
	public FluentImage hidden() {
		super.hidden();
		return this;
	}

	@Override
	public FluentImage description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public FluentImage descriptionText(String description) {
		super.descriptionText(description);
		return this;
	}

	@Override
	public FluentImage descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	@Override
	public FluentImage componentError(ErrorMessage componentError) {
		super.componentError(componentError);
		return this;
	}

	@Override
	public FluentImage heightPx(float height) {
		super.heightPx(height);
		return this;
	}

	@Override
	public FluentImage heightPercent(float height) {
		super.heightPercent(height);
		return this;
	}

	@Override
	public FluentImage height(String height) {
		super.height(height);
		return this;
	}

	@Override
	public FluentImage widthPx(float width) {
		super.widthPx(width);
		return this;
	}

	@Override
	public FluentImage widthPercent(float width) {
		super.widthPercent(width);
		return this;
	}

	@Override
	public FluentImage width(String width) {
		super.width(width);
		return this;
	}

	@Override
	public FluentImage width(float width, Sizeable.Unit unit) {
		super.width(width, unit);
		return this;
	}

	@Override
	public FluentImage height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	@Override
	public FluentImage responsive() {
		super.responsive();
		return this;
	}

	@Override
	public FluentImage sizeFull() {
		super.sizeFull();
		return this;
	}

	@Override
	public FluentImage sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	@Override
	public FluentImage widthUndefined() {
		super.widthUndefined();
		return this;
	}

	@Override
	public FluentImage heightUndefined() {
		super.heightUndefined();
		return this;
	}
}
