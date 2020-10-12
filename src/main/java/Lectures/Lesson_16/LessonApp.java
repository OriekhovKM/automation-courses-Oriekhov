package Lectures.Lesson_16;

import Infrastructure.data.User;
import Infrastructure.data.UserFileDataMapper;
import Infrastructure.data.UserNotFoundException;
import Lectures.Lesson_16.generic.Box;

import java.util.Arrays;

public class LessonApp {

    public static void main(String[] args) {
        UserFileDataMapper mapper = new UserFileDataMapper();

        String name = "user 1";
        String email ="user11@gmail.com";
        try{
            User user = mapper.findUserByEmail(email);
        if (user == null) {
            throw new UserNotFoundException();
        } System.out.println(user);

        }catch (UserNotFoundException e){

        }

    }
}
