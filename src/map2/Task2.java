package map2;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        /*
        Given an array of strings,return a Map<String, Integer> containing a key for every different string in the array, and
        the value is that string 's length.
        */

        String[] array = {"this", "and", "that", "and"};

        Task2 task = new Task2();

        Map<String, Integer> map = task.wordLen(array);

        map.forEach((k, v) -> System.out.println(k + " " + v));


    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for (String str : strings) {
            result.put(str, str.length());
        }

        return result;
    }
}
