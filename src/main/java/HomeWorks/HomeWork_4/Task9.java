package HomeWorks.HomeWork_4;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 4, -5, 10, -2, 8};
        int summArr = 0;
        int i = 0;

        while(arr[i]>=0){
          i++;
        }
        for (int j = i+1; j < arr.length; j++) {
            summArr = summArr + Math.abs(arr[j]);
        }
        System.out.println("Sum of the array elements modules after first negative element is:" +summArr);
    }
}
