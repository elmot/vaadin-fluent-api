package org.vaadin.addon.elmot.fluent.impl;

import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Label;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class FluentLabel extends FluentComponent<Label> {

	public FluentLabel() {
		super(new Label());
	}

	public FluentLabel contentMode(ContentMode contentMode) {
		this.component.setContentMode(contentMode);
		return this;
	}

	public FluentLabel value(String value) {
		this.component.setValue(value);
		return this;
	}

	public FluentLabel preformatted(String value) {
		this.component.setValue(value);
		this.component.setContentMode(ContentMode.PREFORMATTED);
		return this;
	}

	public FluentLabel html(String value) {
		this.component.setValue(value);
		this.component.setContentMode(ContentMode.HTML);
		return this;
	}

	@Override
	public FluentLabel id(String id) {
		super.id(id);
		return this;
	}

	@Override
	public FluentLabel primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	@Override
	public FluentLabel styles(String... styles) {
		super.styles(styles);
		return this;
	}

	@Override
	public FluentLabel caption(String caption) {
		super.caption(caption);
		return this;
	}

	@Override
	public FluentLabel captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	@Override
	public FluentLabel locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	@Override
	public FluentLabel icon(Resource icon) {
		super.icon(icon);
		return this;
	}

	@Override
	public FluentLabel themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	@Override
	public FluentLabel disabled() {
		super.disabled();
		return this;
	}

	@Override
	public FluentLabel hidden() {
		super.hidden();
		return this;
	}

	@Override
	public FluentLabel description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public FluentLabel descriptionText(String description) {
		super.descriptionText(description);
		return this;
	}

	@Override
	public FluentLabel descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	@Override
	public FluentLabel componentError(ErrorMessage componentError) {
		super.componentError(componentError);
		return this;
	}

	@Override
	public FluentLabel heightPx(float height) {
		super.heightPx(height);
		return this;
	}

	@Override
	public FluentLabel heightPercent(float height) {
		super.heightPercent(height);
		return this;
	}

	@Override
	public FluentLabel height(String height) {
		super.height(height);
		return this;
	}

	@Override
	public FluentLabel widthPx(float width) {
		super.widthPx(width);
		return this;
	}

	@Override
	public FluentLabel widthPercent(float width) {
		super.widthPercent(width);
		return this;
	}

	@Override
	public FluentLabel width(String width) {
		super.width(width);
		return this;
	}

	@Override
	public FluentLabel width(float width, Sizeable.Unit unit) {
		super.width(width, unit);
		return this;
	}

	@Override
	public FluentLabel height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	@Override
	public FluentLabel responsive() {
		super.responsive();
		return this;
	}

	@Override
	public FluentLabel sizeFull() {
		super.sizeFull();
		return this;
	}

	@Override
	public FluentLabel sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	@Override
	public FluentLabel widthUndefined() {
		super.widthUndefined();
		return this;
	}

	@Override
	public FluentLabel heightUndefined() {
		super.heightUndefined();
		return this;
	}
}
