package HomeWorks.Homework_2;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter test score:");
        Scanner Test = new Scanner(System.in);
        int TestScore = Test.nextInt();
        System.out.println("Enter total score:");
        Scanner Total = new Scanner(System.in);
        int TotalScore = Total.nextInt();

        System.out.println("Percent of success: " + (double) TestScore / TotalScore * 100 + "%");
    }
}