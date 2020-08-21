package Lectures.Lesson_3;

public class Lesson3Task1 {
    public static void main(String[] args) {
        double Price1 = 113;
        double Price2 = 130;

        double CountTotalPrice = (Price1 + Price2) - (Price1 + Price2)*0.07;
        double TotalPrice = CountTotalPrice+Price2*2;

        System.out.print(TotalPrice);
    }
}
