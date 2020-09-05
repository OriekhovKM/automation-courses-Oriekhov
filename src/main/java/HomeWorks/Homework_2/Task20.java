package HomeWorks.Homework_2;
import java.util.Scanner;  //Time Convertor
public class Task20 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter time in seconds:");
        Scanner Time = new Scanner(System.in);
        float ConvTime = Time.nextFloat();

        System.out.println("Time in minutes equals:" + ConvTime / 60);
        System.out.println("Time in hours equals:" + (ConvTime / 60) / 60);
        float days = ((ConvTime / 60) / 60) / 24;
        System.out.println("Time in days equals:" + days);
        int IntDays = (int) (days); //determine the remain from values
        float RemDays = days - IntDays;

        if (RemDays != 0) {
            System.out.println("OR:");
            System.out.print(IntDays + " - days-> ");
            float hours = RemDays * 24;
            float RemHours = hours - ((int) (hours));
            System.out.print(((int) (hours)) + " - hours-> ");

            if (RemHours != 0) {
                float minutes = RemHours * 60;
                float RemMinutes = minutes - ((int) (minutes));
                System.out.print(((int) (minutes)) + " - minutes-> ");

                if (RemMinutes != 0 ) {
                    System.out.print(Math.ceil(RemMinutes * 60) + " - seconds;"); // Math.ceil used for avoid errors with own calculation float numbers (0.99999 seconds equals 1)
                }
            }
        }
    }
}