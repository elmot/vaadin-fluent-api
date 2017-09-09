package org.vaadin.addon.elmot.fluent.impl;

import com.vaadin.data.HasValue;
import com.vaadin.ui.TextField;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

/**
 * Fluent API envelope for Vaadin {@link com.vaadin.ui.TextField}.
 * 
 * @see org.vaadin.addon.elmot.fluent.Fluent
 */
@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class FluentTextField extends FluentComponent<TextField> {

	/**
	 * Creates new Fluent API envelope for {@link com.vaadin.ui.TextField}
	 * 
	 * @see org.vaadin.addon.elmot.fluent.Fluent
	 */
	public FluentTextField() {
		super(new TextField());
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.TextField#setValue}
	 * 
	 * @return self object
	 */
	public FluentTextField value(String value) {
		this.component.setValue(value);
		return this;
	}

	/**
	 * Fluent API for
	 * {@link com.vaadin.ui.TextField#addValueChangeListener(HasValue.ValueChangeListener)}
	 *
	 * @return self object
	 */
	public FluentTextField valueChangeListener(
			HasValue.ValueChangeListener<String> listener) {
		this.component.addValueChangeListener(listener);
		return this;
	}

	/**
	 * Fluent API for
	 * {@link com.vaadin.ui.TextField#setRequiredIndicatorVisible}
	 * 
	 * @return self object
	 */
	public FluentTextField requiredIndicatorVisible(
			boolean requiredIndicatorVisible) {
		this.component.setRequiredIndicatorVisible(requiredIndicatorVisible);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.TextField#setReadOnly}
	 * 
	 * @return self object
	 */
	public FluentTextField readOnly(boolean readOnly) {
		this.component.setReadOnly(readOnly);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setId}
	 * 
	 * @return self object
	 */
	@Override
	public FluentTextField id(String id) {
		super.id(id);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setPrimaryStyleName(String)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentTextField primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#addStyleNames}
	 * 
	 * @return self object
	 */
	@Override
	public FluentTextField styles(String... styles) {
		super.styles(styles);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setCaption(String)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentTextField caption(String caption) {
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
	public FluentTextField captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setLocale(Locale)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentTextField locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setIcon(Resource)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentTextField icon(Resource icon) {
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
	public FluentTextField themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setEnabled(boolean)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentTextField disabled() {
		super.disabled();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setVisible(boolean)  }
	 * 
	 * @return self object
	 */
	@Override
	public FluentTextField hidden() {
		super.hidden();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setDescription(String)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentTextField description(String description) {
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
	public FluentTextField descriptionText(String description) {
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
	public FluentTextField descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setComponentError(ErrorMessage)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentTextField componentError(ErrorMessage componentError) {
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
	public FluentTextField heightPx(float height) {
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
	public FluentTextField heightPercent(float height) {
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
	public FluentTextField height(String height) {
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
	public FluentTextField widthPx(float width) {
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
	public FluentTextField widthPercent(float width) {
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
	public FluentTextField width(String width) {
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
	public FluentTextField width(float width, Sizeable.Unit unit) {
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
	public FluentTextField height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setResponsive(boolean)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentTextField responsive() {
		super.responsive();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setSizeFull()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentTextField sizeFull() {
		super.sizeFull();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setSizeUndefined()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentTextField sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setWidthUndefined()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentTextField widthUndefined() {
		super.widthUndefined();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setHeightUndefined()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentTextField heightUndefined() {
		super.heightUndefined();
		return this;
	}
}
