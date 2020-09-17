package Lectures.Lesson_10;

public class Car {
    private String type;
    private double engine;
    private String fuel;
    private String color;

    public Car(String type, double engine, String fuel, String color) {
        this.type = type;
        this.engine = engine;
        this.fuel = fuel;
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
