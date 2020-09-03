package Lectures.Lesson_6;

public class Task1 {
    public  static  void getIntDataOfArray (String[] args) {
        String simpleString = "Hello world";
        char[] arr = {'h', 'e', 'l', 'l', 'o'};

        String arrayString = new String(arr);
        String string2 = new String("Hello");

        System.out.println(string2);
        System.out.println(string2.concat(simpleString));

        StringBuilder builder = new StringBuilder();
        System.out.println(builder.append(simpleString).append(" "));





    }
}
