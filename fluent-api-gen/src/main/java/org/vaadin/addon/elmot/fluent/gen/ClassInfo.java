package org.vaadin.addon.elmot.fluent.gen;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.JavaDoc;
import org.jboss.forge.roaster.model.JavaDocCapable;
import org.jboss.forge.roaster.model.Method;
import org.jboss.forge.roaster.model.source.AnnotationSource;
import org.jboss.forge.roaster.model.source.Import;
import org.jboss.forge.roaster.model.source.JavaClassSource;
import org.jboss.forge.roaster.model.source.MethodSource;
import org.jboss.forge.roaster.model.source.ParameterSource;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

class ClassInfo {
    private static final String CLASS_JAVADOC =
            "Fluent API envelope for Vaadin {@link %s}.\n" +
                    "@see org.vaadin.addon.elmot.fluent.Fluent";
    private static final String STD_METHOD_JAVADOC =
            "Fluent API for {@link %s#%s}\n\n" +
                    "@return self object";
    private static final String CONSTRUCTOR_JAVADOC =
            "Creates new Fluent API envelope for {@link %s}\n\n" +
                    "@see org.vaadin.addon.elmot.fluent.Fluent";
    private final JavaClassSource srcClass;
    private final JavaClassSource targetClass;
    private String packageName;
    private File targetDir;
    private String baseComponentClass;

    ClassInfo(JavaClassSource parsedClass, JavaClassSource targetClass, String packageName, File targetDir) {
        this.srcClass = parsedClass;
        this.targetClass = targetClass;

        this.packageName = packageName;
        this.targetDir = targetDir;
    }

    void processClass(Map<String, ClassInfo> classInfoMap) {
        baseComponentClass = getBaseComponentClass();
        if (baseComponentClass != null && isJavadocEmpty(targetClass)) {
            String javadoc = String.format(CLASS_JAVADOC, baseComponentClass);
            targetClass.getJavaDoc().setFullText(javadoc);
        }
        targetClass.setPackage(packageName);
        targetClass.setAbstract(false);


        List<MethodSource<JavaClassSource>> methods = targetClass.getMethods();
        for (MethodSource<JavaClassSource> method : methods) {
            if (method.isAbstract()) {
                generateStandardBody(method);
            } else if (method.isStatic()) {
                processFactoryMethod(method);
            } else {
                if (method.isConstructor()) {
                    if (method.getParameters().isEmpty() && isJavadocEmpty(method)) {
                        method.getJavaDoc().setFullText(String.format(CONSTRUCTOR_JAVADOC, baseComponentClass));
                    }
                } else if (method.isReturnTypeVoid()) {
                    method.setReturnType(targetClass);
                    method.setBody(method.getBody() + "return this;");
                }
            }
        }

        copySuperClassParts(classInfoMap);

        targetClass.removeImport(FactoryMethod.class);
        removeAnnotation(ForcedImport.class);
        removeAnnotation(BasedOnVaadinComponent.class);

        for (Import anImport : targetClass.getImports()) {
            ClassInfo classInfo = classInfoMap.get(anImport.getQualifiedName());
            if (classInfo != null) {
                anImport.setName(classInfo.packageName + "." + classInfo.targetClass.getName());
            }
        }
    }

