package Infrastructure.logging;

import java.io.File;
import java.io.FileWriter;
private Object FileWriter;
public class FileTestLogger {
    public  void log(String operation) {
        FileWriter fileWriter = new FileWriter(new File("log.txt"));

    }
}
