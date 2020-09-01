package HomeWorks.Homework_2;

public class Task8 {
    public static void main(String[] args) {
        double x = 1;
        double e = Math.E;

        double a = Math.pow(e, 2 * x) * Math.sqrt(x);
        double b = (x + 1. / 3) / x;
        double c = Math.abs(Math.cos(2.5 * x));

        double y = Math.pow(a - b, 1. / 3) * c;

        System.out.print(y);
    }
}
