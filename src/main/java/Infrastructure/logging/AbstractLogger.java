package Infrastructure.logging;

public interface AbstractLogger {

 void log(String msg);
 public final static String WELCOME_MESSAGE = "Test suit started at %s";
 public final static String FINAL_MESSAGE = "Test suit finished at %s";
 void atFinish();
 void atStart();
}

