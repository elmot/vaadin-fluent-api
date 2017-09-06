package xyz.elmot.vaadin.fluent;

import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import xyz.elmot.vaadin.fluent.impl.FluentCheckBox;
import xyz.elmot.vaadin.fluent.impl.FluentComponent;
import xyz.elmot.vaadin.fluent.impl.FluentDateField;
import xyz.elmot.vaadin.fluent.impl.FluentDateTimeField;
import xyz.elmot.vaadin.fluent.impl.FluentImage;
import xyz.elmot.vaadin.fluent.impl.FluentInlineDateField;
import xyz.elmot.vaadin.fluent.impl.FluentInlineDateTimeField;
import xyz.elmot.vaadin.fluent.impl.FluentLabel;
import xyz.elmot.vaadin.fluent.impl.FluentLink;
import xyz.elmot.vaadin.fluent.impl.FluentOrderedLayout;
import xyz.elmot.vaadin.fluent.impl.FluentPanel;
import xyz.elmot.vaadin.fluent.impl.FluentTextArea;
import xyz.elmot.vaadin.fluent.impl.FluentTextField;

import java.util.function.Supplier;

public class Fluent {

	private Fluent() {
	}

	public static FluentLabel label() {
		return new FluentLabel();
	}
	public static FluentPanel panel() {
		return new FluentPanel();
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
