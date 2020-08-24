package HomeWorks.Homework_2;

public class Task17 {
    public static void main(String[] args) {
        double x = 0;
        double e = Math.E;

        double a = Math.pow(x, 3.4) + 2.5 * Math.pow(x, 1.2) - 0.8;
        double b = Math.pow(Math.pow(e, 2.5 * x), 1. / 3);

        double y = Math.pow(Math.log10(Math.acos(a / b)), 1. / 4) + 1;

        System.out.print(y);
    }
}
