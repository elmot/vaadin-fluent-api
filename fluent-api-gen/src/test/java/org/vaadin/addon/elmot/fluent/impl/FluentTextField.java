package org.vaadin.addon.elmot.fluent.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.TextField;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class FluentTextField extends FluentComponent<TextField> {

	public FluentTextField() {
		super(new TextField());
	}

	public FluentTextField value(String value) {
		this.component.setValue(value);
		return this;
	}

	public FluentTextField valueChangeListener(
			HasValue.ValueChangeListener<String> listener) {
		this.component.addValueChangeListener(listener);
		return this;
	}

	public FluentTextField requiredIndicatorVisible(
			boolean requiredIndicatorVisible) {
		this.component.setRequiredIndicatorVisible(requiredIndicatorVisible);
		return this;
	}

	public FluentTextField readOnly(boolean readOnly) {
		this.component.setReadOnly(readOnly);
		return this;
	}

	@Override
	public FluentTextField id(String id) {
		super.id(id);
		return this;
	}

	@Override
	public FluentTextField primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	@Override
	public FluentTextField styles(String... styles) {
		super.styles(styles);
		return this;
	}

	@Override
	public FluentTextField caption(String caption) {
		super.caption(caption);
		return this;
	}

	@Override
	public FluentTextField captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	@Override
	public FluentTextField locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	@Override
	public FluentTextField icon(Resource icon) {
		super.icon(icon);
		return this;
	}

	@Override
	public FluentTextField themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	@Override
	public FluentTextField disabled() {
		super.disabled();
		return this;
	}

	@Override
	public FluentTextField hidden() {
		super.hidden();
		return this;
	}

	@Override
	public FluentTextField description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public FluentTextField descriptionText(String description) {
		super.descriptionText(description);
		return this;
	}

	@Override
	public FluentTextField descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	@Override
	public FluentTextField componentError(ErrorMessage componentError) {
		super.componentError(componentError);
		return this;
	}

	@Override
	public FluentTextField heightPx(float height) {
		super.heightPx(height);
		return this;
	}

	@Override
	public FluentTextField heightPercent(float height) {
		super.heightPercent(height);
		return this;
	}

	@Override
	public FluentTextField height(String height) {
		super.height(height);
		return this;
	}

	@Override
	public FluentTextField widthPx(float width) {
		super.widthPx(width);
		return this;
	}

	@Override
	public FluentTextField widthPercent(float width) {
		super.widthPercent(width);
		return this;
	}

	@Override
	public FluentTextField width(String width) {
		super.width(width);
		return this;
	}

	@Override
	public FluentTextField width(float width, Sizeable.Unit unit) {
		super.width(width, unit);
		return this;
	}

	@Override
	public FluentTextField height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	@Override
	public FluentTextField responsive() {
		super.responsive();
		return this;
	}

	@Override
	public FluentTextField sizeFull() {
		super.sizeFull();
		return this;
	}

	@Override
	public FluentTextField sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	@Override
	public FluentTextField widthUndefined() {
		super.widthUndefined();
		return this;
	}

	@Override
	public FluentTextField heightUndefined() {
		super.heightUndefined();
		return this;
	}
}
