package org.vaadin.addon.elmot.fluent.templates;

import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.addon.elmot.fluent.gen.FactoryMethod;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentCheckBox;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentComboBox;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentComponent;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentDateField;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentDateTimeField;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentImage;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentInlineDateField;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentInlineDateTimeField;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentLabel;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentLink;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentOrderedLayout;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentPanel;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentTextArea;
import org.vaadin.addon.elmot.fluent.templates.impl.FluentTextField;

import java.util.function.Supplier;

/**
 * Factory class for Vaadin Fluent API.
 * <br>Usage example:
 * {@code ui.setContent(Fluent.label().value("Text").styles(ValoTheme.LABEL_HUGE).get());}
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class Fluent {

    private Fluent() {
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.Label}
     *
     * @return new fluent envelope
     */
    @FactoryMethod
    public static FluentLabel label() {
        return null;
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.Panel}
     *
     * @return new fluent envelope
     */
    @FactoryMethod
    public static FluentPanel panel() {
        return null;
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.ComboBox}
     *
     * @return new fluent envelope
     */
    @FactoryMethod
    public static FluentComboBox comboBox() {
        return null;
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.Panel}
     *
     * @param component to be placed inside the panel
     * @return new fluent envelope
     */
    @FactoryMethod
    public static FluentPanel panel(Component component) {
        return null;
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.Panel}
     *
     * @param componentSupplier generator for the component to be placed inside the panel
     * @return new fluent envelope
     */
    public static FluentPanel panel(Supplier<? extends Component> componentSupplier) {
        return panel(componentSupplier.get());
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.Link}
     *
     * @return new fluent envelope
     */
    @FactoryMethod
    public static FluentLink link() {
        return null;
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.CheckBox}
     *
     * @return new fluent envelope
     */
    @FactoryMethod
    public static FluentCheckBox checkBox() {
        return null;
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.TextField}
     *
     * @return new fluent envelope
     */
    @FactoryMethod
    public static FluentTextField textField() {
        return null;
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.TextArea}
     *
     * @return new fluent envelope
     */
    @FactoryMethod
    public static FluentTextArea textArea() {
        return null;
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.Image}
     *
     * @return new fluent envelope
     */
    @FactoryMethod
    public static FluentImage image() {
        return null;
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.DateTimeField}
     *
     * @return new fluent envelope
     */
    @FactoryMethod
    public static FluentDateTimeField dateTimeField() {
        return null;
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.DateField}
     *
     * @return new fluent envelope
     */
    @FactoryMethod
    public static FluentDateField dateField() {
        return null;
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.InlineDateTimeField}
     *
     * @return new fluent envelope
     */
    @FactoryMethod
    public static FluentInlineDateTimeField inlineDateTimeField() {
        return null;
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.InlineDateField}
     *
     * @return new fluent envelope
     */
    @FactoryMethod
    public static FluentInlineDateField inlineDateField() {
        return null;
    }

    /**
     * Creates a new Fluent envelope for the given
     * <br>
     * Example:<br>
     * {@code Fluent.use{new Grid()).setup(grid -> grid.setbeanType(Bean.class)).id("grid");}}     *
     *
     * @param component component to be used
     * @see Fluent
     */
    public static <T extends AbstractComponent> FluentComponent<T> use(final T component) {
        return new FluentComponent<>(component);
    }

    /**
     * Creates a new Fluent envelope for the component generated by the supplier
     * <br>
     * Example:<br>
     * {@code Fluent.${Grid::new).setup(grid -> grid.setbeanType(Bean.class)).id("grid");}}     *
     *
     * @param supplier component creator to be used
     * @see Fluent
     */
    public static <T extends AbstractComponent> FluentComponent<T> $(final Supplier<T> supplier) {
        return new FluentComponent<>(supplier.get());
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.VerticalLayout}
     *
     * @return new fluent envelope
     */
    public static FluentOrderedLayout<VerticalLayout> vLayout() {
        return new FluentOrderedLayout<>(new VerticalLayout());
    }

    /**
     * Creates new Fluent Object for {@link com.vaadin.ui.HorizontalLayout}
     *
     * @return new fluent envelope
     */
    public static FluentOrderedLayout<HorizontalLayout> hLayout() {
        return new FluentOrderedLayout<>(new HorizontalLayout());
    }

}
