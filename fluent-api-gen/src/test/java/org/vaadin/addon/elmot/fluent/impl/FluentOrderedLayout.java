package org.vaadin.addon.elmot.fluent.impl;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import java.util.stream.Stream;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

/**
 * Fluent API envelope for Vaadin {@link com.vaadin.ui.HorizontalLayout} and
 * {@link com.vaadin.ui.VerticalLayout}.
 *
 * @see org.vaadin.addon.elmot.fluent.Fluent
 */
@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class FluentOrderedLayout<T extends AbstractOrderedLayout>
		extends
			FluentComponent<T> {

	/**
	 * Creates a new fluent envelope for the given layout
	 * 
	 * @param component
	 *            layout to be used
	 */
	public FluentOrderedLayout(T component) {
		super(component);
	}

	/**
	 * Fluent API for {@link ComponentContainer#addComponents(Component...)}
	 *
	 * @return self object
	 */
	public FluentOrderedLayout<T> addAll(Component... components) {
		this.component.addComponents(components);
		return this;
	}

	/**
	 * Fluent + Stream API for
	 * {@link ComponentContainer#addComponents(Component...)}
	 *
	 * @return self object
	 */
	public <V extends Component> FluentOrderedLayout<T> addAll(
			Stream<V> components) {
		// noinspection Convert2MethodRef
		components.forEach(c -> this.component.addComponent(c));// javac bug, do
																// not convert
																// to method ref
		return this;
	}

	/**
	 * Fluent API for {@link ComponentContainer#addComponent(Component)} and
	 * {@link AbstractOrderedLayout#setComponentAlignment(Component, Alignment)}
	 *
	 * @return self object
	 */
	public FluentOrderedLayout<T> add(FluentComponent<?> fluentComponent,
			Alignment alignment) {
		return add(fluentComponent.get(), alignment);
	}

	/**
	 * Fluent API for {@link ComponentContainer#addComponent(Component)} and
	 * {@link AbstractOrderedLayout#setComponentAlignment(Component, Alignment)}
	 *
	 * @return self object
	 */
	public FluentOrderedLayout<T> add(Component childComponent,
			Alignment alignment) {
		this.component.addComponent(childComponent);
		this.component.setComponentAlignment(childComponent, alignment);
		return this;
	}

	/**
	 * Fluent API for {@link ComponentContainer#addComponent(Component)} and
	 * {@link AbstractOrderedLayout#setExpandRatio(Component, float)}
	 *
	 * @return self object
	 */
	public FluentOrderedLayout<T> add(FluentComponent<?> fluentComponent,
			double ratio) {
		return add(fluentComponent.get(), ratio);
	}

	/**
	 * Fluent API for {@link ComponentContainer#addComponents(Component...)}
	 *
	 * @return self object
	 */
	public FluentOrderedLayout<T> addAll(FluentComponent<?>... fluentComponents) {
		for (FluentComponent<?> fluentComponent : fluentComponents) {
			this.component.addComponent(fluentComponent.get());
		}
		return this;
	}

	/**
	 * Fluent API for {@link ComponentContainer#addComponent(Component)} and
	 * {@link AbstractOrderedLayout#setExpandRatio(Component, float)}
	 *
	 * @return self object
	 */
	public FluentOrderedLayout<T> add(Component childComponent, double ratio) {
		this.component.addComponent(childComponent);
		this.component.setExpandRatio(childComponent, (float) ratio);
		return this;
	}

	/**
	 * Fluent API for {@link ComponentContainer#addComponent(Component)},
	 * {@link AbstractOrderedLayout#setComponentAlignment(Component, Alignment)}
	 * and {@link AbstractOrderedLayout#setExpandRatio(Component, float)}
	 *
	 * @return self object
	 */
	public FluentOrderedLayout<T> add(FluentComponent<?> fluentComponent,
			Alignment alignment, double ratio) {
		return add(fluentComponent.get(), alignment, ratio);
	}

	/**
	 * Fluent API for {@link ComponentContainer#addComponent(Component)},
	 * {@link AbstractOrderedLayout#setComponentAlignment(Component, Alignment)}
	 * and {@link AbstractOrderedLayout#setExpandRatio(Component, float)}
	 *
	 * @return self object
	 */
	public FluentOrderedLayout<T> add(Component childComponent,
			Alignment alignment, double ratio) {
		this.component.addComponent(childComponent);
		this.component.setExpandRatio(childComponent, (float) ratio);
		this.component.setComponentAlignment(childComponent, alignment);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractOrderedLayout#setSpacing(boolean)}
	 *
	 * @return self object
	 */
	public FluentOrderedLayout<T> spacing(boolean spacing) {
		component.setSpacing(spacing);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractOrderedLayout#setMargin(boolean)}
	 *
	 * @return self object
	 */
	public FluentOrderedLayout<T> margin(boolean enabled) {
		this.component.setMargin(enabled);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractOrderedLayout#setMargin(MarginInfo)}
	 *
	 * @return self object
	 */
	public FluentOrderedLayout<T> margin(boolean vertical, boolean horizontal) {
		return margin(new MarginInfo(vertical, horizontal));
	}

	/**
	 * Fluent API for {@link AbstractOrderedLayout#setMargin(MarginInfo)}
	 *
	 * @return self object
	 */
	public FluentOrderedLayout<T> margin(boolean top, boolean right,
			boolean bottom, boolean left) {
		return margin(new MarginInfo(top, right, bottom, left));
	}

	/**
	 * Fluent API for {@link AbstractOrderedLayout#setMargin(MarginInfo)}
	 *
	 * @return self object
	 */
	public FluentOrderedLayout<T> margin(MarginInfo marginInfo) {
		this.component.setMargin(marginInfo);
		return this;
	}

	/**
	 * Fluent API for
	 * {@link AbstractOrderedLayout#setDefaultComponentAlignment(Alignment)}
	 *
	 * @return self object
	 */
	public FluentOrderedLayout<T> defaultComponentAlignment(
			Alignment defaultAlignment) {
		this.component.setDefaultComponentAlignment(defaultAlignment);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setId}
	 * 
	 * @return self object
	 */
	@Override
	public FluentOrderedLayout id(String id) {
		super.id(id);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setPrimaryStyleName(String)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentOrderedLayout primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#addStyleNames}
	 * 
	 * @return self object
	 */
	@Override
	public FluentOrderedLayout styles(String... styles) {
		super.styles(styles);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setCaption(String)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentOrderedLayout caption(String caption) {
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
	public FluentOrderedLayout captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setLocale(Locale)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentOrderedLayout locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setIcon(Resource)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentOrderedLayout icon(Resource icon) {
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
	public FluentOrderedLayout themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setEnabled(boolean)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentOrderedLayout disabled() {
		super.disabled();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setVisible(boolean)  }
	 * 
	 * @return self object
	 */
	@Override
	public FluentOrderedLayout hidden() {
		super.hidden();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setDescription(String)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentOrderedLayout description(String description) {
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
	public FluentOrderedLayout descriptionText(String description) {
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
	public FluentOrderedLayout descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setComponentError(ErrorMessage)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentOrderedLayout componentError(ErrorMessage componentError) {
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
	public FluentOrderedLayout heightPx(float height) {
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
	public FluentOrderedLayout heightPercent(float height) {
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
	public FluentOrderedLayout height(String height) {
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
	public FluentOrderedLayout widthPx(float width) {
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
	public FluentOrderedLayout widthPercent(float width) {
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
	public FluentOrderedLayout width(String width) {
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
	public FluentOrderedLayout width(float width, Sizeable.Unit unit) {
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
	public FluentOrderedLayout height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setResponsive(boolean)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentOrderedLayout responsive() {
		super.responsive();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setSizeFull()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentOrderedLayout sizeFull() {
		super.sizeFull();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setSizeUndefined()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentOrderedLayout sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setWidthUndefined()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentOrderedLayout widthUndefined() {
		super.widthUndefined();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setHeightUndefined()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentOrderedLayout heightUndefined() {
		super.heightUndefined();
		return this;
	}
}
