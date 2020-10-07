package Lectures.Lesson_14;

public class LessonApp {
    public static void main(String[] args) {
        Currency.values();
        Currency uah = Currency.valueOf("UAH");
        Currency.valueOf("uah".toUpperCase());
        Enum.valueOf(Currency.class, "UAH");


    }
    public  void selectCurrency(Currency cur){
        switch (cur){
            case EUR:
                System.out.println("euro");
            case UAH:
                System.out.println("hryvna");
            case USD:
                System.out.println("dollar");
        }
    }
}
