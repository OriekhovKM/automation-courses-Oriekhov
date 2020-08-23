package HomeWorks.Homework_2;

public class Task4 {
    public static void main(String[] args) {
        double x = 1;
        double e = Math.E;

        double a = Math.log(Math.sqrt(12 - x) + 1.2);
        double b = 1 / (2 + Math.pow(e, -x));
        double c = Math.pow(2. / x, 1. / 3);
        double y = a * b + c;

        System.out.print(y);
    }
}
