package Infrastructure.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StdTestLogger extends AbstractLogger {

    @Override
    public  void log(String operation) {
        System.out.println(getEntry(operation));
    }
}
