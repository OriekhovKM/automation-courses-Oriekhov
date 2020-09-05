package HomeWorks.Homework_3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = scanner.nextInt();
        System.out.println("Enter second number");
        int y = scanner.nextInt();
        System.out.println("Enter operation (available operation: +, -, *, / )");
        String operation = scanner.next();
        switch (operation) {
            case "*":
                double a = x * y;
                System.out.println(x + " " + operation + " " + y + " = " + a);
                break;
            case "/":
                if (x == 0) {
                    System.out.println("You cannot divide by zero");
                } else {
                double b = x / y;
                System.out.println(x + " " + operation + " " + y + " = " + b);
                }
                break;
            case "+":
                double c = x + y;
                System.out.println(x + " " + operation + " " + y + " = " + c);
                break;
            case "-":
                double d = x - y;
                System.out.println(x + " " + operation + " " + y + " = " + d);
                break;
            default:
                System.out.println("Check operator!!");

        }
    }
}
