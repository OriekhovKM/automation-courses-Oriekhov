package HomeWorks.HomeWork_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
            // taking String array input from user
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter length of String array");
            int length = sc.nextInt();

            // create a String array to save user input
            int[] input = new int[length];

            // loop over array to save user input
            System.out.println("Please enter array elements");
            for (int i = 0; i < length; i++) {
                int userInput = sc.nextInt();
                input[i] = userInput;
            }

            int sum = 0;
            int product = 1;

        for (int j = 0; j < length; j++) {
            sum = sum + input[j];
            product = product*input[j];
        }
        String seriesString2 = Arrays.toString(input);
        System.out.println("Your massive is " +seriesString2);
        System.out.println("Sum of elements is : " +sum);
        System.out.println("Product of elements is: " +product);
}
}

