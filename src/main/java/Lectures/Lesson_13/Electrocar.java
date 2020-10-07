package Lectures.Lesson_13;

public class Electrocar {
    public int id;
    private String type = "electro";

    public Electrocar(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Electrocar{" +
                "id=" + id +
                '}';
    }

    class Engine {
        public void startEngine(){

        }
    }
}
