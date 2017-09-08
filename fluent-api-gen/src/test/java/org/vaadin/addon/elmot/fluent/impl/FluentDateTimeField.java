package org.vaadin.addon.elmot.fluent.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.DateTimeField;

import java.time.LocalDateTime;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class FluentDateTimeField extends FluentComponent<DateTimeField> {

	public FluentDateTimeField() {
		super(new DateTimeField());
	}

	public FluentDateTimeField value(LocalDateTime value) {
		this.component.setValue(value);
		return this;
	}

	public FluentDateTimeField valueChangeListener(
			HasValue.ValueChangeListener<LocalDateTime> listener) {
		this.component.addValueChangeListener(listener);
		return this;
	}

	public FluentDateTimeField requiredIndicatorVisible(
			boolean requiredIndicatorVisible) {
		this.component.setRequiredIndicatorVisible(requiredIndicatorVisible);
		return this;
	}

	public FluentDateTimeField readOnly(boolean readOnly) {
		this.component.setReadOnly(readOnly);
		return this;
	}

	public FluentDateTimeField placeholder(String placeholder) {
		this.component.setPlaceholder(placeholder);
		return this;
	}

	public FluentDateTimeField textFieldEnabled(boolean state) {
		this.component.setTextFieldEnabled(state);
		return this;
	}

	public FluentDateTimeField assistiveText(String description) {
		this.component.setAssistiveText(description);
		return this;
	}

	@Override
	public FluentDateTimeField id(String id) {
		super.id(id);
		return this;
	}

	@Override
	public FluentDateTimeField primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	@Override
	public FluentDateTimeField styles(String... styles) {
		super.styles(styles);
		return this;
	}

	@Override
	public FluentDateTimeField caption(String caption) {
		super.caption(caption);
		return this;
	}

	@Override
	public FluentDateTimeField captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	@Override
	public FluentDateTimeField locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	@Override
	public FluentDateTimeField icon(Resource icon) {
		super.icon(icon);
		return this;
	}

	@Override
	public FluentDateTimeField themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	@Override
	public FluentDateTimeField disabled() {
		super.disabled();
		return this;
	}

	@Override
	public FluentDateTimeField hidden() {
		super.hidden();
		return this;
	}

	@Override
	public FluentDateTimeField description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public FluentDateTimeField descriptionText(String description) {
		super.descriptionText(description);
		return this;
	}

	@Override
	public FluentDateTimeField descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	@Override
	public FluentDateTimeField componentError(ErrorMessage componentError) {
		super.componentError(componentError);
		return this;
	}

	@Override
	public FluentDateTimeField heightPx(float height) {
		super.heightPx(height);
		return this;
	}

	@Override
	public FluentDateTimeField heightPercent(float height) {
		super.heightPercent(height);
		return this;
	}

	@Override
	public FluentDateTimeField height(String height) {
		super.height(height);
		return this;
	}

	@Override
	public FluentDateTimeField widthPx(float width) {
		super.widthPx(width);
		return this;
	}

	@Override
	public FluentDateTimeField widthPercent(float width) {
		super.widthPercent(width);
		return this;
	}

	@Override
	public FluentDateTimeField width(String width) {
		super.width(width);
		return this;
	}

	@Override
	public FluentDateTimeField width(float width, Sizeable.Unit unit) {
		super.width(width, unit);
		return this;
	}

	@Override
	public FluentDateTimeField height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	@Override
	public FluentDateTimeField responsive() {
		super.responsive();
		return this;
	}

	@Override
	public FluentDateTimeField sizeFull() {
		super.sizeFull();
		return this;
	}

	@Override
	public FluentDateTimeField sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	@Override
	public FluentDateTimeField widthUndefined() {
		super.widthUndefined();
		return this;
	}

	@Override
	public FluentDateTimeField heightUndefined() {
		super.heightUndefined();
		return this;
	}
}
