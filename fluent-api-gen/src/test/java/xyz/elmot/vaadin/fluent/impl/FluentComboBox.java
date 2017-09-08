package xyz.elmot.vaadin.fluent.impl;

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

public class FluentComboBox<ITEM> extends FluentComponent<ComboBox<ITEM>> {

	public FluentComboBox() {
		super(new ComboBox<ITEM>());
	}

	public FluentComboBox value(ITEM value) {
		this.component.setValue(value);
		return this;
	}

	public FluentComboBox valueChangeListener(
			HasValue.ValueChangeListener<ITEM> listener) {
		this.component.addValueChangeListener(listener);
		return this;
	}

	public FluentComboBox requiredIndicatorVisible(
			boolean requiredIndicatorVisible) {
		this.component.setRequiredIndicatorVisible(requiredIndicatorVisible);
		return this;
	}

	public FluentComboBox readOnly(boolean readOnly) {
		this.component.setReadOnly(readOnly);
		return this;
	}

	public FluentComboBox items(Collection<ITEM> items) {
		this.component.setItems(items);
		return this;
	}

	public FluentComboBox items(Stream<ITEM> streamOfItems) {
		this.component.setItems(streamOfItems);
		return this;
	}

	public FluentComboBox items(ITEM... items) {
		this.component.setItems(items);
		return this;
	}

	public FluentComboBox dataProvider(ListDataProvider<ITEM> listDataProvider) {
		this.component.setDataProvider(listDataProvider);
		return this;
	}

	public FluentComboBox dataProvider(ComboBox.CaptionFilter captionFilter,
			ListDataProvider<ITEM> listDataProvider) {
		this.component.setDataProvider(captionFilter, listDataProvider);
		return this;
	}

	public FluentComboBox items(ComboBox.CaptionFilter captionFilter,
			@SuppressWarnings("unchecked") ITEM... items) {
		this.component.setItems(captionFilter, items);
		return this;
	}

	public FluentComboBox placeholder(String placeholder) {
		this.component.setPlaceholder(placeholder);
		return this;
	}

	public FluentComboBox textInputAllowed(boolean textInputAllowed) {
		this.component.setTextInputAllowed(textInputAllowed);
		return this;
	}

	public FluentComboBox pageLength(int pageLength) {
		this.component.setPageLength(pageLength);
		return this;
	}

	public FluentComboBox emptySelectionAllowed(boolean emptySelectionAllowed) {
		this.component.setEmptySelectionAllowed(emptySelectionAllowed);
		return this;
	}

	public FluentComboBox emptySelectionCaption(String caption) {
		this.component.setEmptySelectionCaption(caption);
		return this;
	}

	public FluentComboBox popupWidth(String width) {
		this.component.setPopupWidth(width);
		return this;
	}

	public FluentComboBox scrollToSelectedItem(boolean scrollToSelectedItem) {
		this.component.setScrollToSelectedItem(scrollToSelectedItem);
		return this;
	}

	public FluentComboBox itemCaptionGenerator(
			ItemCaptionGenerator<ITEM> itemCaptionGenerator) {
		this.component.setItemCaptionGenerator(itemCaptionGenerator);
		return this;
	}

	public FluentComboBox styleGenerator(StyleGenerator<ITEM> itemStyleGenerator) {
		this.component.setStyleGenerator(itemStyleGenerator);
		return this;
	}

	public FluentComboBox itemIconGenerator(
			IconGenerator<ITEM> itemIconGenerator) {
		this.component.setItemIconGenerator(itemIconGenerator);
		return this;
	}

	public FluentComboBox newItemHandler(ComboBox.NewItemHandler newItemHandler) {
		this.component.setNewItemHandler(newItemHandler);
		return this;
	}

	public <C> FluentComboBox dataProvider(DataProvider<ITEM, C> dataProvider,
			SerializableFunction<String, C> filterConverter) {
		this.component.setDataProvider(dataProvider, filterConverter);
		return this;
	}

	public FluentComboBox dataProvider(
			ComboBox.FetchItemsCallback<ITEM> fetchItems,
			SerializableToIntFunction<String> sizeCallback) {
		this.component.setDataProvider(fetchItems, sizeCallback);
		return this;
	}

	@Override
	public FluentComboBox id(String id) {
		super.id(id);
		return this;
	}

	@Override
	public FluentComboBox primaryStyle(String style) {
		super.primaryStyle(style);
		return this;
	}

	@Override
	public FluentComboBox styles(String... styles) {
		super.styles(styles);
		return this;
	}

	@Override
	public FluentComboBox caption(String caption) {
		super.caption(caption);
		return this;
	}

	@Override
	public FluentComboBox captionHtml(boolean captionAsHtml) {
		super.captionHtml(captionAsHtml);
		return this;
	}

	@Override
	public FluentComboBox locale(Locale locale) {
		super.locale(locale);
		return this;
	}

	@Override
	public FluentComboBox icon(Resource icon) {
		super.icon(icon);
		return this;
	}

	@Override
	public FluentComboBox themeIcon(CharSequence iconUrl) {
		super.themeIcon(iconUrl);
		return this;
	}

	@Override
	public FluentComboBox disabled() {
		super.disabled();
		return this;
	}

	@Override
	public FluentComboBox hidden() {
		super.hidden();
		return this;
	}

	@Override
	public FluentComboBox description(String description) {
		super.description(description);
		return this;
	}

	@Override
	public FluentComboBox descriptionText(String description) {
		super.descriptionText(description);
		return this;
	}

	@Override
	public FluentComboBox descriptionHtml(String description) {
		super.descriptionHtml(description);
		return this;
	}

	@Override
	public FluentComboBox componentError(ErrorMessage componentError) {
		super.componentError(componentError);
		return this;
	}

	@Override
	public FluentComboBox heightPx(float height) {
		super.heightPx(height);
		return this;
	}

	@Override
	public FluentComboBox heightPercent(float height) {
		super.heightPercent(height);
		return this;
	}

	@Override
	public FluentComboBox height(String height) {
		super.height(height);
		return this;
	}

	@Override
	public FluentComboBox widthPx(float width) {
		super.widthPx(width);
		return this;
	}

	@Override
	public FluentComboBox widthPercent(float width) {
		super.widthPercent(width);
		return this;
	}

	@Override
	public FluentComboBox width(String width) {
		super.width(width);
		return this;
	}

	@Override
	public FluentComboBox width(float width, Sizeable.Unit unit) {
		super.width(width, unit);
		return this;
	}

	@Override
	public FluentComboBox height(float height, Sizeable.Unit unit) {
		super.height(height, unit);
		return this;
	}

	@Override
	public FluentComboBox responsive() {
		super.responsive();
		return this;
	}

	@Override
	public FluentComboBox sizeFull() {
		super.sizeFull();
		return this;
	}

	@Override
	public FluentComboBox sizeUndefined() {
		super.sizeUndefined();
		return this;
	}

	@Override
	public FluentComboBox widthUndefined() {
		super.widthUndefined();
		return this;
	}

	@Override
	public FluentComboBox heightUndefined() {
		super.heightUndefined();
		return this;
	}

}
