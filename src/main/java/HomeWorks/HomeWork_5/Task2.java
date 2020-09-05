package HomeWorks.HomeWork_5;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    System.out.println("Solution of quadratic equals ax^2+bx+c=0. \n Enter a:");
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();

    System.out.println("Enter b:");
    double b = scanner.nextDouble();

    System.out.println("Enter c:");
    double c = scanner.nextDouble();

    //quadratic(a, b , c);

        String results = Arrays.toString(quadratic(a, b , c));
        System.out.println("The equation has following solution " +results);
}
    private static double [] quadratic (double a, double b, double c) {
        double x1;
        double x2;
        double x;
        double D;
        double results [] = new double [2];

        D = Math.pow(b, 2) - 4 * a * c;
        if (D>0) {
            x1 = (-b+Math.sqrt(D))/(2*a);
            x2 = (-b-Math.sqrt(D))/(2*a);
            results [0] = x1;
            results [1] = x2;
            return  results;

        } else if (D == 0) {
            x = -b/2*a;
            results[0] = x;
            return results;
        }else return results;
    }

}
