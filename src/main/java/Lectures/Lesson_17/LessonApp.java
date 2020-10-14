package Lectures.Lesson_17;

import Infrastructure.data.FileDataMapper;
import Infrastructure.data.User;

import java.util.*;

public class LessonApp {
    public static void main(String[] args) {
        FileDataMapper mapper = new FileDataMapper();
        User[] users = mapper.getAll();

        List<User> users1 = Arrays.asList(users);
//        users1.add(new User("q", "q", "q", "q"));
//
//        User user = new User("q", "q", "q", "q");
//        boolean b = users1.addAll(Arrays.asList(user));

        List<Integer> testList = new ArrayList<>();
        ArrayList<String> testList1 = new ArrayList<>();
        Collection<String> testList2 = new ArrayList<>();

       // testList.add("");
       // testList.remove("rrr");

        Random r = new Random();
        r.nextInt(100);
        for (int i = 0; i < 100; i++) {
                testList.add(r.nextInt(100));
        }


        for (Integer el:testList){
            if(el<=50){
                el = 0;
            }
        }

        Integer sum = 0;

        for (Integer el:testList){
            sum = sum + el;
        }
        System.out.println(sum);
    }

}
