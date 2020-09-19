package Infrastructure;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestLogger {
    public static int counter = 0;

    public  void log(String operation) {
        counter++;
        Date curDate = new Date();
        curDate.getTime();
        String formatedDate = new SimpleDateFormat("HH:mm:ss.SSS").format(curDate.getTime());
        System.out.println(counter + ") " + formatedDate + "[" + Thread.currentThread().getName() + "] " + operation);
      //  return counter + ") " + formatedDate + "[" + Thread.currentThread().getName() + "] " + operation;
    }
}
