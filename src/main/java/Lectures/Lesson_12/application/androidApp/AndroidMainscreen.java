package Lectures.Lesson_12.application.androidApp;

import Lectures.Lesson_12.application.Mainscreen;

public class AndroidMainscreen implements Mainscreen {

    @Override
    public void checkPetStatus() {
        System.out.println("-->android check detail of last feeding");
    }

    @Override
    public void addFood() {
        System.out.println("-->android add food");
        System.out.println("-->android add water");

    }
}
