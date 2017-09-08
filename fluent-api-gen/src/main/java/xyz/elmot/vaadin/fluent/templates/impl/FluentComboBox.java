package xyz.elmot.vaadin.fluent.templates.impl;

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

public abstract class FluentComboBox<ITEM> extends FluentComponent<ComboBox<ITEM>> {

    public FluentComboBox() {
        super(new ComboBox<ITEM>());
    }

    public abstract void value(ITEM value);

    public void valueChangeListener(HasValue.ValueChangeListener<ITEM> listener) {
        this.component.addValueChangeListener(listener);
    }

    public abstract void requiredIndicatorVisible(boolean requiredIndicatorVisible);

    public abstract void readOnly(boolean readOnly);

    public abstract void items(Collection<ITEM> items);

    public abstract void items(Stream<ITEM> streamOfItems);

    public abstract void items(ITEM... items);

    public abstract void dataProvider(ListDataProvider<ITEM> listDataProvider);

    public abstract void dataProvider(ComboBox.CaptionFilter captionFilter, ListDataProvider<ITEM> listDataProvider);

    public abstract void items(ComboBox.CaptionFilter captionFilter, @SuppressWarnings("unchecked") ITEM... items);

    public abstract void placeholder(String placeholder);

    public abstract void textInputAllowed(boolean textInputAllowed);

    public abstract void pageLength(int pageLength);

    public abstract void emptySelectionAllowed(boolean emptySelectionAllowed);

    public abstract void emptySelectionCaption(String caption);

    public abstract void popupWidth(String width);

    public abstract void scrollToSelectedItem(boolean scrollToSelectedItem);

    public abstract void itemCaptionGenerator(ItemCaptionGenerator<ITEM> itemCaptionGenerator);

    public abstract void styleGenerator(StyleGenerator<ITEM> itemStyleGenerator);

    public abstract void itemIconGenerator(IconGenerator<ITEM> itemIconGenerator);

    public abstract void newItemHandler(ComboBox.NewItemHandler newItemHandler);

    public abstract <C> void dataProvider(DataProvider<ITEM, C> dataProvider, SerializableFunction<String, C> filterConverter);

    public abstract void dataProvider(ComboBox.FetchItemsCallback<ITEM> fetchItems, SerializableToIntFunction<String> sizeCallback);


}
