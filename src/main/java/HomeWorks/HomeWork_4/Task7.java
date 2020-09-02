package HomeWorks.HomeWork_4;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 10, 2, 8, 22, 12, 15, 1};
        int summArr = 0;

        for (int i = 0; i < arr.length; i++) {
         summArr = summArr + arr[i];
        }
        double normal = summArr/arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (normal>arr[i]) System.out.print(arr[i] +" ");
        }
    }
}
