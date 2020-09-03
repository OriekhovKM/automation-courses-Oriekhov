package HomeWorks.HomeWork_4;

import java.util.Arrays;

public class Task8a {
    public static void main(String[] args) {
        int[] arr = {11, -11, 2, 4, 14, 15}; //input data
        int min = 0;
        int max = 5;

        int[] arr2 = new int [arr.length];

        System.arraycopy(arr,0, arr2, 0, min+1);
        System.arraycopy(arr,max, arr2, min+1, arr.length-max);
        String seriesString = Arrays.toString(arr2);
        System.out.println(seriesString);
    }
}