    void writeClass() {
        targetDir.mkdirs();
        File targetFile = new File(targetDir, targetClass.getName() + ".java");
        try (OutputStreamWriter writer = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(targetFile)), StandardCharsets.UTF_8)) {
            writer.write(Roaster.format(targetClass.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void removeAnnotation(Class<? extends Annotation> annotationClass) {
        AnnotationSource<JavaClassSource> uselessAnnotation = targetClass.getAnnotation(annotationClass);
        if (uselessAnnotation != null) {
            targetClass.removeAnnotation(uselessAnnotation);
        }
        targetClass.removeImport(annotationClass);
    }

    private String getBaseComponentClass() {
        AnnotationSource<JavaClassSource> annotation = srcClass.getAnnotation(BasedOnVaadinComponent.class);
        return annotation == null ? null : annotation.getStringValue();
    }

    private void copySuperClassParts(Map<String, ClassInfo> classInfoMap) {
        for (String parent = strippedSuperType(srcClass); classInfoMap.containsKey(parent); ) {
            ClassInfo superClass = classInfoMap.get(parent);
            for (Import anImport : superClass.srcClass.getImports()) {
                if (anImport.getQualifiedName().startsWith("com.vaadin."))
                    targetClass.addImport(anImport);
            }
            List<MethodSource<JavaClassSource>> superMetods = superClass.srcClass.getMethods();
            for (MethodSource<JavaClassSource> superMetod : superMetods) {
                if (!superMetod.isStatic() && !superMetod.isConstructor()
                        && (superClass.srcClass.getName().equals(superMetod.getReturnType().getName()) ||
                        superMetod.isReturnTypeVoid())
                        && !"setup".equals(superMetod.getName())) {

                    MethodSource<JavaClassSource> overriddenMethod = targetClass.addMethod(superMetod);
                    if (!overriddenMethod.hasAnnotation(Override.class)) {
                        overriddenMethod.addAnnotation(Override.class);
                    }
                    overriddenMethod.setReturnType(targetClass);
                    StringBuilder body = new StringBuilder("super.").append(overriddenMethod.getName());
                    convertParametersToCall(superMetod, body);
                    body.append("return this;");
                    overriddenMethod.setBody(body.toString());
                }
            }

            parent = strippedSuperType(superClass.srcClass);
        }
    }

    private String strippedSuperType(JavaClassSource aClass) {
        return new StringTokenizer(aClass.getSuperType(), "<").nextToken();
    }

    private void generateStandardBody(MethodSource<JavaClassSource> method) {
        method.setAbstract(false);
        String methodName = method.getName();
        StringBuilder calleeMmethodName = new StringBuilder("set")
                .append(Character.toUpperCase(methodName.charAt(0)))
                .append(methodName.substring(1));

        StringBuilder body = new StringBuilder("this.component.")
                .append(calleeMmethodName);
        convertParametersToCall(method, body);
        body.append("return this;");
        method.setReturnType(targetClass);
        method.setBody(body.toString());
        if (isJavadocEmpty(method)) {
            String javadoc = String.format(STD_METHOD_JAVADOC, baseComponentClass, calleeMmethodName);
            method.getJavaDoc().setFullText(javadoc);
        }
    }

    private void processFactoryMethod(MethodSource<JavaClassSource> method) {
        AnnotationSource<JavaClassSource> methodAnnotation = method.getAnnotation(FactoryMethod.class);
        if (methodAnnotation != null) {
            method.removeAnnotation(methodAnnotation);
            StringBuilder body = new StringBuilder("return new ").append(method.getReturnType().getName());
            convertParametersToCall(method, body);
            method.setBody(body.toString());
        }
    }

    private void convertParametersToCall(MethodSource<JavaClassSource> method, StringBuilder body) {
        body.append('(');
        List<ParameterSource<JavaClassSource>> parameters = method.getParameters();
        for (int i = 0; i < parameters.size(); i++) {
            ParameterSource<JavaClassSource> parameter = parameters.get(i);
            body.append(parameter.getName());
            if (i != parameters.size() - 1) {
                body.append(",");
            }
            if (targetClass.requiresImport(parameter.getType().getQualifiedName())
                    && Character.isLowerCase(parameter.getType().getQualifiedName().charAt(0))/* Workaround!!! classes of type Sizeable.Unit are not well-supported*/
                    ) {
                targetClass.addImport(parameter.getType().getQualifiedName());
            }
        }
        body.append(");");
    }

    @Override
    public String toString() {
        return srcClass == null ? "<none>" : srcClass.getName();
    }

    void checkJavadocs() {
        if (isJavadocEmpty(targetClass)) {
            System.err.printf("Missing claas-level javadoc: %s\n", targetClass.getName());
        }
        targetClass.getMethods().stream().filter(Method::isPublic).filter(this::isJavadocEmpty).forEach(
                methodSource -> System.err.printf("Missing javadoc: %s.%s\n", targetClass.getName(), methodSource.getName()));

    }

    private boolean isJavadocEmpty(JavaDocCapable documentableable) {
        JavaDoc<?> javaDoc = documentableable.getJavaDoc();
        return javaDoc == null || javaDoc.getText().trim().isEmpty();
    }
}
