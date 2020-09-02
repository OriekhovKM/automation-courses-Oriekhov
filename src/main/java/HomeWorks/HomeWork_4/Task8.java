package HomeWorks.HomeWork_4;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] arr = {0, -11, 2, 4, 14, 15}; //input data
        int min = 1;
        int max = 10;

        int[] arrNew;
        arrNew = new int[arr.length];
        int i = 0;
        int count = 0;

        while (i< arr.length) {
            if (arr[i]<=max && arr[i]>=min ){
                arr[i] = 0;
            }
            if (arr[i] != 0) {
                arrNew[count]=arr[i];
                count = count+1;
            }
            i++;
        }

        for (int j = 0; j < arr.length; j++) {
            arr[j] = arrNew[j];
        }

        String seriesString = Arrays.toString(arr);
        System.out.println(seriesString);
    }
}
