package xyz.elmot.vaadin.fluent.impl;

import com.vaadin.shared.ui.MarginInfo;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;

import java.util.function.Supplier;
import java.util.stream.Stream;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

public class FluentOrderedLayout<T extends AbstractOrderedLayout>
		extends
			FluentComponent<T> {

	public FluentOrderedLayout(T component) {
		super(component);
	}

	public FluentOrderedLayout<T> add(Component... components) {
		this.component.addComponents(components);
		return this;
	}

	public <V extends Component> FluentOrderedLayout<T> add(Stream<V> components) {
		components.forEach(c -> this.component.addComponent(c));
		// components.forEach(this.component::addComponent);
		return this;
	}

	public <V extends Component> FluentOrderedLayout<T> add(
			Supplier<V> componentSupplier, Alignment alignment) {
		return add(componentSupplier.get(), alignment);
	}

	private FluentOrderedLayout<T> add(Component childComponent,
			Alignment alignment) {
		this.component.addComponent(childComponent);
		this.component.setComponentAlignment(childComponent, alignment);
		return this;
	}

	public FluentOrderedLayout<T> setSpacing(boolean spacing) {
		component.setSpacing(spacing);
		return this;
	}

	public FluentOrderedLayout<T> add(
			Supplier<? extends Component> componentSupplier, float ratio) {
		return add(componentSupplier.get(), ratio);
	}

	private FluentOrderedLayout<T> add(Component childComponent, float ratio) {
		this.component.addComponent(childComponent);
		this.component.setExpandRatio(childComponent, ratio);
		return this;
	}

	public FluentOrderedLayout<T> add(
			Supplier<? extends Component> componentSupplier,
			Alignment alignment, float ratio) {
		return add(componentSupplier.get(), alignment, ratio);
	}

	private FluentOrderedLayout<T> add(Component childComponent,
			Alignment alignment, float ratio) {
		this.component.addComponent(childComponent);
		this.component.setExpandRatio(childComponent, ratio);
		this.component.setComponentAlignment(childComponent, alignment);
		return this;
	}

	public FluentOrderedLayout<T> margin(boolean enabled) {
		this.component.setMargin(enabled);
		return this;
	}

	public FluentOrderedLayout<T> margin(boolean vertical, boolean horizontal) {
		return margin(new MarginInfo(vertical, horizontal));
	}

	public FluentOrderedLayout<T> margin(boolean top, boolean right,
			boolean bottom, boolean left) {
		return margin(new MarginInfo(top, right, bottom, left));
	}

	public FluentOrderedLayout<T> margin(MarginInfo marginInfo) {
		this.component.setMargin(marginInfo);
		return this;
	}

	public FluentOrderedLayout<T> defaultComponentAlignment(
			Alignment defaultAlignment) {
		this.component.setDefaultComponentAlignment(defaultAlignment);
		return this;
	}

	@Override
	public FluentOrderedLayout id(String id) {
		super.id(id);
		return this;
	}

	@Override
	public FluentOrderedLayout primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	@Override
	public FluentOrderedLayout styles(String... styles) {
		super.styles(styles);
		return this;
	}

	@Override
	public FluentOrderedLayout caption(String caption) {
		super.caption(caption);
		return this;
	}

	@Override
	public FluentOrderedLayout captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	@Override
	public FluentOrderedLayout locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	@Override
	public FluentOrderedLayout icon(Resource icon) {
		super.icon(icon);
		return this;
	}

	@Override
	public FluentOrderedLayout themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	@Override
	public FluentOrderedLayout disabled() {
		super.disabled();
		return this;
	}

	@Override
	public FluentOrderedLayout hidden() {
		super.hidden();
		return this;
	}

	@Override
	public FluentOrderedLayout description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public FluentOrderedLayout descriptionText(String description) {
		super.descriptionText(description);
		return this;
	}

	@Override
	public FluentOrderedLayout descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	@Override
	public FluentOrderedLayout componentError(ErrorMessage componentError) {
		super.componentError(componentError);
		return this;
	}

	@Override
	public FluentOrderedLayout heightPx(float height) {
		super.heightPx(height);
		return this;
	}

	@Override
	public FluentOrderedLayout heightPercent(float height) {
		super.heightPercent(height);
		return this;
	}

	@Override
	public FluentOrderedLayout height(String height) {
		super.height(height);
		return this;
	}

	@Override
	public FluentOrderedLayout widthPx(float width) {
		super.widthPx(width);
		return this;
	}

	@Override
	public FluentOrderedLayout widthPercent(float width) {
		super.widthPercent(width);
		return this;
	}

	@Override
	public FluentOrderedLayout width(String width) {
		super.width(width);
		return this;
	}

	@Override
	public FluentOrderedLayout width(float width, Sizeable.Unit unit) {
		super.width(width, unit);
		return this;
	}

	@Override
	public FluentOrderedLayout height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	@Override
	public FluentOrderedLayout responsive() {
		super.responsive();
		return this;
	}

	@Override
	public FluentOrderedLayout sizeFull() {
		super.sizeFull();
		return this;
	}

	@Override
	public FluentOrderedLayout sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	@Override
	public FluentOrderedLayout widthUndefined() {
		super.widthUndefined();
		return this;
	}

	@Override
	public FluentOrderedLayout heightUndefined() {
		super.heightUndefined();
		return this;
	}
}