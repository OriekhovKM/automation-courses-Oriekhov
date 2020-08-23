package HomeWorks.Homework_2;

public class Task16 {
    public static void main(String[] args) {
        double x = 1;

        double a = 8.3 - 21 * Math.pow(x, 2) - 0.8 * x;
        double b = Math.pow(2.5 + 1 / Math.pow(x, 2), 1. / 3);

        double y = Math.atan(a / b);

        System.out.print(y);
    }
}
