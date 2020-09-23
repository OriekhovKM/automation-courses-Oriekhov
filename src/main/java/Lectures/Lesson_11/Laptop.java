package Lectures.Lesson_11;

public class Laptop  extends Device{
    private  String screenSize;
    private  String arch;
    private String spec;

    public Laptop(String type, String description, String screenSize, String arch, String spec) {
        super(type, description);
        this.screenSize = screenSize;
        this.arch = arch;
        this.spec = spec;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "type" + getType() + '\'' +
                " description" + getDescription() + '\'' +
                "screenSize='" + screenSize + '\'' +
                ", arch='" + arch + '\'' +
                ", spec='" + spec + '\'' +
                '}';
    }
}
