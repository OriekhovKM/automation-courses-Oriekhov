package Lectures.Lesson_4;

public class Loops2 {
    public static void  main(String[] args) {
        int i = 0;
        int [] count = {1, 2, 3, 4, 5, 6, 7};
        for (int e:count) {
            System.out.println(count);
            if (i!=0) System.out.println(count[i-1]);
            i++;
        }
    }
}
