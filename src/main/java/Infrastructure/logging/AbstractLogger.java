package Infrastructure.logging;

import org.openqa.selenium.WebDriver;

public interface AbstractLogger {

 void log(WebDriver msg);
 public final static String WELCOME_MESSAGE = "Test suit started at %s";
 public final static String FINAL_MESSAGE = "Test suit finished at %s";
 void atFinish();
 void atStart();
}

