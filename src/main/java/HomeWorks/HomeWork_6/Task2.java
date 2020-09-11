package HomeWorks.HomeWork_6;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String taskText = "Count the single character frequencies";
        characterCount(taskText);
    }


        static void characterCount(String originalInputString) {
        String inputString = originalInputString.toLowerCase();

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

            char[] strArray = inputString.toCharArray();


            for (char c : strArray) {
                if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
                }
                else {
                    charCountMap.put(c, 1);
                }
            }
            System.out.println(originalInputString);
           for (Map.Entry entry : charCountMap.entrySet()) {

                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

