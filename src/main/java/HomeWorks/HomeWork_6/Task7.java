package HomeWorks.HomeWork_6;

public class Task7 {
    public static void main(String[] args) {
        String text = "quality";
        lettersTurn(text);
    }
    public static void lettersTurn (String text) {
        char[] letters = text.toCharArray();
        char tempLetter;
        System.out.println(text);

        for (int i = 0; i < letters.length-1; i++) {
            tempLetter = letters[letters.length-1];
            letters[letters.length-1] = letters[0];
            for (int l = 1; l < letters.length-1; l++) {
                letters[l-1] = letters [l];
            }
            letters[letters.length-2] = tempLetter;
            System.out.println(letters);
        }


    }
}
