package HomeWorks.Homework_2;
import java.util.Scanner;  //Convertor
public class Task19 {
    public static void main(String[] args) throws Exception {

        Scanner Code = new Scanner(System.in);
        Scanner Value = new Scanner(System.in);
        System.out.println("Enter conversion code:");
        System.out.println("1 - Convert Celsius to Fahrenheit");
        System.out.println("2 - Convert Fahrenheit to Celsius");
        System.out.println("3 - Convert Celsius to Kelvin");
        System.out.println("4 - Convert meters to inches. 5 - reverse");
        System.out.println("6 - Convert miles to kilometres. 7 -  reverse");
        System.out.println("8 - Convert kilograms to pounds. 9 -  reverse");
        System.out.println("10 - Convert speed km/hr to mi/hr. 11 - reverse");

        int ConvCode = Code.nextInt();
        System.out.println("Conversion code is:  " + ConvCode);
        System.out.println("Enter conversion value:");
        double ConvValue = Value.nextDouble();
        System.out.println("Conversion value is: " + ConvValue);

        switch (ConvCode) {
            case 1:
                System.out.println("In Fahrenheit it will be - " + ((ConvValue + 32 * 5. / 9) / 5. / 9));
                break;
            case 2:
                System.out.println("In Celsius it will be - " + ((5. / 9) * ConvValue - 32 * 5. / 9));
                break;
            case 3:
                System.out.println("In Kelvin it will be - " + (ConvValue + 273.16));
                break;
            case 4:
                System.out.println("In Inches it will be - " + (39.37 * ConvValue));
                break;
            case 5:
                System.out.println("In Meters it will be - " + (ConvValue / 39.37));
                break;
            case 6:
                System.out.println("In Miles it will be - " + (ConvValue / 1.61));
                break;
            case 7:
                System.out.println("In Kilometers it will be - " + (ConvValue * 1.61));
                break;
            case 8:
                System.out.println("In Pounds it will be - " + (ConvValue * 2.2));
                break;
            case 9:
                System.out.println("In Kilograms it will be - " + (ConvValue / 2.2));
                break;
            case 10:
                System.out.println("In km/hr it will be - " + (ConvValue * 0.62));
                break;
            case 11:
                System.out.println("In mi/hr it will be - " + (ConvValue / 0.62));
                break;
            default:
                System.out.println("Check conversion code!!");
        }
    }
}
