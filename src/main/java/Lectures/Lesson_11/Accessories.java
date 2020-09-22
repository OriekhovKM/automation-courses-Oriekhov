package Lectures.Lesson_11;

public class Accessories extends Device{
    private Boolean isWirless;

    public Accessories(String type, String description, Boolean isWirless) {
        super(type, description);
        this.isWirless = isWirless;
    }

    public Boolean getWirless() {
        return isWirless;
    }

    public void setWirless(Boolean wirless) {
        isWirless = wirless;
    }
}
