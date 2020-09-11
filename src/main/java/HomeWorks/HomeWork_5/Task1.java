package HomeWorks.HomeWork_5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter conversion code:");
        System.out.println("1 - Convert Celsius to Kelvin.");
        System.out.println("2 - Convert Kelvin to Celsius.");
        System.out.println("3 -  Convert Celsius to Fahrenheit");
        System.out.println("4 -  Convert Fahrenheit to Celsius");
        System.out.println("5 - Convert meters to inches.");
        System.out.println("6 - Convert inches to meters.");
        System.out.println("7 - Convert miles to kilometres.");
        System.out.println("8 - Convert kilometres to meters.");
        System.out.println("9 - Convert pounds to kilograms.");
        System.out.println("10 - Convert kilograms to pounds.");

        Scanner scanner = new Scanner(System.in);
        int ConvCode = scanner.nextInt();
        System.out.println("Conversion code is:  " + ConvCode);
        System.out.println("Enter conversion value:");
        double ConvValue = scanner.nextDouble();
        System.out.println("Conversion value is: " + ConvValue);


        switch (ConvCode) {
            case 1:
                convertorCelToKel(ConvValue);
                break;
            case 2:
                convertorKelToCel(ConvValue);
                break;
            case 3:
                convertorCelToFar(ConvValue);
                break;
            case 4:
                convertorFarToCel(ConvValue);
                break;
            case 5:
                convertorMetToInc(ConvValue);
                break;
            case 6:
                convertorIncToMet(ConvValue);
                break;
            case 7:
                convertorMilToKm(ConvValue);
                break;
            case 8:
                convertorKmToMet(ConvValue);
                break;
            case 9:
                convertorPoundToKg(ConvValue);
                break;
            case 10:
                convertorKgToPound(ConvValue);
                break;
            default:
                System.out.println("Check conversion code!!");
        }
    }

    private static void convertorCelToKel (double a) {
        System.out.println("Enter temperature:");
        double kelvin = a+273.15;
        System.out.println(a +" Celsius equals " +kelvin +" Kelvins");
    }

    private static void convertorKelToCel (double a) {
        System.out.println("Enter temperature:");
        double celsius = a-273.15;
        System.out.println(a +" Celvins equals " +celsius +" Celsius");
    }

    private static void convertorCelToFar (double a) {
        System.out.println("Enter temperature:");
        double far = (a + 32 * 5. / 9) / 5. / 9;
        System.out.println(a +"  Celsius equals " +far +" Fahrenheit");
    }

    private static void convertorFarToCel (double a) {
        System.out.println("Enter temperature:");
        double celsius = ((5. / 9) * a - 32 * 5. / 9);
        System.out.println(a +"  Fahrenheit equals " +celsius +" Celsius");
    }

    private static void convertorMetToInc (double a) {
        System.out.println("Enter distance:");
        double inc = 39.37 * a;
        System.out.println(a +"  meters equals " +inc +" inches");
    }

    private static void convertorIncToMet (double a) {
        System.out.println("Enter distance:");
        double meters = a/39.37;
        System.out.println(a +"  inches equals " +meters +" meters");
    }

    private static void convertorMilToKm (double a) {
        System.out.println("Enter distance:");
        double kilometer = a/1.61;
        System.out.println(a +"  miles equals " +kilometer +" kilometers");
    }

    private static void convertorKmToMet (double a) {
        System.out.println("Enter distance:");
        double meters = a*1000;
        System.out.println(a +"  kilometers equals " +meters +" meters");
    }

    private static void convertorPoundToKg (double a) {
        System.out.println("Enter weight:");
        double kg = a/2.2;
        System.out.println(a +"  pounds equals " +kg +" kilograms");
    }

    private static void convertorKgToPound (double a) {
        System.out.println("Enter weight:");
        double pound = a/2.2;
        System.out.println(a +"  kilograms equals " +pound +" pounds");
    }

}
