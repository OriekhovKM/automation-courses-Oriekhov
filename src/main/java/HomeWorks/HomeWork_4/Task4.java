package HomeWorks.HomeWork_4;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner x = new Scanner(System.in);
        int number = x.nextInt();



        int sumOdd = 0, sumEven = 0;

        while (number != 0) {
           if (number % 2 == 0)
                sumEven =sumEven + number % 10;
            else
                sumOdd = sumOdd + number % 10;
            number = number/10;

        }
        System.out.println("Sum odd = " + sumOdd);
        System.out.println("Sum even = " + sumEven);
    }

}
