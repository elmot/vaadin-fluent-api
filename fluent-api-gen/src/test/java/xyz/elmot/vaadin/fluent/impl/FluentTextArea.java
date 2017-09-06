package xyz.elmot.vaadin.fluent.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.TextArea;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

public class FluentTextArea extends FluentComponent<TextArea> {

	public FluentTextArea() {
		super(new TextArea());
	}

	public FluentTextArea value(String value) {
		this.component.setValue(value);
		return this;
	}

	public FluentTextArea valueChangeListener(
			HasValue.ValueChangeListener<String> listener) {
		this.component.addValueChangeListener(listener);
		return this;
	}

	public FluentTextArea requiredIndicatorVisible(
			boolean requiredIndicatorVisible) {
		this.component.setRequiredIndicatorVisible(requiredIndicatorVisible);
		return this;
	}

	public FluentTextArea readOnly(boolean readOnly) {
		this.component.setReadOnly(readOnly);
		return this;
	}

	@Override
	public FluentTextArea id(String id) {
		super.id(id);
		return this;
	}

	@Override
	public FluentTextArea primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	@Override
	public FluentTextArea styles(String... styles) {
		super.styles(styles);
		return this;
	}

	@Override
	public FluentTextArea caption(String caption) {
		super.caption(caption);
		return this;
	}

	@Override
	public FluentTextArea captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	@Override
	public FluentTextArea locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	@Override
	public FluentTextArea icon(Resource icon) {
		super.icon(icon);
		return this;
	}

	@Override
	public FluentTextArea themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	@Override
	public FluentTextArea disabled() {
		super.disabled();
		return this;
	}

	@Override
	public FluentTextArea hidden() {
		super.hidden();
		return this;
	}

	@Override
	public FluentTextArea description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public FluentTextArea descriptionText(String description) {
		super.descriptionText(description);
		return this;
	}

	@Override
	public FluentTextArea descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	@Override
	public FluentTextArea componentError(ErrorMessage componentError) {
		super.componentError(componentError);
		return this;
	}

	@Override
	public FluentTextArea heightPx(float height) {
		super.heightPx(height);
		return this;
	}

	@Override
	public FluentTextArea heightPercent(float height) {
		super.heightPercent(height);
		return this;
	}

	@Override
	public FluentTextArea height(String height) {
		super.height(height);
		return this;
	}

	@Override
	public FluentTextArea widthPx(float width) {
		super.widthPx(width);
		return this;
	}

	@Override
	public FluentTextArea widthPercent(float width) {
		super.widthPercent(width);
		return this;
	}

	@Override
	public FluentTextArea width(String width) {
		super.width(width);
		return this;
	}

	@Override
	public FluentTextArea width(float width, Sizeable.Unit unit) {
		super.width(width, unit);
		return this;
	}

	@Override
	public FluentTextArea height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	@Override
	public FluentTextArea responsive() {
		super.responsive();
		return this;
	}

	@Override
	public FluentTextArea sizeFull() {
		super.sizeFull();
		return this;
	}

	@Override
	public FluentTextArea sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	@Override
	public FluentTextArea widthUndefined() {
		super.widthUndefined();
		return this;
	}

	@Override
	public FluentTextArea heightUndefined() {
		super.heightUndefined();
		return this;
	}
}
