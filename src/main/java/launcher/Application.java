package launcher;

import custom.FileManager;
import custom.IncorrectFileNameException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Paths;



public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.error("Some error");

        String str = Paths.get("src",  "main", "resources", "tes1t.txt").toString();
        try {
            System.out.println(FileManager.getFirstLine(str));
            System.out.println("Some data");
        } catch (IncorrectFileNameException e) {
            logger.warn(e.getMessage());
//            logger.warn(Arrays.toString(e.getStackTrace()));
            e.printStackTrace();
        }
        finally {
            System.out.println("Hello World");
        }
    }
}
