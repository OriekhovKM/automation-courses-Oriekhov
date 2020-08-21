package HomeWorks.Homework_2;

public class Task7 {
    public static void main(String[] args) {
        double x = 1;
        double e = Math.E;

        double a = Math.abs(x * Math.log(x) - 4) * Math.sqrt(x);
        double b = 1 / Math.pow(Math.pow(e, 4 * x - 1), 1. / 5);

        double y = a * b;

        System.out.print(y);
    }
}
