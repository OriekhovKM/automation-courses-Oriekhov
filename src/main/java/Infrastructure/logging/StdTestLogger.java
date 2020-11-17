package Infrastructure.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StdTestLogger implements AbstractLogger {

    @Override
    public void log(String operation) {
        System.out.println(getEntry(operation));
    }

    public static int counter = 0;

    private String getEntry(String operation) {
        counter++;
        Date curDate = new Date();
        curDate.getTime();
        String formatedDate = new SimpleDateFormat("HH:mm:ss.SSS").format(curDate.getTime());
        return counter + ") " + formatedDate + "[" + Thread.currentThread().getName() + "] " + operation;
    }

    public void atFinish() {

    }

    public void atStart() {

    }
}