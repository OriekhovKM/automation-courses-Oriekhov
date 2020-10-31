package Lectures.Lesson_20;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ResourceBundle;

public class LessonApp {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("ru");

        System.out.println(encodeProp(bundle.getString("welcome_message")));
        System.out.println(bundle.getString("error_message"));

        }

        public static String encodeProp(String prop){
        String result = "";
        try {
            result =  new String(prop.getBytes("ISO-8859-1"), Charset.defaultCharset());

        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
        }
}

