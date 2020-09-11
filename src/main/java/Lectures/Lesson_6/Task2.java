package Lectures.Lesson_6;

public class Task2 {
    public  static  void getIntDataOfArray (String[] args){

    }
    public void valueOrDefault (String envVar, String defValue){
        String returnValue;
        if (System.getenv("ADMINNAME").isEmpty()) {
            returnValue = defValue;
        }
    }
}
