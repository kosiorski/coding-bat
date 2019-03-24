package map2;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

        String[] array = {"man", "moon", "good", "night"};

        Task3 task = new Task3();

        Map<String, String> stringIntegerMap = task.pairs(array);

        stringIntegerMap.forEach((k, v) -> System.out.println(k + " " + v));


    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String str : strings) {
            result.put(String.valueOf(str.charAt(0)), String.valueOf(str.charAt(str.length() - 1)));
        }

        return result;
    }
}
