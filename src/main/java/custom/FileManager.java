package custom;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {
    public static String getFirstLine(String fileName) throws IncorrectFileNameException {
        try (Scanner file = new Scanner(new File(fileName))) {
            if (file.hasNextLine()) {
                return file.nextLine();
            } else {
                throw new IllegalArgumentException("Non readable file");
            }
        } catch (FileNotFoundException err) {
            throw new IncorrectFileNameException("Incorrect filename : " + fileName, err);
//            throw new RuntimeException("Message");
            // Logging etc
        } catch (IllegalArgumentException err) {
            if (!containsExtension(fileName)) {
                throw new IncorrectFileExtensionException("Filename does not contain extension : " + fileName, err);
            }
            // Other error cases and logging
        }
        return "Default First Line";
    }

    private static boolean containsExtension(String fileName) {
        return fileName.contains(".txt") || fileName.contains(".doc");
    }

    private static boolean isCorrectFileName(String fileName) {
        return !fileName.equals("wrongFileName.txt");
    }
}
