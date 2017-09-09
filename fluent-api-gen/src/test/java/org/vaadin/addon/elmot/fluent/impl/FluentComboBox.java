package org.vaadin.addon.elmot.fluent.impl;

import com.vaadin.data.HasValue;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.server.SerializableFunction;
import com.vaadin.server.SerializableToIntFunction;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.IconGenerator;
import com.vaadin.ui.ItemCaptionGenerator;
import com.vaadin.ui.StyleGenerator;
import java.util.Collection;
import java.util.stream.Stream;
import com.vaadin.server.ErrorMessage;
import com.vaadin.server.Resource;
import com.vaadin.server.Sizeable;
import com.vaadin.server.ThemeResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.AbstractComponent;
import java.util.Locale;

/**
 * Fluent API envelope for Vaadin {@link com.vaadin.ui.ComboBox}.
 * 
 * @see org.vaadin.addon.elmot.fluent.Fluent
 */
@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class FluentComboBox<ITEM> extends FluentComponent<ComboBox<ITEM>> {

	/**
	 * Creates new Fluent API envelope for {@link com.vaadin.ui.ComboBox}
	 * 
	 * @see org.vaadin.addon.elmot.fluent.Fluent
	 */
	public FluentComboBox() {
		super(new ComboBox<>());
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setValue}
	 * 
	 * @return self object
	 */
	public FluentComboBox value(ITEM value) {
		this.component.setValue(value);
		return this;
	}

	/**
	 * Fluent API for
	 * {@link com.vaadin.ui.ComboBox#addValueChangeListener(HasValue.ValueChangeListener)}
	 *
	 * @return self object
	 */
	public FluentComboBox valueChangeListener(
			HasValue.ValueChangeListener<ITEM> listener) {
		this.component.addValueChangeListener(listener);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setRequiredIndicatorVisible}
	 * 
	 * @return self object
	 */
	public FluentComboBox requiredIndicatorVisible(
			boolean requiredIndicatorVisible) {
		this.component.setRequiredIndicatorVisible(requiredIndicatorVisible);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setReadOnly}
	 * 
	 * @return self object
	 */
	public FluentComboBox readOnly(boolean readOnly) {
		this.component.setReadOnly(readOnly);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setItems}
	 * 
	 * @return self object
	 */
	public FluentComboBox items(Collection<ITEM> items) {
		this.component.setItems(items);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setItems}
	 * 
	 * @return self object
	 */
	public FluentComboBox items(Stream<ITEM> streamOfItems) {
		this.component.setItems(streamOfItems);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setItems}
	 * 
	 * @return self object
	 */
	@SuppressWarnings("unchecked")
	public FluentComboBox items(final ITEM... items) {
		this.component.setItems(items);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setDataProvider}
	 * 
	 * @return self object
	 */
	public FluentComboBox dataProvider(ListDataProvider<ITEM> listDataProvider) {
		this.component.setDataProvider(listDataProvider);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setDataProvider}
	 * 
	 * @return self object
	 */
	public FluentComboBox dataProvider(ComboBox.CaptionFilter captionFilter,
			ListDataProvider<ITEM> listDataProvider) {
		this.component.setDataProvider(captionFilter, listDataProvider);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setItems}
	 * 
	 * @return self object
	 */
	@SuppressWarnings("unchecked")
	public FluentComboBox items(ComboBox.CaptionFilter captionFilter,
			@SuppressWarnings("unchecked") ITEM... items) {
		this.component.setItems(captionFilter, items);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setPlaceholder}
	 * 
	 * @return self object
	 */
	public FluentComboBox placeholder(String placeholder) {
		this.component.setPlaceholder(placeholder);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setTextInputAllowed}
	 * 
	 * @return self object
	 */
	public FluentComboBox textInputAllowed(boolean textInputAllowed) {
		this.component.setTextInputAllowed(textInputAllowed);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setPageLength}
	 * 
	 * @return self object
	 */
	public FluentComboBox pageLength(int pageLength) {
		this.component.setPageLength(pageLength);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setEmptySelectionAllowed}
	 * 
	 * @return self object
	 */
	public FluentComboBox emptySelectionAllowed(boolean emptySelectionAllowed) {
		this.component.setEmptySelectionAllowed(emptySelectionAllowed);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setEmptySelectionCaption}
	 * 
	 * @return self object
	 */
	public FluentComboBox emptySelectionCaption(String caption) {
		this.component.setEmptySelectionCaption(caption);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setPopupWidth}
	 * 
	 * @return self object
	 */
	public FluentComboBox popupWidth(String width) {
		this.component.setPopupWidth(width);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setScrollToSelectedItem}
	 * 
	 * @return self object
	 */
	public FluentComboBox scrollToSelectedItem(boolean scrollToSelectedItem) {
		this.component.setScrollToSelectedItem(scrollToSelectedItem);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setItemCaptionGenerator}
	 * 
	 * @return self object
	 */
	public FluentComboBox itemCaptionGenerator(
			ItemCaptionGenerator<ITEM> itemCaptionGenerator) {
		this.component.setItemCaptionGenerator(itemCaptionGenerator);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setStyleGenerator}
	 * 
	 * @return self object
	 */
	public FluentComboBox styleGenerator(StyleGenerator<ITEM> itemStyleGenerator) {
		this.component.setStyleGenerator(itemStyleGenerator);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setItemIconGenerator}
	 * 
	 * @return self object
	 */
	public FluentComboBox itemIconGenerator(
			IconGenerator<ITEM> itemIconGenerator) {
		this.component.setItemIconGenerator(itemIconGenerator);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setNewItemHandler}
	 * 
	 * @return self object
	 */
	public FluentComboBox newItemHandler(ComboBox.NewItemHandler newItemHandler) {
		this.component.setNewItemHandler(newItemHandler);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setDataProvider}
	 * 
	 * @return self object
	 */
	public <C> FluentComboBox dataProvider(DataProvider<ITEM, C> dataProvider,
			SerializableFunction<String, C> filterConverter) {
		this.component.setDataProvider(dataProvider, filterConverter);
		return this;
	}

	/**
	 * Fluent API for {@link com.vaadin.ui.ComboBox#setDataProvider}
	 * 
	 * @return self object
	 */
	public FluentComboBox dataProvider(
			ComboBox.FetchItemsCallback<ITEM> fetchItems,
			SerializableToIntFunction<String> sizeCallback) {
		this.component.setDataProvider(fetchItems, sizeCallback);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setId}
	 * 
	 * @return self object
	 */
	@Override
	public FluentComboBox id(String id) {
		super.id(id);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setPrimaryStyleName(String)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentComboBox primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#addStyleNames}
	 * 
	 * @return self object
	 */
	@Override
	public FluentComboBox styles(String... styles) {
		super.styles(styles);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setCaption(String)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentComboBox caption(String caption) {
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
	public FluentComboBox captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setLocale(Locale)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentComboBox locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setIcon(Resource)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentComboBox icon(Resource icon) {
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
	public FluentComboBox themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setEnabled(boolean)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentComboBox disabled() {
		super.disabled();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setVisible(boolean)  }
	 * 
	 * @return self object
	 */
	@Override
	public FluentComboBox hidden() {
		super.hidden();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setDescription(String)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentComboBox description(String description) {
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
	public FluentComboBox descriptionText(String description) {
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
	public FluentComboBox descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setComponentError(ErrorMessage)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentComboBox componentError(ErrorMessage componentError) {
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
	public FluentComboBox heightPx(float height) {
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
	public FluentComboBox heightPercent(float height) {
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
	public FluentComboBox height(String height) {
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
	public FluentComboBox widthPx(float width) {
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
	public FluentComboBox widthPercent(float width) {
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
	public FluentComboBox width(String width) {
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
	public FluentComboBox width(float width, Sizeable.Unit unit) {
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
	public FluentComboBox height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setResponsive(boolean)}
	 * 
	 * @return self object
	 */
	@Override
	public FluentComboBox responsive() {
		super.responsive();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setSizeFull()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentComboBox sizeFull() {
		super.sizeFull();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setSizeUndefined()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentComboBox sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setWidthUndefined()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentComboBox widthUndefined() {
		super.widthUndefined();
		return this;
	}

	/**
	 * Fluent API for {@link AbstractComponent#setHeightUndefined()}
	 * 
	 * @return self object
	 */
	@Override
	public FluentComboBox heightUndefined() {
		super.heightUndefined();
		return this;
	}

}
