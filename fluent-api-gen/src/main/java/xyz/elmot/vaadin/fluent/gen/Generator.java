package xyz.elmot.vaadin.fluent.gen;

import org.jboss.forge.roaster.Roaster;
import org.jboss.forge.roaster.model.source.JavaClassSource;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Generator {

    private static final String TARGET_PACKAGE = "xyz.elmot.vaadin.fluent";
    private static final String SRC_PATH = "src/main/java/xyz/elmot/vaadin/fluent/templates";
    private static final String TARGET_PATH = "src/test/java";
    private static Map<String, ClassInfo> classes = new HashMap<>();

    public static void main(String[] args) throws IOException {
        String targetPackage = TARGET_PACKAGE;
        String srcPath = SRC_PATH;
        String targetPath = TARGET_PATH;
        if (args.length % 2 == 1) {
            printHelp();
            System.exit(1);
        }
        for (int i = 0; i < args.length; i += 2) {
            String arg = args[i];
            switch (arg) {
                case "--srcPath":
                    srcPath = args[i + 1];
                    break;
                case "--targetPath":
                    targetPath = args[i + 1];
                    break;
                case "--targetPackage":
                    targetPackage = args[i + 1];
                    break;
                default:
                    printHelp();
                    System.exit(1);
            }
        }
        File destFolder = new File(targetPath);
        File root = new File(srcPath);
        System.out.println("srcPath = " + root.getAbsolutePath());
        System.out.println("targetPath = " + destFolder.getAbsolutePath());
        System.out.println("targetPackage = " + targetPackage);
        //noinspection ResultOfMethodCallIgnored
        destFolder.mkdirs();
        runFolder(root, targetPackage, new File(destFolder, targetPackage.replace('.', File.separatorChar)));
        classes.values().forEach(classInfo -> classInfo.processClass(classes));

    }

    private static void printHelp() {
        System.out.println("java %s [--srcPath <source_folder>] [--targetPath <target_folder>] [--targetPackage <target package name>]");

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
    }

    private static void collectFiles(File file, String packageName, File targetDir) throws IOException {
        JavaClassSource parsed = Roaster.parse(JavaClassSource.class, file);
        JavaClassSource target = Roaster.parse(JavaClassSource.class, file);
        classes.put(parsed.getQualifiedName(), new ClassInfo(parsed, target, packageName, targetDir));
    }


}
