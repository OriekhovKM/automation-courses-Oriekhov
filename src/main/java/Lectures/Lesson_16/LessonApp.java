package Lectures.Lesson_16;

import Infrastructure.data.User;
import Infrastructure.data.UserFileDataMapper;
import Infrastructure.data.UserNotFoundException;
import Lectures.Lesson_16.generic.Box;

import java.util.ArrayList;
import java.util.Arrays;

public class LessonApp {

    public static void main(String[] args) throws UserNotFoundException {
        UserFileDataMapper mapper = new UserFileDataMapper();


        String name = "user 1";
        String email ="user9@gmail.com";

        System.out.println(mapper.getAll());
        System.out.println(mapper.findUserByEmail(email));
        System.out.println(mapper.findUserByName(name));


    }
}
