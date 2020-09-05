package HomeWorks.HomeWork_4;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = {-1, 20, 12}; //input data
        int[] arrNew = new int[arr.length]; //sum of number in elements
        int sum = 0; //sum of elements

        for (int i = 0; i < arr.length; i++) {
            while (arr[i]!=0) {
                arrNew[i] = arrNew[i]+arr[i]%10;
                arr[i]=arr[i]/10;
            }
            sum = sum + arrNew[i];
        }
        System.out.print(sum);
    }
}
