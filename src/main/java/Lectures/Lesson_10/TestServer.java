package Lectures.Lesson_10;

public class TestServer {

    public String getUrl(String environment) { //method must take nothing!!!
        String url = "";
        switch (environment) {
            case "qa_env":
                return "google.com";
            case "prod_env":
                return "yandex.ru";
            default:
                return "";

        }
    }
}
