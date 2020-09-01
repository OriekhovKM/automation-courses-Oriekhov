package HomeWorks.Homework_2;

public class Task6 {
    public static void main(String[] args) {
        double x = 1;
        double e = Math.E;

        double a = Math.sqrt(Math.pow(Math.sin(x / 2), 3));
        double b = Math.pow((Math.pow(e, 1.3 * x) + Math.pow(e, -1.3 * x)), 1. / 3);
        double c = 1 / Math.abs(x + 5. / 2);

        double y = (a + b) * c;

        System.out.print(y);
    }
}
