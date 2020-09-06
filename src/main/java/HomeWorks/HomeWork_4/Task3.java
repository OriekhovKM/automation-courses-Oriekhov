package HomeWorks.HomeWork_4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner x = new Scanner(System.in);
        int number = x.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial*i;
        }
        System.out.println("Factorial of " +number +" is:" +factorial);
    }
}
