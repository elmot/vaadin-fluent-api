# Elmot's Fluent API Add-on for Vaadin 8

Yet another [Fluent API](https://en.wikipedia.org/wiki/Fluent_interface) addon 
for [Vaadin 8](https://vaadin.com/framework). Uses approach without extending 
existing classes but by encapsulating those to outer classes. As a result, the 
API looks a bit like [Builder](https://en.wikipedia.org/wiki/Builder_pattern) pattern. 
Note ```get()``` method in the example.  

## Getting started

```java
Label label = Fluent.label()
                        .value("Styled label")
                        .styles(ValoTheme.LABEL_HUGE, ValoTheme.LABEL_COLORED)
                        .get();
```
I do not see a point in covering all the Vaadin components with fluents but only most 
used components without complicated settings. Nevertheless, if you need to "fluent" 
some custom or complicated component, you can do that like here: 
```java
Fluent.${new Grid()).setup(grid -> grid.setBeanType(YourBean.class)).id("grid");}}
```
If that is not enough for you, feel free to [contribute](#contributions).
More examples: 
 * [DemoUI.java](fluent-api-demo/src/main/java/org/vaadin/addon/elmot/fluent/demo/DemoUI.java)
 * [TestElements.java](fluent-api-gen/src/test/java/org/vaadin/addon/elmot/fluenttest/TestElements.java)
 * [TestContainer.java](fluent-api-addon/src/test/java/org/vaadin/addon/elmot/fluent/TestContainer.java)



## Download release

Official releases of this add-on are available at Vaadin Directory. 

**TODO** finish this

For Maven instructions, download and reviews, go to http://vaadin.com/addon/TODO

## Building and running demo
```bash
git clone https://github.com/elmot/vaadin-fluent-api
mvn clean install
cd demo
mvn jetty:run
```

To see the demo, navigate to http://localhost:8080/

## Release notes

### Version 0.1
Covered: 
* Button
* CheckBox
* ComboBox
* Component
* DateField
* DateTimeField
* Image
* InlineDateField
* InlineDateTimeField
* Label
* Link
* HorizontalLayout
* VerticalLayout
* Panel
* TextArea
* TextField

## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports 
and feature requests are appreciated. 

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as
 such. Process for contributing is the following:
- Fork this project
- Create an issue to this project about the contribution (bug or feature) if 
there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum 
amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## Developer Guide
Note, most of the code is automatically generated from java class templates. 
Do not try to manually change the result classes. all of those changes will be lost during build process.
The ``fluent-api-gen`` module contains both code generator code and java template classes:  
* [The code generator](fluent-api-gen/src/main/java/org/vaadin/addon/elmot/fluent/gen/Generator.java)
* [The templates](fluent-api-gen/src/main/java/org/vaadin/addon/elmot/fluent/templates/impl) 

Method return types, some annotations, trivial methods implementations, overriden 
methods are added automatically by the code generator.

## License & Author

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

The API is written by Ilia Motornyi aka Elmot, me@elmot.xyz

## API
**TODO** finish this
MyComponent JavaDoc is available online at <...>
