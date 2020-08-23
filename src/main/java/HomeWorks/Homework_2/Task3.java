package HomeWorks.Homework_2;

public class Task3 {
    public static void main(String[] args) {
        double x = 1;

        double a = 2 * Math.PI * x;
        double b = Math.abs(Math.sin(Math.sqrt(10.5 * x)));
        double c = 1 / (Math.pow(Math.pow(x, 2), 1. / 3) + 1. / 7);
        double y = a - b * c;

        System.out.print(y);
    }

}
