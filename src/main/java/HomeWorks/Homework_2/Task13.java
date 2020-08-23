package HomeWorks.Homework_2;

public class Task13 {
    public static void main(String[] args) {
        double x = 0;

        double a = Math.pow(Math.log10(x), 1. / 4);
        double b = Math.acos(x + 3);
        double c = 1 / Math.abs(x + Math.pow(2 * x, 2));

        double y = (a + b) * c;

        System.out.print(y);
    }
}
