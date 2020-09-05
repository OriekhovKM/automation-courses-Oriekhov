package Lectures.Lesson_5;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;


        compareDate(a, b, c, d);
        compareDate(b, a, c, d);
        compareDate(c, a, d, b);
        compareDate(d, a, b, c);
    }

        private static boolean compareDate(int first, int second, int third, int fourth) {
            boolean isMax = false;
            if (first >= second && first >= third && first >= fourth) {
                isMax = true;
            }
                return isMax;

        }
    }



