package xyz.elmot.vaadin.fluent.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.InlineDateTimeField;

import java.time.LocalDateTime;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

public class FluentInlineDateTimeField
		extends
			FluentComponent<InlineDateTimeField> {

	public FluentInlineDateTimeField() {
		super(new InlineDateTimeField());
	}

	public FluentInlineDateTimeField value(LocalDateTime value) {
		this.component.setValue(value);
		return this;
	}

	public FluentInlineDateTimeField valueChangeListener(
			HasValue.ValueChangeListener<LocalDateTime> listener) {
		this.component.addValueChangeListener(listener);
		return this;
	}

	public FluentInlineDateTimeField requiredIndicatorVisible(
			boolean requiredIndicatorVisible) {
		this.component.setRequiredIndicatorVisible(requiredIndicatorVisible);
		return this;
	}

	public FluentInlineDateTimeField readOnly(boolean readOnly) {
		this.component.setReadOnly(readOnly);
		return this;
	}

	@Override
	public FluentInlineDateTimeField id(String id) {
		super.id(id);
		return this;
	}

	@Override
	public FluentInlineDateTimeField primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	@Override
	public FluentInlineDateTimeField styles(String... styles) {
		super.styles(styles);
		return this;
	}

	@Override
	public FluentInlineDateTimeField caption(String caption) {
		super.caption(caption);
		return this;
	}

	@Override
	public FluentInlineDateTimeField captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	@Override
	public FluentInlineDateTimeField locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	@Override
	public FluentInlineDateTimeField icon(Resource icon) {
		super.icon(icon);
		return this;
	}

	@Override
	public FluentInlineDateTimeField themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	@Override
	public FluentInlineDateTimeField disabled() {
		super.disabled();
		return this;
	}

	@Override
	public FluentInlineDateTimeField hidden() {
		super.hidden();
		return this;
	}

	@Override
	public FluentInlineDateTimeField description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public FluentInlineDateTimeField descriptionText(String description) {
		super.descriptionText(description);
		return this;
	}

	@Override
	public FluentInlineDateTimeField descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	@Override
	public FluentInlineDateTimeField componentError(ErrorMessage componentError) {
		super.componentError(componentError);
		return this;
	}

	@Override
	public FluentInlineDateTimeField heightPx(float height) {
		super.heightPx(height);
		return this;
	}

	@Override
	public FluentInlineDateTimeField heightPercent(float height) {
		super.heightPercent(height);
		return this;
	}

	@Override
	public FluentInlineDateTimeField height(String height) {
		super.height(height);
		return this;
	}

	@Override
	public FluentInlineDateTimeField widthPx(float width) {
		super.widthPx(width);
		return this;
	}

	@Override
	public FluentInlineDateTimeField widthPercent(float width) {
		super.widthPercent(width);
		return this;
	}

	@Override
	public FluentInlineDateTimeField width(String width) {
		super.width(width);
		return this;
	}

	@Override
	public FluentInlineDateTimeField width(float width, Sizeable.Unit unit) {
		super.width(width, unit);
		return this;
	}

	@Override
	public FluentInlineDateTimeField height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	@Override
	public FluentInlineDateTimeField responsive() {
		super.responsive();
		return this;
	}

	@Override
	public FluentInlineDateTimeField sizeFull() {
		super.sizeFull();
		return this;
	}

	@Override
	public FluentInlineDateTimeField sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	@Override
	public FluentInlineDateTimeField widthUndefined() {
		super.widthUndefined();
		return this;
	}

	@Override
	public FluentInlineDateTimeField heightUndefined() {
		super.heightUndefined();
		return this;
	}

}
