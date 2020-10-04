package Lectures.Lesson_12;

import Lectures.Lesson_12.application.Application;
import Lectures.Lesson_12.application.androidApp.AndroidApplication;

public class LessonApp {
    public static void main(String[] args) {
        Application android = new AndroidApplication();
        android.getLoginScreen().login();
        android.getMainscreen().checkPetStatus();
        android.getMainscreen().addFood();
        android.getAddEditScreen().fillPetForm();
        android.getAddEditScreen().savePet();
        android.getAddEditScreen().backButton();
    }
}
