package HomeWorks.HomeWork_4;

import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        char operator = ' ';
do {
    System.out.println("Enter first number:");
    Scanner number1 = new Scanner(System.in);
    double x = number1.nextDouble();

    System.out.println("Enter second number:");
    Scanner number2 = new Scanner(System.in);
    double y = number2.nextDouble();

    System.out.println("Enter operator:");
    Scanner action = new Scanner(System.in);
    operator = action.next().charAt(0);


    while (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '0') {
        System.out.println("Not correct operator");
        System.out.println("Enter operator:");
        Scanner action2 = new Scanner(System.in);
        operator = action2.next().charAt(0);
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
            if (x != 0) {
            System.out.println("=" + (x / y));
            } else System.out.println("You cannot divide by zero");
            break;
        default:
            System.out.println("Not correct operator");
    }
}while (operator != '0');
        }
    }






