package xyz.elmot.vaadin.fluent.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.CheckBox;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

public class FluentCheckBox extends FluentComponent<CheckBox> {

	public FluentCheckBox() {
		super(new CheckBox());
	}

	public FluentCheckBox value(Boolean value) {
		this.component.setValue(value);
		return this;
	}

	public FluentCheckBox valueChangeListener(
			HasValue.ValueChangeListener<Boolean> listener) {
		this.component.addValueChangeListener(listener);
		return this;
	}

	public FluentCheckBox requiredIndicatorVisible(
			boolean requiredIndicatorVisible) {
		this.component.setRequiredIndicatorVisible(requiredIndicatorVisible);
		return this;
	}

	public FluentCheckBox readOnly(boolean readOnly) {
		this.component.setReadOnly(readOnly);
		return this;
	}

	@Override
	public FluentCheckBox id(String id) {
		super.id(id);
		return this;
	}

	@Override
	public FluentCheckBox primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	@Override
	public FluentCheckBox styles(String... styles) {
		super.styles(styles);
		return this;
	}

	@Override
	public FluentCheckBox caption(String caption) {
		super.caption(caption);
		return this;
	}

	@Override
	public FluentCheckBox captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	@Override
	public FluentCheckBox locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	@Override
	public FluentCheckBox icon(Resource icon) {
		super.icon(icon);
		return this;
	}

	@Override
	public FluentCheckBox themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	@Override
	public FluentCheckBox disabled() {
		super.disabled();
		return this;
	}

	@Override
	public FluentCheckBox hidden() {
		super.hidden();
		return this;
	}

	@Override
	public FluentCheckBox description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public FluentCheckBox descriptionText(String description) {
		super.descriptionText(description);
		return this;
	}

	@Override
	public FluentCheckBox descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	@Override
	public FluentCheckBox componentError(ErrorMessage componentError) {
		super.componentError(componentError);
		return this;
	}

	@Override
	public FluentCheckBox heightPx(float height) {
		super.heightPx(height);
		return this;
	}

	@Override
	public FluentCheckBox heightPercent(float height) {
		super.heightPercent(height);
		return this;
	}

	@Override
	public FluentCheckBox height(String height) {
		super.height(height);
		return this;
	}

	@Override
	public FluentCheckBox widthPx(float width) {
		super.widthPx(width);
		return this;
	}

	@Override
	public FluentCheckBox widthPercent(float width) {
		super.widthPercent(width);
		return this;
	}

	@Override
	public FluentCheckBox width(String width) {
		super.width(width);
		return this;
	}

	@Override
	public FluentCheckBox width(float width, Sizeable.Unit unit) {
		super.width(width, unit);
		return this;
	}

	@Override
	public FluentCheckBox height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	@Override
	public FluentCheckBox responsive() {
		super.responsive();
		return this;
	}

	@Override
	public FluentCheckBox sizeFull() {
		super.sizeFull();
		return this;
	}

	@Override
	public FluentCheckBox sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	@Override
	public FluentCheckBox widthUndefined() {
		super.widthUndefined();
		return this;
	}

	@Override
	public FluentCheckBox heightUndefined() {
		super.heightUndefined();
		return this;
	}
}
