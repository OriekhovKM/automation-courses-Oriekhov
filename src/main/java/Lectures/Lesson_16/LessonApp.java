package Lectures.Lesson_16;

import Infrastructure.data.DataMapper;
import Infrastructure.data.FileDataMapper;
import Lectures.Lesson_16.generic.Box;

import java.util.Arrays;

public class LessonApp {

    public static void main(String[] args) {
        FileDataMapper mapper = new FileDataMapper();
        System.out.println(Arrays.toString(mapper.getAll()));
        System.out.println(mapper.findUserByEmail("user2@gmail.com"));
    }
    Box box = new Box();
    //box.setItem("qqqq");
    Object item = box.getItem();
    Object item2 = box.getItem();
    //box.setItem(5);
}
