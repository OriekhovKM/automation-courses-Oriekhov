package Lectures.Lesson_14;

public enum Currency implements Size{

    UAH("ukraine", 980, 20, 150),
    USD("usa", 840,20, 150),
    EUR("germany", 978, 20, 150);

    private final int curCod;
    private final String country;
    private final int curWidth;
    private final int curHeight;

    Currency(String country, int curCor, int width, int height) {
        this.country = country;
        this.curCod = curCor;
        this.curWidth = width;
        this.curHeight = height;

    }

    public int getCurCod() {
        return curCod;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

//    @Override
//    public int getWidth() {
//        return curWidth();
//    }
//
//    @Override
//    public int getHeight() {
//        return curHeight();;
//    }


}
