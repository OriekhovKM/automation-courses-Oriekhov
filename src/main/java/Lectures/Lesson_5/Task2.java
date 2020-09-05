package Lectures.Lesson_5;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println();

            for (int j = 0; j < 9; j++) {
                if (i >= j)
                    System.out.print("# ");
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.println();

            for (int j = 0; j < 9; j++) {
                if (i <= j)
                    System.out.print("# ");
            }
        }
    }

}
