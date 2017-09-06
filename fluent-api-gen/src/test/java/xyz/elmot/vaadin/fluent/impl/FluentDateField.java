package xyz.elmot.vaadin.fluent.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.DateField;

import java.time.LocalDate;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

public class FluentDateField extends FluentComponent<DateField> {

	public FluentDateField() {
		super(new DateField());
	}

	public FluentDateField value(LocalDate value) {
		this.component.setValue(value);
		return this;
	}

	public FluentDateField valueChangeListener(
			HasValue.ValueChangeListener<LocalDate> listener) {
		this.component.addValueChangeListener(listener);
		return this;
	}

	public FluentDateField requiredIndicatorVisible(
			boolean requiredIndicatorVisible) {
		this.component.setRequiredIndicatorVisible(requiredIndicatorVisible);
		return this;
	}

	public FluentDateField readOnly(boolean readOnly) {
		this.component.setReadOnly(readOnly);
		return this;
	}

	public FluentDateField placeholder(String placeholder) {
		this.component.setPlaceholder(placeholder);
		return this;
	}

	public FluentDateField textFieldEnabled(boolean state) {
		this.component.setTextFieldEnabled(state);
		return this;
	}

	public FluentDateField assistiveText(String description) {
		this.component.setAssistiveText(description);
		return this;
	}

	@Override
	public FluentDateField id(String id) {
		super.id(id);
		return this;
	}

	@Override
	public FluentDateField primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	@Override
	public FluentDateField styles(String... styles) {
		super.styles(styles);
		return this;
	}

	@Override
	public FluentDateField caption(String caption) {
		super.caption(caption);
		return this;
	}

	@Override
	public FluentDateField captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	@Override
	public FluentDateField locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	@Override
	public FluentDateField icon(Resource icon) {
		super.icon(icon);
		return this;
	}

	@Override
	public FluentDateField themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	@Override
	public FluentDateField disabled() {
		super.disabled();
		return this;
	}

	@Override
	public FluentDateField hidden() {
		super.hidden();
		return this;
	}

	@Override
	public FluentDateField description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public FluentDateField descriptionText(String description) {
		super.descriptionText(description);
		return this;
	}

	@Override
	public FluentDateField descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	@Override
	public FluentDateField componentError(ErrorMessage componentError) {
		super.componentError(componentError);
		return this;
	}

	@Override
	public FluentDateField heightPx(float height) {
		super.heightPx(height);
		return this;
	}

	@Override
	public FluentDateField heightPercent(float height) {
		super.heightPercent(height);
		return this;
	}

	@Override
	public FluentDateField height(String height) {
		super.height(height);
		return this;
	}

	@Override
	public FluentDateField widthPx(float width) {
		super.widthPx(width);
		return this;
	}

	@Override
	public FluentDateField widthPercent(float width) {
		super.widthPercent(width);
		return this;
	}

	@Override
	public FluentDateField width(String width) {
		super.width(width);
		return this;
	}

	@Override
	public FluentDateField width(float width, Sizeable.Unit unit) {
		super.width(width, unit);
		return this;
	}

	@Override
	public FluentDateField height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	@Override
	public FluentDateField responsive() {
		super.responsive();
		return this;
	}

	@Override
	public FluentDateField sizeFull() {
		super.sizeFull();
		return this;
	}

	@Override
	public FluentDateField sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	@Override
	public FluentDateField widthUndefined() {
		super.widthUndefined();
		return this;
	}

	@Override
	public FluentDateField heightUndefined() {
		super.heightUndefined();
		return this;
	}
}
