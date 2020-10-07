package Lectures.Lesson_12.application.androidApp;

import Lectures.Lesson_12.application.*;

public class AndroidApplication implements Application {
    @Override
    public AndroidAddEditScreen getAddEditScreen() {
        return new AndroidAddEditScreen();
    }

    @Override
    public AndroidLoginScreen getLoginScreen() {
        return new AndroidLoginScreen();
    }

    @Override
    public AndroidMainscreen getMainscreen() {
        return new AndroidMainscreen();
    }

    @Override
    public AndroidStatisticScreen getStatisticScreen() {
        return new AndroidStatisticScreen();
    }
}
