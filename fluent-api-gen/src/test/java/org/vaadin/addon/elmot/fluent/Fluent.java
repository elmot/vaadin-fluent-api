package org.vaadin.addon.elmot.fluent;

import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.addon.elmot.fluent.impl.FluentInlineDateTimeField;
import org.vaadin.addon.elmot.fluent.impl.FluentComponent;
import org.vaadin.addon.elmot.fluent.impl.FluentLabel;
import org.vaadin.addon.elmot.fluent.impl.FluentOrderedLayout;
import org.vaadin.addon.elmot.fluent.impl.FluentPanel;
import org.vaadin.addon.elmot.fluent.impl.FluentTextArea;
import org.vaadin.addon.elmot.fluent.impl.FluentCheckBox;
import org.vaadin.addon.elmot.fluent.impl.FluentComboBox;
import org.vaadin.addon.elmot.fluent.impl.FluentDateField;
import org.vaadin.addon.elmot.fluent.impl.FluentDateTimeField;
import org.vaadin.addon.elmot.fluent.impl.FluentImage;
import org.vaadin.addon.elmot.fluent.impl.FluentInlineDateField;
import org.vaadin.addon.elmot.fluent.impl.FluentLink;
import org.vaadin.addon.elmot.fluent.impl.FluentTextField;

import java.util.function.Supplier;

@SuppressWarnings({"unused", "WeakerAccess"})
public class Fluent {

	private Fluent() {
	}

	public static FluentLabel label() {
		return new FluentLabel();
	}
	public static FluentPanel panel() {
		return new FluentPanel();
	}

	public static FluentComboBox comboBox() {
		return new FluentComboBox();
	}

	public static FluentPanel panel(Component component) {
		return new FluentPanel(component);
	}

	public static FluentPanel panel(
			Supplier<? extends Component> componentSupplier) {
		return panel(componentSupplier.get());
	}

	public static FluentLink link() {
		return new FluentLink();
	}

	public static FluentCheckBox checkBox() {
		return new FluentCheckBox();
	}

	public static FluentTextField textField() {
		return new FluentTextField();
	}

	public static FluentTextArea textArea() {
		return new FluentTextArea();
	}

	public static FluentImage image() {
		return new FluentImage();
	}

	public static FluentDateTimeField dateTimeField() {
		return new FluentDateTimeField();
	}

	public static FluentDateField dateField() {
		return new FluentDateField();
	}

	public static FluentInlineDateTimeField inlineDateTimeField() {
		return new FluentInlineDateTimeField();
	}

	public static FluentInlineDateField inlineDateField() {
		return new FluentInlineDateField();
	}

	public static <T extends AbstractComponent> FluentComponent<T> use(
			final T component) {
		return new FluentComponent<>(component);
	}

	public static <T extends AbstractComponent> FluentComponent<T> $(
			final Supplier<T> supplier) {
		return new FluentComponent<>(supplier.get());
	}

	public static FluentOrderedLayout<VerticalLayout> vLayout() {
		return new FluentOrderedLayout<>(new VerticalLayout());
	}

	public static FluentOrderedLayout<HorizontalLayout> hLayout() {
		return new FluentOrderedLayout<>(new HorizontalLayout());
	}

}
