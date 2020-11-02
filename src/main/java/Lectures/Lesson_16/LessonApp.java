package Lectures.Lesson_16;

import Infrastructure.data.UserFileDataMapper;
import Infrastructure.data.UserNotFoundException;

public class LessonApp {

    public static void main(String[] args) throws UserNotFoundException {
        UserFileDataMapper mapper = new UserFileDataMapper();


        String name = "user11";
        String email ="user9@gmail.com";

        System.out.println(mapper.getAll());

        System.out.println(mapper.findUserByEmail(email));
        System.out.println(mapper.findUserByName(name));


    }
}
