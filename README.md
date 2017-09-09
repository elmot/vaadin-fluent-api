# Elmot's Fluent API Add-on for Vaadin 8

Yet another Fluent API addon for Vaadin 8. Uses approach with 

## Download release

Official releases of this add-on are available at Vaadin Directory. For Maven instructions, download and reviews, go to http://vaadin.com/addon/TODO

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
TODO
- ...
- ...

## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are appreciated. 

## Contributions
TODO

Contributions are welcome, but there are no guarantees that they are accepted as such. Process for contributing is the following:
- Fork this project
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## License & Author

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

The API is written by Ilia Motornyi aka Elmot, me@elmot.xyz

# Developer Guide
TODO

## Getting started

```java
Label label = Fluent.label()
                        .value("Styled label")
                        .styles(ValoTheme.LABEL_HUGE, ValoTheme.LABEL_COLORED)
                        .get();
```
More examples: 
 * [DemoUI.java](src/main/java/xyz/elmot/vaadin/demo/DemoUI.java)
 * [TestElements.java](org/vaadin/addon/elmot/fluenttest/TestElements.java)
 * [TestContainer.java](org/vaadin/addon/elmot/fluent/TestContainer.java)

## API
TODO
MyComponent JavaDoc is available online at <...>
