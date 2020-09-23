package Infrastructure;

import java.util.Random;

public class RandomString {
    public String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public String nums = "0123456789";


    public String stringGenerator(String mode, int length) {
        StringBuilder result = new StringBuilder();
        Random rand = new Random();
        String tempString = "";

        if (mode.equals("alpha")) {
            tempString = alphabet;
        }
        else if (mode.equals("alphaNumeric")) {
            tempString = alphabet + nums;
        }
        else  if (mode.equals("numeric")) {
            tempString = nums;
        }

        StringBuilder build = new StringBuilder();
        for (int i = 0; i < length; i++) {
            build.append(tempString.charAt(rand.nextInt(tempString.length())));
        }

        return build.toString();
    }

}
