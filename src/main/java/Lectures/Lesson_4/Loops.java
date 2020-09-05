package Lectures.Lesson_4;

public class Loops {
    public static void  main(String[] args) {
        int count = 1000;
        for (int i = 0; i < count; i++) {
            System.out.println("count is:" +i);
            i=i*3;
           // if (i==5) break;
            if (i==5) continue;
          //  break;
        }
    }

}
