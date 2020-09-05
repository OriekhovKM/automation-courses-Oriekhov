package HomeWorks.Homework_2;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter Correct Number:");
        Scanner CN = new Scanner(System.in);
        int CorrectNumber = CN.nextInt();
        System.out.println("Enter Wrong Number:");
        Scanner WN = new Scanner(System.in);
        int WrongNumber = WN.nextInt();

        System.out.println("Final score on a multiple choice test " + ((double) CorrectNumber - 1. / 4 * WrongNumber));
    }
}
