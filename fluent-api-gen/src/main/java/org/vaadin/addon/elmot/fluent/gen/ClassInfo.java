package org.vaadin.addon.elmot.fluent.gen;

import org.jboss.forge.roaster.Roaster;
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
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

class ClassInfo {
    private final JavaClassSource srcClass;
    private final JavaClassSource targetClass;
    private String packageName;
    private File targetDir;

    ClassInfo(JavaClassSource parsedClass, JavaClassSource targetClass, String packageName, File targetDir) {
        this.srcClass = parsedClass;
        this.targetClass = targetClass;

        this.packageName = packageName;
        this.targetDir = targetDir;
    }

    void processClass(Map<String, ClassInfo> classInfoMap) {
        targetClass.setPackage(packageName);
        targetClass.setAbstract(false);


        List<MethodSource<JavaClassSource>> methods = targetClass.getMethods();
        for (MethodSource<JavaClassSource> method : methods) {
            if (method.isAbstract()) {
                generateStandardBody(method);
            } else if (method.isStatic()) {
                processFactoryMethod(method);
            } else {
                if (method.isReturnTypeVoid() && !method.isConstructor()) {
                    method.setReturnType(targetClass);
                    method.setBody(method.getBody() + "return this;");
                }
            }
        }

        copySuperClassParts(classInfoMap);

        targetClass.removeImport(FactoryMethod.class);
        targetClass.removeImport(ForcedImport.class);
        AnnotationSource<JavaClassSource> uselessAnnotation = targetClass.getAnnotation(ForcedImport.class);
        if (uselessAnnotation != null) {
            targetClass.removeAnnotation(uselessAnnotation);
        }

        for (Import anImport : targetClass.getImports()) {
            ClassInfo classInfo = classInfoMap.get(anImport.getQualifiedName());
            if (classInfo != null) {
                anImport.setName(classInfo.packageName + "." + classInfo.targetClass.getName());
            }
        }

        //noinspection ResultOfMethodCallIgnored
        targetDir.mkdirs();
        File targetFile = new File(targetDir, targetClass.getName() + ".java");
        try (OutputStreamWriter writer = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(targetFile)), StandardCharsets.UTF_8)) {
            writer.write(Roaster.format(targetClass.toString()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


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
                                && !"setup".equals(superMetod.getName()))
                         {

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
        StringBuilder body = new StringBuilder("this.component.set");
        body.append(Character.toUpperCase(methodName.charAt(0)));
        body.append(methodName.substring(1));
        convertParametersToCall(method, body);
        body.append("return this;");
        method.setReturnType(targetClass);
        method.setBody(body.toString());
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
}
