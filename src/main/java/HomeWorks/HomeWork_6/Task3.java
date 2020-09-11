package HomeWorks.HomeWork_6;

public class Task3 {
    public static void main(String[] args) {
        String taskText = "Count the single character frequencies";
        wordsCount(taskText);
        System.out.println("Quantity of words is: "+wordsCount(taskText));

    }

   public static int wordsCount(String originalInputString) {
        String trim = originalInputString.trim();
        if (trim.isEmpty())
            return 0;
        return trim.split("\\s+").length;
    }
}
