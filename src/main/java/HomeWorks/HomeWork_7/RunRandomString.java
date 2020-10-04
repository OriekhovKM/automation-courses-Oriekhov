package HomeWorks.HomeWork_7;

import Infrastructure.utils.RandomString;

public class RunRandomString {
    public static void main(String[] args) {
        RandomString stringGen = new RandomString();
        System.out.println(stringGen.stringGenerator("alphaNumeric", 33));
    }
}
