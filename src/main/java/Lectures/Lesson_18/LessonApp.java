package Lectures.Lesson_18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LessonApp {
    public static void main(String[] args) {
        String text = "rsdrgdrgdgr srgdgrgr sg 12423";

        List<String> letterArr = Arrays.asList(text.split(""));
        Map<String, Integer> resultMap = new HashMap<>();
        for (String letter:letterArr) {
            if(resultMap.containsKey(letter)){
                resultMap.put(letter, resultMap.get(letter)+1);
            }else {
                resultMap.put(letter, 1);
            }
        }
        Arrays.asList(text.split("")).forEach(e->{resultMap.computeIfAbsent(e, b-> 1);
        resultMap.computeIfPresent(e, (a,b)-> b+1);
        });

    }

}
