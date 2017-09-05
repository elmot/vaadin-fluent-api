package xyz.elmot.vaadin.fluent.gen;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Generator {

    private static final String TARGET_PACKAGE = "xyz.elmot.vaadin.fluent.impl";
    private static final File DEST_FOLDER = new File("src/main/java");
    private static Map<String, ClassInfo> classes = new HashMap<>();

    public static void main(String[] args) throws IOException {
        File root = new File("src/main/java/xyz/elmot/vaadin/fluent/templates");
        //noinspection ResultOfMethodCallIgnored
        DEST_FOLDER.mkdirs();
        runFolder(root, TARGET_PACKAGE, new File(DEST_FOLDER, TARGET_PACKAGE.replace('.', File.separatorChar)));
    }

    private static void runFolder(File root, String basePackage, File targetDir) throws IOException {
        File[] files = root.listFiles();
        assert files != null;
        for (File file : files) {
            if (file.isDirectory()) {
                String name = file.getName();
                runFolder(file, basePackage + "." + name, new File(targetDir, name));
            } else {
                collectFiles(file, basePackage, targetDir);
            }
        }
        classes.values().forEach(classInfo->classInfo.processClass(classes));
    }

    private static void collectFiles(File file, String packageName, File targetDir) throws IOException {
        JavaClassSource parsed = Roaster.parse(JavaClassSource.class, file);
        classes.put(parsed.getQualifiedName(), new ClassInfo(parsed, packageName, targetDir));
    }


}
