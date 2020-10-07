package Lectures.Lesson_12.application.androidApp;

public class AndroidStatisticScreen implements Lectures.Lesson_12.application.StatisticScreen {
    @Override
    public void checkFeeding() {
        System.out.println("--> android check feeding");
    }

    @Override
    public void viewGraph() {
        System.out.println("--> android check feeding");
    }
    public void backButton() {
        System.out.println("--> android back to main screen");
    }
}
