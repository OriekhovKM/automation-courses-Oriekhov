package HomeWorks.HomeWork_6;

public class Task5 {
    public static void main(String[] args) {
        String taskText = "Given a phrase and a letter (or series of letters) remove all occurrences of thaabct letter(s) in the phrase. ";
        letterRemoval(taskText, "Gat");

    }

    public static void letterRemoval (String text, String letters) {
        char[] letArray = letters.toCharArray();
        for (int i = 0; i < letArray.length; i++) {
            String letter = Character.toString(letArray [i]);
            text = text.replace(letter, "");
        }

        System.out.println(text);
    }
}
