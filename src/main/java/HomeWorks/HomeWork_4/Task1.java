package HomeWorks.HomeWork_4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Try to guess integer number from 0 to 100. Enter your variant:");

        Random random = new Random();
        int y = random.nextInt(101);

        for (int i = 0; i <= 10; i++) {
            if (i==10) {
                System.out.println("Hidden number is:" +y);
                break;
            }
                Scanner x = new Scanner(System.in);
                int number = x.nextInt();

                 if (number == y) {
                    System.out.println("You guessed!!!");
                    break;
                }
                if (number < y) {
                    System.out.print("The hidden number is bigger. ");
                } else if (number > y) {
                    System.out.print("The hidden number is less. ");
                }


        }



    }
}
