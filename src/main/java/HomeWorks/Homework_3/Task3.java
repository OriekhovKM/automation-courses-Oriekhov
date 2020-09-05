package HomeWorks.Homework_3;

import java.util.Scanner;

public class Task3 {
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

        int[] numbers = {x, y, z, k};
        int min = numbers[0];
        int minCount = 0;
        for (int i = 0; i < 4; i++) {
            if (min >= numbers[i]) {
                min = numbers[i];
            }
        }
        for (int i = 0; i < 4; i++) {
            if (min == numbers[i]) {
                minCount = minCount + 1;
            }
        }
        int maxCount = 4-minCount;

        System.out.println("Min number is :" +min);
        System.out.println("Quantity of Min numbers is: " +minCount +"; " +"Quantity of Max numbers is:" +maxCount);
    }
}
