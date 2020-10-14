package Lectures.Lesson_16;

import Infrastructure.data.User;
import Infrastructure.data.UserFileDataMapper;
import Infrastructure.data.UserNotFoundException;
import Lectures.Lesson_16.generic.Box;

import java.util.Arrays;

public class LessonApp {

    public static void main(String[] args) {
        UserFileDataMapper mapper = new UserFileDataMapper();

        String name = "user9";
        String email ="user 1@gmail.com";


        System.out.println(mapper.findUserByEmail(email));
        System.out.println(mapper.findUserByName(name));


    }
}
