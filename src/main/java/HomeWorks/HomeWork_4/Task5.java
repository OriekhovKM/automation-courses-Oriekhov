package HomeWorks.HomeWork_4;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner x = new Scanner(System.in);
        int number = x.nextInt();


            int[] series = new int[number];
            int i = 2;
            series[0] = 1;
            if (number == 2) series[1] = 2;
            if (number > 2) {
                series[1] = 2;
                while (i < number) {
                    series[i] = series[i - 2] + series[i - 1];
                    i++;
                }
            }

            String seriesString = Arrays.toString(series);
            System.out.println(seriesString);
        }
}


