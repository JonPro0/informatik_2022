package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class FileLoader {
    public static String[] load(String filename) {
        return load(filename,"");
    }

    public static String[] load(String filename, String path) {
        String input = null;

        File file = new File("resources/" + path + filename);

        if (!file.exists()) {
            System.err.println("ERROR! file '" + filename + "' not found");
            return null;
        }

        try {
            input = new String(Files.readAllBytes(Path.of("resources/" + path + filename)));
        } catch (IOException e) {
            System.err.println("ERROR! failed to load file '" + filename + "'");
            return null;
        }

        return Objects.requireNonNull(input).split("\n", Integer.MAX_VALUE);
    }
}
