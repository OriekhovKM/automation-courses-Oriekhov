package HomeWorks.Homework_3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter Int Number (Month):");
        Scanner x = new Scanner(System.in);
        int number = x.nextInt();
        String Season = number < 2 ||  number ==12 ? "winter" :
            number < 6  ? "spring":
                    number > 8 ? "autumn":"summer";
        System.out.println(Season);
    }
}
