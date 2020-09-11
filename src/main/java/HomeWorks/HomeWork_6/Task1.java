package HomeWorks.HomeWork_6;

public class Task1 {

    public static void main(String[] args) {
        int mode = 2;
        String text = "Change given text into alL upPer cAse or lower case or change the first letter of each word\n" +
                " (or sentence) to upper and the rest to lower, etc.";
        System.out.println(changeText(mode, text));

    }

    public static String changeText(int mode, String text) { //1- to upper case; 2 - to lower case; 3 - first letter to upper case.
        String newText;
        if (mode == 1) {
            newText  = text.toUpperCase();
            return newText;
        } else if (mode == 2) {
            newText = text.toLowerCase();
            return newText;
        } else if (mode == 3) {
            char[] chars = text.toCharArray();

            chars[0] = Character.toUpperCase(chars[0]);
            for (int i = 0; i < chars.length - 1; i++) {
                if (chars[i] == ' ') {
                    chars[i + 1] = Character.toUpperCase(chars[i + 1]);
                } else chars[i + 1] = Character.toLowerCase(chars[i + 1]);
            }
            newText = new String(chars);
            return newText;
        }else if (mode < 1 || mode > 3) return newText = "Check mode";
        else return text;

    }

}
