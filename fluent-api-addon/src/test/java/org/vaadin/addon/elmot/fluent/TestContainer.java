package org.vaadin.addon.elmot.fluent;

import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;
import org.junit.Test;
import org.vaadin.addon.elmot.fluent.impl.FluentOrderedLayout;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static junit.framework.Assert.assertEquals;

@SuppressWarnings("JavaDoc")
public class TestContainer {

    @Test
    public void testAdd() {
        FluentOrderedLayout<VerticalLayout> vLayout = Fluent.vLayout();
        vLayout.addAll(new Button(), new Label())
                .addAll(Stream.of(new TextArea(), new Panel()))
                .add(Fluent.dateField(), 0.1f)
                .add(Fluent.textField(), Alignment.BOTTOM_LEFT)
                .add(Fluent.textArea(), Alignment.TOP_CENTER, 0.2f)
                .add(Fluent.dateField().get(), Alignment.TOP_RIGHT)
                .add(Fluent.inlineDateTimeField(), Alignment. MIDDLE_LEFT, 0.3)
                .add(Fluent.inlineDateField().get(), 0.4f)
                .addAll(Stream.of(Fluent.checkBox().get(), Fluent.vLayout().get()));
        VerticalLayout toTest = vLayout.get();

        List<Component> addedComponents = IntStream.range(0, toTest.getComponentCount())
                .mapToObj(toTest::getComponent)
                .collect(Collectors.toList());

        String addedClasses = addedComponents.stream().map(Object::getClass).map(Class::getSimpleName).collect(Collectors.joining(","));

        assertEquals("Button,Label,TextArea,Panel,DateField,TextField,TextArea,DateField,InlineDateTimeField,InlineDateField,CheckBox,VerticalLayout", addedClasses);

        checkAlignment(Alignment.TOP_LEFT, toTest, 4);
        checkAlignment(Alignment.BOTTOM_LEFT, toTest, 5);
        checkAlignment(Alignment.TOP_CENTER, toTest, 6);
        checkAlignment(Alignment.TOP_RIGHT, toTest, 7);
        checkAlignment(Alignment.MIDDLE_LEFT, toTest, 8);

        checkRatio(0,toTest, 3);
        checkRatio(0.1,toTest, 4);
        checkRatio(0.2,toTest, 6);
        checkRatio(0.3,toTest, 8);
        checkRatio(0.4,toTest, 9);
    }

    private void checkAlignment(Alignment expectedAlignment, AbstractOrderedLayout container, int index) {
        assertEquals(container.getComponentAlignment(container.getComponent(index)), expectedAlignment);
    }
    private void checkRatio(double expectedRatio, AbstractOrderedLayout container, int index) {
        assertEquals(container.getExpandRatio(container.getComponent(index)), expectedRatio,0.0001);
    }
}
