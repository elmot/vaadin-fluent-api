package org.vaadin.addon.elmot.fluent.impl;

import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Generic Fluent API envelope for Vaadin components
 *
 * @param <T>
 *            component type
 * @see AbstractComponent
 * @see org.vaadin.addon.elmot.fluent.Fluent
 */
@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class FluentComponent<T extends AbstractComponent>
		implements
			Supplier<T> {

	protected final T component;

	/**
	 * Creates a new Fluent envelope for the given component
	 *
	 * @param component
	 *            component to be used
	 * @see org.vaadin.addon.elmot.fluent.Fluent#use
	 * @see org.vaadin.addon.elmot.fluent.Fluent#$
	 */
	public FluentComponent(final T component) {
		this.component = component;
	}

	/**
	 * Returns enveloped component
	 *
	 * @return enveloped component
	 */
	@Override
	public T get() {
		return component;
	}

	/**
	 * Executes an arbitrary code on the component. Example:<br>
	 * <br>
	 * {@code Fluent.$ new Grid()).setup(grid ->
	 * grid.setBeanType(YourBean.class)).id("grid");}
	 *
	 * @param setupCode
	 *            some code to execute
	 */
	public FluentComponent<? extends T> setup(Consumer<T> setupCode) {
		setupCode.accept(component);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setId}
	 *
	 * @return self object
	 */
	public FluentComponent id(String id) {
		component.setId(id);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setPrimaryStyleName(String)}
	 *
	 * @return self object
	 */
	public FluentComponent primaryStyle(String style) {
		component.setPrimaryStyleName(style);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#addStyleNames}
	 *
	 * @return self object
	 */
	public FluentComponent styles(String... styles) {
		component.addStyleNames(styles);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setCaption(String)}
	 *
	 * @return self object
	 */
	public FluentComponent caption(String caption) {
		component.setCaption(caption);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setCaption(String)} and
	 * {@link AbstractComponent#setCaptionAsHtml(boolean)}
	 *
	 * @return self object
	 */
	public FluentComponent captionHtml(boolean captionAsHtml) {
		component.setCaptionAsHtml(captionAsHtml);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setLocale(Locale)}
	 *
	 * @return self object
	 */
	public FluentComponent locale(Locale locale) {
		component.setLocale(locale);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setIcon(Resource)}
	 *
	 * @return self object
	 */
	public FluentComponent icon(Resource icon) {
		component.setIcon(icon);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setIcon(Resource)} parametrized
	 * with {@link ThemeResource}
	 *
	 * @return self object
	 */
	public FluentComponent themeIcon(CharSequence iconUrl) {
		component.setIcon(new ThemeResource(iconUrl.toString()));
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setEnabled(boolean)}
	 *
	 * @return self object
	 */
	public FluentComponent disabled() {
		component.setEnabled(false);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setVisible(boolean) }
	 *
	 * @return self object
	 */
	public FluentComponent hidden() {
		component.setVisible(false);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setDescription(String)}
	 *
	 * @return self object
	 */
	public FluentComponent description(String description) {
		component.setDescription(description);
		return this;
	}

	/**
	 * Fluent API for
	 * {@link AbstractComponent#setDescription(String, ContentMode)} (String)}
	 * and
	 *
	 * @return self object
	 */
	public FluentComponent descriptionText(String description) {
		component.setDescription(description, ContentMode.TEXT);
		return this;
	}

	/**
	 * Fluent API for
	 * {@link AbstractComponent#setDescription(String, ContentMode)} (String)}
	 * and
	 *
	 * @return self object
	 */
	public FluentComponent descriptionHtml(String description) {
		component.setDescription(description, ContentMode.HTML);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setComponentError(ErrorMessage)}
	 *
	 * @return self object
	 */
	public FluentComponent componentError(ErrorMessage componentError) {
		component.setComponentError(componentError);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setHeight(float, Sizeable.Unit)}
	 *
	 * @param height
	 *            in pixels
	 * @return self object
	 */
	public FluentComponent heightPx(float height) {
		component.setHeight(height, Sizeable.Unit.PIXELS);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setHeight(float, Sizeable.Unit)}
	 *
	 * @param height
	 *            in percents
	 * @return self object
	 */
	public FluentComponent heightPercent(float height) {
		component.setHeight(height, Sizeable.Unit.PERCENTAGE);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setHeight(String)}
	 *
	 * @param height
	 *            as text
	 * @return self object
	 */
	public FluentComponent height(String height) {
		component.setHeight(height);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setWidth(float, Sizeable.Unit)}
	 *
	 * @param width
	 *            in pixels
	 * @return self object
	 */
	public FluentComponent widthPx(float width) {
		component.setWidth(width, Sizeable.Unit.PIXELS);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setWidth(float, Sizeable.Unit)}
	 *
	 * @param width
	 *            in percents
	 * @return self object
	 */
	public FluentComponent widthPercent(float width) {
		component.setWidth(width, Sizeable.Unit.PERCENTAGE);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setWidth(String)}
	 *
	 * @param width
	 *            as string
	 * @return self object
	 */
	public FluentComponent width(String width) {
		component.setWidth(width);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setWidth(float, Sizeable.Unit)}
	 *
	 * @param width
	 *            value
	 * @param unit
	 *            units
	 * @return self object
	 */
	public FluentComponent width(float width, Sizeable.Unit unit) {
		component.setWidth(width, unit);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setHeight(float, Sizeable.Unit)}
	 *
	 * @param height
	 *            value
	 * @param unit
	 *            units
	 * @return self object
	 */
	public FluentComponent height(float height, Sizeable.Unit unit) {
		component.setHeight(height, unit);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setResponsive(boolean)}
	 *
	 * @return self object
	 */
	public FluentComponent responsive() {
		component.setResponsive(true);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setSizeFull()}
	 *
	 * @return self object
	 */
	public FluentComponent sizeFull() {
		component.setSizeFull();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setSizeUndefined()}
	 *
	 * @return self object
	 */
	public FluentComponent sizeUndefined() {
		component.setSizeUndefined();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setWidthUndefined()}
	 *
	 * @return self object
	 */
	public FluentComponent widthUndefined() {
		component.setWidthUndefined();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setHeightUndefined()}
	 *
	 * @return self object
	 */
	public FluentComponent heightUndefined() {
		component.setHeightUndefined();
		return this;
	}
}
