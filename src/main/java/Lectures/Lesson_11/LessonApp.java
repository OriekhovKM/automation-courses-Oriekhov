package Lectures.Lesson_11;

public class LessonApp {
    public static void main(String[] args) {
       Accessories mouse = new Accessories("mouse", "apple magic mouse", true);
       Laptop laptop = new Laptop("laptop", "lenovo ThinkPad", "15 inch", "x64", "i7 core, 16 Gb");

        System.out.println(mouse.getDescription());
        System.out.println(mouse.getType());
        System.out.println(mouse.getWirless());
        System.out.println(mouse);

        System.out.println("########################");
        System.out.println(laptop.getDescription());
        System.out.println(laptop.getType());
        System.out.println(laptop.getClass());
        System.out.println(laptop.getSpec());
        System.out.println(laptop);
    }
}
