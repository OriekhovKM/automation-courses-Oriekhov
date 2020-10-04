package Lectures.Lesson_12.application.androidApp;

import Lectures.Lesson_12.application.LoginScreen;

public class AndroidLoginScreen implements LoginScreen {
    @Override
    public void login() {
        System.out.println("--> android fill login");
        System.out.println("--> android fill password");
        System.out.println("--> android fill login form");
    }

    @Override
    public void register() {

    }

    @Override
    public void restorePassword() {

    }
}
