package HomeWorks.Homework_3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter First Name:");
        Scanner first = new Scanner(System.in);
        String firstName = first.next();

        System.out.println("Enter Second Name:");
        Scanner second = new Scanner(System.in);
        String secondName = second.next();

        if (firstName.equals(secondName)) System.out.print("people are namesakes");
    }
}
