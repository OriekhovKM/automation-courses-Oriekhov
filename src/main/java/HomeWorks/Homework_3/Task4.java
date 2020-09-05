package HomeWorks.Homework_3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter First Int Number:");
        Scanner first = new Scanner(System.in);
        int x = first.nextInt();
        System.out.println("Enter Second Int Number:");
        Scanner second = new Scanner(System.in);
        int y = second.nextInt();
        System.out.println("Enter Third Int Number:");
        Scanner third = new Scanner(System.in);
        int z = third.nextInt();
        System.out.println("Enter Fourth Int Number:");
        Scanner fourth = new Scanner(System.in);
        int k = fourth.nextInt();
        System.out.println("Enter Fifth Int Number:");
        Scanner fifth = new Scanner(System.in);
        int l = fifth.nextInt();

        int[] numbers = {x, y, z, k, l};

        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < 5; i++) {
            if (min >= numbers[i]) min = numbers[i];

            if (max <= numbers[i]) max = numbers[i];
        }


        System.out.println("Min number is: " + min + "; " + "Max number is: " + max);

    }
}

