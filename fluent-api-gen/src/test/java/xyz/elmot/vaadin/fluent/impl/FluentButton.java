package xyz.elmot.vaadin.fluent.impl;

import com.vaadin.ui.Button;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

public class FluentButton extends FluentComponent<Button> {

	public FluentButton() {
		super(new Button());
	}

	public FluentButton click(Button.ClickListener listener) {
		this.component.addClickListener(listener);
		return this;
	}

	public FluentButton clickShortcut(int keyCode, int... modifiers) {
		this.component.setClickShortcut(keyCode, modifiers);
		return this;
	}

	public FluentButton disableOnClick(boolean disableOnClick) {
		this.component.setDisableOnClick(disableOnClick);
		return this;
	}

	public FluentButton iconAlternateText(String iconAltText) {
		this.component.setIconAlternateText(iconAltText);
		return this;
	}

	@Override
	public FluentButton id(String id) {
		super.id(id);
		return this;
	}

	@Override
	public FluentButton primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	@Override
	public FluentButton styles(String... styles) {
		super.styles(styles);
		return this;
	}

	@Override
	public FluentButton caption(String caption) {
		super.caption(caption);
		return this;
	}

	@Override
	public FluentButton captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	@Override
	public FluentButton locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	@Override
	public FluentButton icon(Resource icon) {
		super.icon(icon);
		return this;
	}

	@Override
	public FluentButton themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	@Override
	public FluentButton disabled() {
		super.disabled();
		return this;
	}

	@Override
	public FluentButton hidden() {
		super.hidden();
		return this;
	}

	@Override
	public FluentButton description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public FluentButton descriptionText(String description) {
		super.descriptionText(description);
		return this;
	}

	@Override
	public FluentButton descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	@Override
	public FluentButton componentError(ErrorMessage componentError) {
		super.componentError(componentError);
		return this;
	}

	@Override
	public FluentButton heightPx(float height) {
		super.heightPx(height);
		return this;
	}

	@Override
	public FluentButton heightPercent(float height) {
		super.heightPercent(height);
		return this;
	}

	@Override
	public FluentButton height(String height) {
		super.height(height);
		return this;
	}

	@Override
	public FluentButton widthPx(float width) {
		super.widthPx(width);
		return this;
	}

	@Override
	public FluentButton widthPercent(float width) {
		super.widthPercent(width);
		return this;
	}

	@Override
	public FluentButton width(String width) {
		super.width(width);
		return this;
	}

	@Override
	public FluentButton width(float width, Sizeable.Unit unit) {
		super.width(width, unit);
		return this;
	}

	@Override
	public FluentButton height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	@Override
	public FluentButton responsive() {
		super.responsive();
		return this;
	}

	@Override
	public FluentButton sizeFull() {
		super.sizeFull();
		return this;
	}

	@Override
	public FluentButton sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	@Override
	public FluentButton widthUndefined() {
		super.widthUndefined();
		return this;
	}

	@Override
	public FluentButton heightUndefined() {
		super.heightUndefined();
		return this;
	}
}