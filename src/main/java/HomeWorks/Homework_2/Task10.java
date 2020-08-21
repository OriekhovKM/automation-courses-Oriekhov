package HomeWorks.Homework_2;

public class Task10 {
    public static void main(String[] args) {
        double x = 1;
        double e = Math.E;

        double a = Math.abs(7.2-10*x);
        double b = Math.pow(Math.pow(x, 2)+Math.pow(e, x), 1./3);
        double c = 4*(x/3);
        double d = Math.sqrt(Math.pow(1.1, 3)+Math.pow(x, 2));

        double y = (a/b)*Math.atan(c/d);

        System.out.print(y);
    }
}
