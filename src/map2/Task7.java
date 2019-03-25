package map2;

import java.util.HashMap;
import java.util.Map;

public class Task7 {
    public static void main(String[] args) {

        /*
        Given an array of strings,return a Map<String, Boolean> where each different string is a key and its value is true if
        that string appears 2 or more times in the array.

        wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
        wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
        wordMultiple(["c", "c", "c", "c"]) → {"c": true}
        */

        String[] array = {"a", "b", "a", "c", "b"};

        Task7 task = new Task7();

        Map<String, Boolean> map = task.wordMultiple(array);

        map.forEach((k, v) -> System.out.println(k + " " + v));


    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> result = new HashMap<>();

        for (String str : strings) {
            if (result.containsKey(str)) {
                result.put(str, true);

            } else {
                result.put(str, false);
            }
        }
        return result;
    }
}
