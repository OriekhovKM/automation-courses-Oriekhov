package HomeWorks.Homework_3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Enter number of operation:");
        System.out.println("1 - circumference");
        System.out.println("2 - area of a circle");
        System.out.println("3 - sphere volume");
        Scanner y = new Scanner(System.in);
        int Operation = y.nextInt();

        System.out.println("Enter radius");

        Scanner x = new Scanner(System.in);
        double Radius = x.nextDouble();

        switch (Operation) {
            case 1:
                System.out.println("circumference - " + (Math.PI * Radius));
                break;
            case 2:
                System.out.println("area of a circle" + (Math.PI * Math.pow(Radius, 2)));
                break;
            case 3:
                System.out.println("sphere volume - " + (4. / 3 * Math.PI * Math.pow(Radius, 3)));
                break;
            default:
                System.out.println("Check operation code!!");


        }
    }
}
