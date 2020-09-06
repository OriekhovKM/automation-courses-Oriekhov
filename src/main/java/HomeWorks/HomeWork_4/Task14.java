package HomeWorks.HomeWork_4;

import java.util.Arrays;
import java.util.Scanner;


public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of rows and columns of 2D array");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] data = new int[rows][columns];
        System.out.println("Please enter array elements row by row");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int value = sc.nextInt();
                data[i][j] = value;
            }
        }

        System.out.println("The 2d int array input from user is : ");
        System.out.println(Arrays.deepToString(data));

        sc.close();
        int min = data[0][0];
        int max = data[0][0];
        int countRowsMin = 0;
        int countColumnsMin = 0;
        int countRowsMax = 0;
        int countColumnsMax = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (min>=data[i][j]) {
                    min = data [i][j];
                    countRowsMin = i;
                    countColumnsMin = j;
                }
                if (max<=data[i][j]) {
                    max = data [i][j];
                    countRowsMax = i;
                    countColumnsMax = j;
                }

            }

        }
        System.out.println("Max element is : "+max +"=> Position. Row: " +countRowsMax +"; Column: " +countColumnsMax);
        System.out.println("Min element is : "+min +"=> Position. Row: " +countRowsMin +"; Column: " +countColumnsMin);

    }
}
