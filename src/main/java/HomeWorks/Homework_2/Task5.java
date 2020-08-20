package HomeWorks.Homework_2;

public class Task5 {
    public static void main (String[] args) {
        double x = 1;
        double e = Math.E;

        double a = Math.pow(Math.pow(e, (-2+x)),1./5);
        double b = 1/Math.sqrt(Math.pow(x, 2)+Math.pow(x, 4)+ Math.log(Math.abs(x-3.14)));

        double y = a*b;

        System.out.print(y);
}
}
