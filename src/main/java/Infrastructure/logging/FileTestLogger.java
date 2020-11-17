package Infrastructure.logging;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileTestLogger implements AbstractLogger {

    private Object FileWriter;

    @Override
    public void log(String operation) {
        try {
            FileWriter fileWriter = new FileWriter(new File("log.txt"), true);
            fileWriter.write(operation + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void atStart() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(new File("log.txt"), true);
            fileWriter.write(String.format(WELCOME_MESSAGE, LocalDateTime.now()) + "\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void atFinish() {
        try {
            FileWriter fileWriter = new FileWriter(new File("log.txt"), true);
            fileWriter.write(String.format(FINAL_MESSAGE, LocalDateTime.now()+"\n"));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


