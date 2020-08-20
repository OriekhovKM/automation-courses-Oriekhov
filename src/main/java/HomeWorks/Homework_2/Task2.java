package HomeWorks.Homework_2;

public class Task2 {
    public static void main (String[] args) {
        double x = 1;

        double a = 1./3*Math.sqrt(Math.abs(Math.sin(x)));
        double b = Math.pow(Math.pow(Math.E, 0.12*x), 1./3);
        double y = a*b;

        System.out.print(y);
    }
}
