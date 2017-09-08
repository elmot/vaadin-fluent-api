package org.vaadin.addon.elmot.fluent.impl;

import com.vaadin.server.Resource;
import com.vaadin.shared.ui.BorderStyle;
import com.vaadin.ui.Link;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class FluentLink extends FluentComponent<Link> {

	public FluentLink() {
		super(new Link());
	}

	public FluentLink targetBorder(BorderStyle targetBorder) {
		this.component.setTargetBorder(targetBorder);
		return this;
	}

	public FluentLink targetHeight(int targetHeight) {
		this.component.setTargetHeight(targetHeight);
		return this;
	}

	public FluentLink targetName(String targetName) {
		this.component.setTargetName(targetName);
		return this;
	}

	public FluentLink targetWidth(int targetWidth) {
		this.component.setTargetWidth(targetWidth);
		return this;
	}

	public FluentLink resource(Resource resource) {
		this.component.setResource(resource);
		return this;
	}

	@Override
	public FluentLink id(String id) {
		super.id(id);
		return this;
	}

	@Override
	public FluentLink primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	@Override
	public FluentLink styles(String... styles) {
		super.styles(styles);
		return this;
	}

	@Override
	public FluentLink caption(String caption) {
		super.caption(caption);
		return this;
	}

	@Override
	public FluentLink captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	@Override
	public FluentLink locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	@Override
	public FluentLink icon(Resource icon) {
		super.icon(icon);
		return this;
	}

	@Override
	public FluentLink themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	@Override
	public FluentLink disabled() {
		super.disabled();
		return this;
	}

	@Override
	public FluentLink hidden() {
		super.hidden();
		return this;
	}

	@Override
	public FluentLink description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public FluentLink descriptionText(String description) {
		super.descriptionText(description);
		return this;
	}

	@Override
	public FluentLink descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	@Override
	public FluentLink componentError(ErrorMessage componentError) {
		super.componentError(componentError);
		return this;
	}

	@Override
	public FluentLink heightPx(float height) {
		super.heightPx(height);
		return this;
	}

	@Override
	public FluentLink heightPercent(float height) {
		super.heightPercent(height);
		return this;
	}

	@Override
	public FluentLink height(String height) {
		super.height(height);
		return this;
	}

	@Override
	public FluentLink widthPx(float width) {
		super.widthPx(width);
		return this;
	}

	@Override
	public FluentLink widthPercent(float width) {
		super.widthPercent(width);
		return this;
	}

	@Override
	public FluentLink width(String width) {
		super.width(width);
		return this;
	}

	@Override
	public FluentLink width(float width, Sizeable.Unit unit) {
		super.width(width, unit);
		return this;
	}

	@Override
	public FluentLink height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	@Override
	public FluentLink responsive() {
		super.responsive();
		return this;
	}

	@Override
	public FluentLink sizeFull() {
		super.sizeFull();
		return this;
	}

	@Override
	public FluentLink sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	@Override
	public FluentLink widthUndefined() {
		super.widthUndefined();
		return this;
	}

	@Override
	public FluentLink heightUndefined() {
		super.heightUndefined();
		return this;
	}
}
