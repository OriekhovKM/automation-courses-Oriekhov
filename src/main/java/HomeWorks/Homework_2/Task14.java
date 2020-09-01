package HomeWorks.Homework_2;

public class Task14 {
    public static void main(String[] args) {
        double x = 1;

        double a = Math.log10(x) / (Math.pow(x, 2) + 5 * x + 1);
        double b = Math.pow(x, 3.2) / 28;


        double y = Math.asin(a) - b;

        System.out.print(y);
    }
}
