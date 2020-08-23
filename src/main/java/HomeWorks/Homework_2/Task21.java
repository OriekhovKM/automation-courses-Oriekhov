package HomeWorks.Homework_2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Task21 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter your born date in format: yyyy-mm-dd (example 2000-08-30):");
        Scanner BornDate = new Scanner(System.in);
        String BornDateBeforeString = BornDate.next();

        System.out.println("Enter current date in format: yyyy-mm-dd (example 2020-08-30):");
        Scanner CurrentDate = new Scanner(System.in);
        String CurrentDateAfterString = CurrentDate.next();

        LocalDate dateBefore = LocalDate.parse(BornDateBeforeString);
        LocalDate dateAfter = LocalDate.parse(CurrentDateAfterString);

        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        long noOfYearsBetween = ChronoUnit.YEARS.between(dateBefore, dateAfter);

        System.out.println("You’ve been alive in seconds:" + noOfDaysBetween * 24 * 60 * 60);
        System.out.println("You’ve been alive in minutes:" + noOfDaysBetween * 24 * 60);
        System.out.println("You’ve been alive in hours:" + noOfDaysBetween * 24);
        System.out.println("You’ve been alive in days:" + noOfDaysBetween);
        System.out.println("You’ve been alive in weeks:" + noOfDaysBetween / 7);
        System.out.println("You’ve been alive in years:" + noOfYearsBetween);
    }
}
