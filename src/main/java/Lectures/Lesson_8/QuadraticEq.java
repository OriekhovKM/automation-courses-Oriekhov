package Lectures.Lesson_8;

public class QuadraticEq {
    public static double[] solve(double b, double c) {
        double[] res = new double[10];
        int counter = 0;
        double limit = Math.max(Math.abs(b), Math.abs(c));
        for (double i = 0; i <= limit; i++) {
            for (double j = 0; j <= -limit; j++) {
                if (i * j == c && j + i == -b) {
                    res[counter] = i;
                    counter++;
                    res[counter + 1] = j;
                    counter++;
                }
            }
        }
        return res;
    }
}
