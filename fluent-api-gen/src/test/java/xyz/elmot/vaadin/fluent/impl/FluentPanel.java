package xyz.elmot.vaadin.fluent.impl;

import com.vaadin.event.MouseEvents;
import com.vaadin.server.Sizeable;
import com.vaadin.ui.Component;
import com.vaadin.ui.Panel;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

public class FluentPanel extends FluentComponent<Panel> {

	public FluentPanel() {
		super(new Panel());
	}

	public FluentPanel(Component component) {
		this();
		content(component);
	}

	public FluentPanel click(MouseEvents.ClickListener listener) {
		this.component.addClickListener(listener);
		return this;
	}

	public FluentPanel tabIndex(int tabIndex) {
		this.component.setTabIndex(tabIndex);
		return this;
	}

	public FluentPanel content(Component component) {
		this.component.setContent(component);
		return this;
	}

	@Override
	public FluentPanel id(String id) {
		super.id(id);
		return this;
	}

	@Override
	public FluentPanel primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	@Override
	public FluentPanel styles(String... styles) {
		super.styles(styles);
		return this;
	}

	@Override
	public FluentPanel caption(String caption) {
		super.caption(caption);
		return this;
	}

	@Override
	public FluentPanel captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	@Override
	public FluentPanel locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	@Override
	public FluentPanel icon(Resource icon) {
		super.icon(icon);
		return this;
	}

	@Override
	public FluentPanel themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	@Override
	public FluentPanel disabled() {
		super.disabled();
		return this;
	}

	@Override
	public FluentPanel hidden() {
		super.hidden();
		return this;
	}

	@Override
	public FluentPanel description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public FluentPanel descriptionText(String description) {
		super.descriptionText(description);
		return this;
	}

	@Override
	public FluentPanel descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	@Override
	public FluentPanel componentError(ErrorMessage componentError) {
		super.componentError(componentError);
		return this;
	}

	@Override
	public FluentPanel heightPx(float height) {
		super.heightPx(height);
		return this;
	}

	@Override
	public FluentPanel heightPercent(float height) {
		super.heightPercent(height);
		return this;
	}

	@Override
	public FluentPanel height(String height) {
		super.height(height);
		return this;
	}

	@Override
	public FluentPanel widthPx(float width) {
		super.widthPx(width);
		return this;
	}

	@Override
	public FluentPanel widthPercent(float width) {
		super.widthPercent(width);
		return this;
	}

	@Override
	public FluentPanel width(String width) {
		super.width(width);
		return this;
	}

	@Override
	public FluentPanel width(float width, Sizeable.Unit unit) {
		super.width(width, unit);
		return this;
	}

	@Override
	public FluentPanel height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	@Override
	public FluentPanel responsive() {
		super.responsive();
		return this;
	}

	@Override
	public FluentPanel sizeFull() {
		super.sizeFull();
		return this;
	}

	@Override
	public FluentPanel sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	@Override
	public FluentPanel widthUndefined() {
		super.widthUndefined();
		return this;
	}

	@Override
	public FluentPanel heightUndefined() {
		super.heightUndefined();
		return this;
	}

}
