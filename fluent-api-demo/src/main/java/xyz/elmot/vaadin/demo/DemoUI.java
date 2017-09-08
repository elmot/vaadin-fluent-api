package xyz.elmot.vaadin.demo;

import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;
import xyz.elmot.vaadin.fluent.Fluent;

import javax.servlet.annotation.WebServlet;

@Title("Vaadin Fluent Api Add-on Demo")
@SuppressWarnings("serial")
public class DemoUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        setContent(
                Fluent.vLayout().addAll(
                        Fluent.label()
                                .value("Styled label")
                                .styles(ValoTheme.LABEL_HUGE, ValoTheme.LABEL_COLORED)
                                .get(),
                        Fluent.textArea()
                                .readOnly(true)
                                .value("Some text")
                                .get()
                ).get()
        );
    }

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = DemoUI.class)
    public static class Servlet extends VaadinServlet {
    }
}
