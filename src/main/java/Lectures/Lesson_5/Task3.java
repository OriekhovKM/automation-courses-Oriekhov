package Lectures.Lesson_5;

public class Task3 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println();

            for (int j = 0; j < 9; j++) {
                if (i < j) {
                    System.out.print("#");
                } else System.out.print(" ");
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.println();

            for (int j = 0; j < 9; j ++) {
                if (i == 0) {
                    System.out.print("# ");
                } else if (i == 8) {
                    System.out.print("# ");
                } else if (j == 0 || j ==  8) {
                    System.out.print(" ");
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.println();

            for (int j = 0; j < 9; j ++) {

               // System.out.print (i == 0 || i == 8 || j == i || j + i == 0 ?)
            }
        }
    }
}
