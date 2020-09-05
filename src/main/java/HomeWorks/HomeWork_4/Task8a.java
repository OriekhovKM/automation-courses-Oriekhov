package HomeWorks.HomeWork_4;

import java.util.Arrays;

public class Task8a {
    public static void main(String[] args) {
        int[] arr = {11, -11, 2, 4, 14, 15}; //input data
        int min = 1;
        int max = 3;

        int[] arr2 = new int [arr.length];

        System.arraycopy(arr,0, arr2, 0, min);
        System.arraycopy(arr,max+1, arr2, min, arr.length-max-1);
        String seriesString = Arrays.toString(arr2);
        System.out.println(seriesString);
    }
}
