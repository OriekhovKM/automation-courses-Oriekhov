package HomeWorks.HomeWork_7;

public class FractionNumberApp {
    public static void main(String[] args) {
        FractionNumbers number1 = new FractionNumbers(1, 2);
        FractionNumbers number2 = new FractionNumbers(1, 4);
//        System.out.println(number1);
//        System.out.println(number2);

        FractionNumbers plusResult = number1.plus(number2);
        System.out.println(plusResult);

        FractionNumbers minusResult = number1.minus(number2);
        System.out.println(minusResult);

        FractionNumbers multiplyResult = number1.multiply(number2);
        System.out.println(multiplyResult);

        FractionNumbers deriveResult = number1.derive(number2);
        System.out.println(deriveResult);
    }
}
