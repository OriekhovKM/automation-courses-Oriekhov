package HomeWorks.HomeWork_4;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter Max:");
        Scanner x = new Scanner(System.in);
        int max = x.nextInt();

        System.out.println("Enter Min:");
        Scanner y = new Scanner(System.in);
        int min = y.nextInt();

        System.out.println("Enter Step:");
        Scanner z = new Scanner(System.in);
        int step = z.nextInt();

        System.out.println(min);
        do {
            min = min + step;
            if (min>max) {
                System.out.println(max);
            } else System.out.println(min);
        }while (min < max);
        
    }

}
