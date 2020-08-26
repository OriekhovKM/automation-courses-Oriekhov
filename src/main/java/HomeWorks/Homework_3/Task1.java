package HomeWorks.Homework_3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        System.out.println("Enter Int Number:");
        Scanner x = new Scanner(System.in);
        int number = x.nextInt();

        int y = number/2*2+2;


        System.out.println(y);
}
}
