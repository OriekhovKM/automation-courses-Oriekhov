package Lectures.Lesson_4;

public class Loops3 {
    public static void  main(String[] args) {
        long current = System.currentTimeMillis();

        while (System.currentTimeMillis() - current <= 10_000) {
            System.out.println("waiting" +(System.currentTimeMillis() - current));
        }
    }
}
