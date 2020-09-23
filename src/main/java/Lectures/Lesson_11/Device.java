package Lectures.Lesson_11;

public class Device {
    private String type;
    private String description;

    public Device(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Device{" +
                "type" + getType() + '\'' +
                " description" + getDescription() + '\'' +
                "type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
