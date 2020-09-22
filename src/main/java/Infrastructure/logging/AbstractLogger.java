package Infrastructure.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbstractLogger {

   public abstract void log(String msg);

   public static int counter = 0;

   public String getEntry (String operation) {
      counter++;
      Date curDate = new Date();
      curDate.getTime();
      String formatedDate = new SimpleDateFormat("HH:mm:ss.SSS").format(curDate.getTime());
      return counter + ") " + formatedDate + "[" + Thread.currentThread().getName() + "] " + operation;

   }

}

