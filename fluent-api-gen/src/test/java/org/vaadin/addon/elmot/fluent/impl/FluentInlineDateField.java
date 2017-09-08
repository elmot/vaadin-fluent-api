package org.vaadin.addon.elmot.fluent.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.InlineDateField;

import java.time.LocalDate;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class FluentInlineDateField extends FluentComponent<InlineDateField> {

	public FluentInlineDateField() {
		super(new InlineDateField());
	}

	public FluentInlineDateField value(LocalDate value) {
		this.component.setValue(value);
		return this;
	}

	public FluentInlineDateField valueChangeListener(
			HasValue.ValueChangeListener<LocalDate> listener) {
		this.component.addValueChangeListener(listener);
		return this;
	}

	public FluentInlineDateField requiredIndicatorVisible(
			boolean requiredIndicatorVisible) {
		this.component.setRequiredIndicatorVisible(requiredIndicatorVisible);
		return this;
	}

	public FluentInlineDateField readOnly(boolean readOnly) {
		this.component.setReadOnly(readOnly);
		return this;
	}

	@Override
	public FluentInlineDateField id(String id) {
		super.id(id);
		return this;
	}

	@Override
	public FluentInlineDateField primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	@Override
	public FluentInlineDateField styles(String... styles) {
		super.styles(styles);
		return this;
	}

	@Override
	public FluentInlineDateField caption(String caption) {
		super.caption(caption);
		return this;
	}

	@Override
	public FluentInlineDateField captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	@Override
	public FluentInlineDateField locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	@Override
	public FluentInlineDateField icon(Resource icon) {
		super.icon(icon);
		return this;
	}

	@Override
	public FluentInlineDateField themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	@Override
	public FluentInlineDateField disabled() {
		super.disabled();
		return this;
	}

	@Override
	public FluentInlineDateField hidden() {
		super.hidden();
		return this;
	}

	@Override
	public FluentInlineDateField description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public FluentInlineDateField descriptionText(String description) {
		super.descriptionText(description);
		return this;
	}

	@Override
	public FluentInlineDateField descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	@Override
	public FluentInlineDateField componentError(ErrorMessage componentError) {
		super.componentError(componentError);
		return this;
	}

	@Override
	public FluentInlineDateField heightPx(float height) {
		super.heightPx(height);
		return this;
	}

	@Override
	public FluentInlineDateField heightPercent(float height) {
		super.heightPercent(height);
		return this;
	}

	@Override
	public FluentInlineDateField height(String height) {
		super.height(height);
		return this;
	}

	@Override
	public FluentInlineDateField widthPx(float width) {
		super.widthPx(width);
		return this;
	}

	@Override
	public FluentInlineDateField widthPercent(float width) {
		super.widthPercent(width);
		return this;
	}

	@Override
	public FluentInlineDateField width(String width) {
		super.width(width);
		return this;
	}

	@Override
	public FluentInlineDateField width(float width, Sizeable.Unit unit) {
		super.width(width, unit);
		return this;
	}

	@Override
	public FluentInlineDateField height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	@Override
	public FluentInlineDateField responsive() {
		super.responsive();
		return this;
	}

	@Override
	public FluentInlineDateField sizeFull() {
		super.sizeFull();
		return this;
	}

	@Override
	public FluentInlineDateField sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	@Override
	public FluentInlineDateField widthUndefined() {
		super.widthUndefined();
		return this;
	}

	@Override
	public FluentInlineDateField heightUndefined() {
		super.heightUndefined();
		return this;
	}

}
