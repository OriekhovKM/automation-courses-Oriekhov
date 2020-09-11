package HomeWorks.HomeWork_6;

public class Task6 {
    public static void main(String[] args) {
        String password = " AX6BYU56UX6CV6BNT7NM";


        System.out.println(validating(password));

    }
    public static int validating (String password) {
        String numbers = password.replaceAll("\\D+", "");

        int code1 = Integer.parseInt(numbers)/10000;
        int code2 = Integer.parseInt(numbers)%10000/100;
        int code3 = Integer.parseInt(numbers)%100;
        int code = code1*code2*code3;
        return code;
    }
}
