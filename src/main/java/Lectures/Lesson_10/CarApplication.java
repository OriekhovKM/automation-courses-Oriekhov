package Lectures.Lesson_10;

public class CarApplication {
   public static void main(String[] args) {
      Car car1 = new Car("sedan", 2, "gas", "red");
      Car car2 = new RacingCar("race", 5, "dizel", "black", true, "formula1");
      Car car3 = new SpecialCar("golf car", 0.5, "electro", "white", true);

       System.out.println(car1);
       System.out.println(car2);
       System.out.println(car3);
    }
}
