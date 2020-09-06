package HomeWorks.HomeWork_4;


import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int [] arr = new int[20];
        //int i = (int)Math.random() * 10 - 4;
        for (int i = 0; i < 20; i++) {
            arr[i] = (int)(Math.random() * 10 - 4);
        }
        int countNeg = 0;
        int countPos = 0;
        int countZer = 0;
        for (int i = 0; i < 20; i++) {
            if (arr[i]<0) {
                countNeg++;
            } else if (arr[i]>0) {
                countPos++;
            }else countZer++;
        }
        String seriesString2 = Arrays.toString(arr);
        System.out.println("generated massive is " +seriesString2);
        System.out.println("quantity of positive numbers is: " +countPos);
        System.out.println("quantity of negative numbers is: " +countNeg);
        System.out.println("quantity of zeros is: " +countZer);
    }
}
