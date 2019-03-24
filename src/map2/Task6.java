package map2;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        /*
        Loop over the given array of strings to build a result string like this:when a string appears the 2 nd, 4 th, 6
        th, etc.time in the array, append the string to the result.Return the empty string if no string appears a 2 nd time.
        wordAppend(["a", "b", "a"]) → "a"
        wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
        wordAppend(["a", "", "a"]) → "a"
        */

        String[] array = {"a", "b", "a", "c", "a", "d", "a"};

        Task6 task = new Task6();
        System.out.println(task.wordAppend(array));

    }

    public String wordAppend(String[] strings) {

        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String str : strings) {

            if (map.containsKey(str)) {
                int count = map.get(str);
                map.put(str, count + 1);

                if (map.get(str) % 2 == 0) {
                    result.append(str);
                }

            } else {
                map.put(str, 1);
            }
        }

        return result.toString();
    }
}
