package map2;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        /*
        Given an array of non - empty strings,return a Map<String, String> with a key for every different first character
        seen, with the value of all the strings starting with that character appended together in the order they appear in
        the array.
        */

        String[] array = {"aa", "bb", "cc", "aAA", "cCC", "d"};

        Task5 task = new Task5();

        Map<String, String> map = task.firstChar(array);

        map.forEach((k, v) -> System.out.println(k + " " + v));


    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String str : strings) {

            String key = String.valueOf(str.charAt(0));

            if (result.containsKey(key)) {
                String value = result.get(key);
                result.put(key, value + str);

            } else {
                result.put(key, str);
            }
        }
        return result;
    }
}
