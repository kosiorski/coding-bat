package map2;

import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        /*
        The classic word - count algorithm:
        given an array of strings,return a Map<String, Integer> with a key for each different string, with the value the number
        of times that string appears in the array.
        */

        String[] array = {"a", "b", "a", "c", "b"};

        Task4 task = new Task4();

        Map<String, Integer> map = task.wordCount(array);

        map.forEach((k, v) -> System.out.println(k + " " + v));


    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for (String str : strings) {

            if (result.containsKey(str)) {
                Integer integer = result.get(str);
                integer += 1;
                result.put(str, integer);

            } else {
                result.put(str, 1);
            }
        }

        return result;
    }
}
