package Lectures.Lesson_10;

 public class RacingCar extends Car{

    private Boolean racingEquipment;
    private String racingClass;


    public RacingCar(String type, double engine, String fuel, String color, Boolean racingEquipment, String racingClass) {
        super(type, engine, fuel, color);
        this.racingEquipment = racingEquipment;
        this.racingClass = racingClass;
    }

     @Override
     public String toString() {
         return "RacingCar{" +
                 "type +" +getType() + '\'' +
                 "engine +" +getEngine() + '\'' +
                 "racingEquipment='" + racingEquipment + '\'' +
                 ", racingClass='" + racingClass + '\'' +
                 '}';
     }
 }
