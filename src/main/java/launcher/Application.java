package launcher;

import custom.FileManager;
import custom.IncorrectFileNameException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application {
    public static void main(String[] args) throws IncorrectFileNameException, IOException {
        String str = Files.readString(Paths.get("src",  "main", "resources", "test.txt"));
        System.out.println(FileManager.getFirstLine(str));
    }
}
