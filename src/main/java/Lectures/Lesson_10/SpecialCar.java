package Lectures.Lesson_10;

public class SpecialCar {

    private String machinery;

    public SpecialCar(String machinery) {
        this.machinery = machinery;
    }

    @Override
    public String toString() {
        return "SpecialCar{" +
                "machinery='" + machinery + '\'' +
                '}';
    }
}
