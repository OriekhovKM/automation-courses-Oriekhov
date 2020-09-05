package HomeWorks.Homework_3;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        System.out.println("Enter Year:");
        Scanner y = new Scanner(System.in);
        int Year = y.nextInt();

        System.out.println("Enter Month:");
        Scanner x = new Scanner(System.in);
        int Month = x.nextInt();

        // int month = Integer.valueOf(Month);
        Calendar calendarD = new GregorianCalendar(Year, Month - 1, 1);
        int days = calendarD.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("days: " + days );
    }
}
