package Lectures.Lesson_5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        //isEven(2);
        System.out.println(isEven(2));
        int[] arrayInt = {1, 2, 35, 5};
        char[] arrayInt3 = {1, ' ', 'b', 25};

        System.out.println (summArr(arrayInt));
        System.out.println (Arrays.toString(getIntDataOfArray(arrayInt3)));
    }
    public static boolean isEven (int number) {
      return  number%2 == 0;
        //  if (number%2 == 0) {
      //      return true;
     //   }return  false;
    }
    public static int summArr (int[] ints){
        int sum = 0;
        for (int num: ints) {
            sum = sum + num;
        }
        return sum;
    }
    public  static  int[] getIntDataOfArray (char[] chars) {
        int[] resultInt = new int[chars.length];
        for (int i=0; i < chars.length; i++) {
             resultInt[i] = (int) chars[i];
        }


        return resultInt;
    }
    private static void factorial (int factorialRange) {
        int result = 1;
        for (int j=1; j<= factorialRange; j++){
            result = result*j;
        }
        System.out.println(result);
    }
}
