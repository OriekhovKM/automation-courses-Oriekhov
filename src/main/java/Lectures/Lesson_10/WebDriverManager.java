package Lectures.Lesson_10;

public class WebDriverManager {
    public String createBrowser() {
        String configuration = "chrome";

        switch (configuration) {
            case "Chrome":
                return "neq Google driver";
            case "firefox":
                return "new Mozilla driver";
            default:
                return "";


        }
    }

    public void destryBrowser(String browser){
        if (browser != null){
            System.out.println();
        }
    }
}
