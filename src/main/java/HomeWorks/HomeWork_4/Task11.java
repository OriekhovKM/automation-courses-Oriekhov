package HomeWorks.HomeWork_4;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] arr = {0, -11, 2, 4, 14, 15}; //input data
        String seriesString = Arrays.toString(arr);
        System.out.println("original " +seriesString);
        int n = arr.length;
        int buf; //like a buffer
        int i;

        for (i = 0; i < n / 2; i++) {
            buf = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = buf;
        }
        String seriesString2 = Arrays.toString(arr);
        System.out.println("revers " +seriesString2);


    }
}
