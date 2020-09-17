package Lectures.Lesson_10;

public class RacingCar extends Car{

    private boolean racingEquipment;
    private String racingClass;

    public boolean isRacingEquipment() {
        return racingEquipment;
    }

    public String getRacingClass() {
        return racingClass;
    }

    @Override
    public String toString() {
        return "RacingCar{" +
                "racingEquipment='" + racingEquipment + '\'' +
                ", racingClass='" + racingClass + '\'' +
                '}';
    }
}
