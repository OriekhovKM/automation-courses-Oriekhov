package Lectures.Lesson_10;

public class SpecialCar extends Car{
    private Boolean machinery;

    public SpecialCar(String type, double engine, String fuel, String color, Boolean machinery) {
        super(type, engine, fuel, color);
        this.machinery = machinery;
    }

    @Override
    public String toString() {
        return "SpecialCar{" +
                "type +" +getType() + '\'' +
                "engine +" +getEngine() + '\'' +
                "machinery='" + machinery + '\'' +
                '}';
    }
}
