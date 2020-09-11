package HomeWorks.HomeWork_6;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        String taskText = "Count the number of words of each length in some text. ";
        eachWordsCount(taskText);
        //System.out.println("Quantity of words is: "+wordsCount(taskText));

    }

    public static void eachWordsCount(String originalInputString) {
        originalInputString = originalInputString.replace(",", " ");
        originalInputString = originalInputString.replace(".", " ");
        String[] trim = originalInputString.trim().split("\\s+");
        int[] wordsLength = new int[trim.length];
        
        for (int i = 0; i < trim.length; i++) {
            wordsLength[i] = trim[i].length();
        }

        Arrays.sort(wordsLength);
        int[] count = new int[trim.length];
        for (int i = 0; i < trim.length; i++) {
            count[wordsLength[i]]++;
        }

        for (int i = 0; i < trim.length; i++) {
            if(count[i]>0)
                System.out.println(i + " Letter words: " + count[i]);
        }
    }
}
