package HomeWorks.Homework_2;

public class Task12 {
    public static void main(String[] args) {
        double x = 1;
        double PI = Math.PI;

        double a = Math.pow(Math.pow(Math.log(x), 2), 1. / 3);
        double b = Math.tan(Math.cos(PI * x));
        double c = Math.abs(Math.log(x / 10.5) + 1. / 3);

        double y = (a + b) * c;

        System.out.print(y);
    }
}
