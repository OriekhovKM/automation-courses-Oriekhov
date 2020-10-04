package Lectures.Lesson_15;

import java.util.Scanner;

public class ExceptionLesson {
    public static void main(String[] args) {
       try{
           test();
       }
       catch (StackOverflowError e) {
           System.err.println("recursive call" + e.getMessage());
       }
    }
    public static void test () {
        System.out.println("enter digit 1");
        Scanner sc1 = new Scanner(System.in);

        System.out.println("enter digit 2");
        Scanner sc2 = new Scanner(System.in);

        try {
            System.out.println(sc1.nextInt() / Integer.parseInt(sc2.next()));
        } catch (ArithmeticException y) {
           // y.getCause();
            System.err.println("incorrect input, devided by zero" + y.getStackTrace());
        }
        catch (NumberFormatException y){
           // y.getCause();
            System.err.println("incorrect input int needed"+y.getStackTrace());
        }
    }
}