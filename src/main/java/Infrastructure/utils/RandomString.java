package Infrastructure.utils;

import java.util.Random;

public class RandomString {
    public enum StringUtils{
        ALPHABET ("abcdefghijklmnopqrstuvwxyz"),
        NUMS("0123456789"),
        ALPANUMERIC("abcdefghijklmnopqrstuvwxyz"+"0123456789");

        private final  String value;

        StringUtils(String value) {this.value = value;}
    }

    public String stringGenerator(RandomString.StringUtils mode, int length) {
        StringBuilder result = new StringBuilder();
        Random rand = new Random();
        String tempString = "";

        if (mode.equals(StringUtils.ALPHABET)) {
            tempString = StringUtils.ALPHABET.value;
        }
        else if (mode.equals(StringUtils.ALPANUMERIC)) {
            tempString = StringUtils.ALPHABET.value;
        }
        else  if (mode.equals(StringUtils.NUMS)) {
            tempString = StringUtils.NUMS.value;
        }

        StringBuilder build = new StringBuilder();
        for (int i = 0; i < length; i++) {
            build.append(tempString.charAt(rand.nextInt(tempString.length())));
        }

        return build.toString();
    }

}
