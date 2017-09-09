package org.vaadin.addon.elmot.fluent.impl;

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

/**
 * Fluent API envelope for Vaadin {@link com.vaadin.ui.Panel}.
 * 
 * @see org.vaadin.addon.elmot.fluent.Fluent
 */
@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class FluentPanel extends FluentComponent<Panel> {

	/**
	 * Creates new Fluent API envelope for {@link com.vaadin.ui.Panel}
	 * 
	 * @see org.vaadin.addon.elmot.fluent.Fluent
	 */
	public FluentPanel() {
		super(new Panel());
	}

	/**
	 * Creates new Fluent API envelope for {@link com.vaadin.ui.Panel} with the
	 * component inside
	 *
	 * @param component
	 *            to be put inside
	 * @see org.vaadin.addon.elmot.fluent.Fluent
	 */
	public FluentPanel(Component component) {
		this();
		content(component);
	}

	/**
	 * Fluent API for
	 * {@link com.vaadin.ui.Panel#addClickListener(MouseEvents.ClickListener)}
	 *
	 * @return self object
	 */
	public FluentPanel click(MouseEvents.ClickListener listener) {
		this.component.addClickListener(listener);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.Panel#setTabIndex}
	 * 
	 * @return self object
	 */
	public FluentPanel tabIndex(int tabIndex) {
		this.component.setTabIndex(tabIndex);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.Panel#setContent}
	 * 
	 * @return self object
	 */
	public FluentPanel content(Component component) {
		this.component.setContent(component);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setId}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel id(String id) {
		super.id(id);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setPrimaryStyleName(String)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#addStyleNames}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel styles(String... styles) {
		super.styles(styles);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setCaption(String)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel caption(String caption) {
		super.caption(caption);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setCaption(String)} and
	 * {@link AbstractComponent#setCaptionAsHtml(boolean)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setLocale(Locale)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setIcon(Resource)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel icon(Resource icon) {
		super.icon(icon);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setIcon(Resource)} parametrized
	 * with {@link ThemeResource}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setEnabled(boolean)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel disabled() {
		super.disabled();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setVisible(boolean)  }
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel hidden() {
		super.hidden();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setDescription(String)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel description(String description) {
		super.description(description);
		return this;
	}

	/**
	 * Fluent API for
	 * {@link AbstractComponent#setDescription(String,ContentMode)} (String)}
	 * and
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel descriptionText(String description) {
		super.descriptionText(description);
		return this;
	}

	/**
	 * Fluent API for
	 * {@link AbstractComponent#setDescription(String,ContentMode)} (String)}
	 * and
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setComponentError(ErrorMessage)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel componentError(ErrorMessage componentError) {
		super.componentError(componentError);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setHeight(float,Sizeable.Unit)}
	 * 
	 * @param height
	 *            in pixels
	 * @return self object
	 */
	@Override
	public FluentPanel heightPx(float height) {
		super.heightPx(height);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setHeight(float,Sizeable.Unit)}
	 * 
	 * @param height
	 *            in percents
	 * @return self object
	 */
	@Override
	public FluentPanel heightPercent(float height) {
		super.heightPercent(height);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setHeight(String)}
	 * 
	 * @param height
	 *            as text
	 * @return self object
	 */
	@Override
	public FluentPanel height(String height) {
		super.height(height);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setWidth(float,Sizeable.Unit)}
	 * 
	 * @param width
	 *            in pixels
	 * @return self object
	 */
	@Override
	public FluentPanel widthPx(float width) {
		super.widthPx(width);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setWidth(float,Sizeable.Unit)}
	 * 
	 * @param width
	 *            in percents
	 * @return self object
	 */
	@Override
	public FluentPanel widthPercent(float width) {
		super.widthPercent(width);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setWidth(String)}
	 * 
	 * @param width
	 *            as string
	 * @return self object
	 */
	@Override
	public FluentPanel width(String width) {
		super.width(width);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setWidth(float,Sizeable.Unit)}
	 * 
	 * @param width
	 *            value
	 * @param unit
	 *            units
	 * @return self object
	 */
	@Override
	public FluentPanel width(float width, Sizeable.Unit unit) {
		super.width(width, unit);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setHeight(float,Sizeable.Unit)}
	 * 
	 * @param height
	 *            value
	 * @param unit
	 *            units
	 * @return self object
	 */
	@Override
	public FluentPanel height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setResponsive(boolean)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel responsive() {
		super.responsive();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setSizeFull()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel sizeFull() {
		super.sizeFull();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setSizeUndefined()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setWidthUndefined()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel widthUndefined() {
		super.widthUndefined();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setHeightUndefined()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentPanel heightUndefined() {
		super.heightUndefined();
		return this;
	}

}
