package HomeWorks.HomeWork_4;

import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        char operator = ' ';
do {
    System.out.println("Enter first number:");
    Scanner scanner = new Scanner(System.in);
    double x = scanner.nextDouble();

    System.out.println("Enter second number:");
    double y = scanner.nextDouble();

    System.out.println("Enter operator:");
    Scanner action = new Scanner(System.in);
    operator = action.next().charAt(0);


    while (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '0') {
        System.out.println("Not correct operator");
        System.out.println("Enter operator:");
        operator = scanner.next().charAt(0);
    }

    switch (operator) {
        case '0':
            break;
        case '+':
            System.out.println("=" + (x + y));
            break;
        case '-':
            System.out.println("=" + (x - y));
            break;
        case '*':
            System.out.println("=" + (x * y));
            break;
        case '/':
            if (y != 0) {
            System.out.println("=" + (x / y));
            } else System.out.println("You cannot divide by zero");
            break;
        default:
            System.out.println("Not correct operator");
    }
}while (operator != '0');
        }
    }






