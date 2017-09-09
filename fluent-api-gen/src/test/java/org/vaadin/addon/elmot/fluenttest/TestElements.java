package org.vaadin.addon.elmot.fluenttest;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.server.Sizeable;
import com.vaadin.server.SystemError;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Panel;
import org.junit.Test;
import org.vaadin.addon.elmot.fluent.Fluent;

import java.time.LocalDate;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@SuppressWarnings("JavaDoc")
public class TestElements {
    @Test
    public void testPanel() {
        Panel panel = Fluent.panel()
                .caption("test")
                .heightPx(14.6f)
                .widthPercent(24.9f)
                .get();
        assertEquals(panel.getHeight(), 14.6, .1);
        assertEquals(panel.getHeightUnits(), Sizeable.Unit.PIXELS);
        assertEquals(panel.getWidth(), 24.9, 0.1);
        assertEquals(panel.getWidthUnits(), Sizeable.Unit.PERCENTAGE);
        assertEquals("test", panel.getCaption());
    }

    @Test
    public void testSetup() {
        Fluent.$(Grid::new).setup(grid -> grid.setHeaderVisible(true));
    }

    @Test
    public void testDateField() {
        DateField dateField = Fluent.dateField()
                .value(LocalDate.of(2017, 11, 23))
                .requiredIndicatorVisible(true).readOnly(true)
                .placeholder("placeholder").textFieldEnabled(false).assistiveText("description").id("#id")
                .primaryStyle("pr-style").styles("style1", "style2").captionHtml(true)
                .locale(Locale.CHINA)
                .icon(VaadinIcons.BACKWARDS).disabled().hidden()
                .descriptionText("#description").componentError(new SystemError("someError"))
                .responsive().sizeFull().get();

        assertTrue(dateField.isRequiredIndicatorVisible());
        assertFalse(dateField.isTextFieldEnabled());
        assertEquals(dateField.getPlaceholder(), "placeholder");
        assertEquals(dateField.getId(), "#id");
        assertEquals(dateField.getPrimaryStyleName(), "pr-style");
        assertTrue(dateField.isCaptionAsHtml());
        assertEquals(dateField.getAssistiveText(), "description");
        assertEquals(dateField.getLocale(), Locale.CHINA);
        assertEquals(dateField.getIcon(), VaadinIcons.BACKWARDS);
        assertEquals(dateField.getComponentError().getFormattedHtmlMessage(), "<h2>someError</h2>");
        assertEquals(dateField.getDescription(), "#description");
        assertEquals(dateField.getValue(), LocalDate.of(2017, 11, 23));
        assertEquals(dateField.getHeight(), 100f, 0);
        assertEquals(dateField.getHeightUnits(), Sizeable.Unit.PERCENTAGE);
        assertEquals(dateField.getWidth(), 100f, 0);
        assertEquals(dateField.getWidthUnits(), Sizeable.Unit.PERCENTAGE);

        assertFalse(dateField.isEnabled());
        assertFalse(dateField.isVisible());
        assertTrue(dateField.isResponsive());
        assertTrue(dateField.isResponsive());

        assertEquals(dateField.getStyleName(), "style1 style2");

    }
}
