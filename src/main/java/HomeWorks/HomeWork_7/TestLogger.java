package HomeWorks.HomeWork_7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestLogger {
public static int counter = 0;

    public String log(String operation) {
        counter++;
        Date curDate = new Date();
        curDate.getTime();
        String formatedDate =  new SimpleDateFormat("HH:mm:ss.SSS").format(curDate.getTime());


                return counter +") " +formatedDate +"[" +Thread.currentThread().getName() +"] " +operation;
    }

}
