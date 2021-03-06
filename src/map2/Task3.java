package map2;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        /*
        Given an array of non - empty strings, create and return a Map<String, String> as follows:
        for each string add its first character as a key with its last character as the value.
        */

        String[] array = {"man", "moon", "good", "night"};

        Task3 task = new Task3();

        Map<String, String> map = task.pairs(array);

        map.forEach((k, v) -> System.out.println(k + " " + v));


    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            result.put(String.valueOf(str.charAt(0)), String.valueOf(str.charAt(str.length() - 1)));
        }

        return result;
    }
}
