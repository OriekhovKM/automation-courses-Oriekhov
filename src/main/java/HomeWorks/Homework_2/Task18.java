package HomeWorks.Homework_2;

public class Task18 {
    public static void main(String[] args) {
        double x = -1;
        double e = Math.E;

        double a = Math.log(Math.abs(Math.sin(x)));
        double b = 2 * Math.pow(e, x);
        double c = 2 * Math.cos(Math.abs(x));

        double y = a + b + c + 2;

        System.out.print(y);
    }
}
