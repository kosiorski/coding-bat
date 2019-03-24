package map2;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {

        String[] array = {"aa", "bb", "cc", "aAA", "cCC", "d"};

        Task5 task = new Task5();

        Map<String, String> stringIntegerMap = task.firstChar(array);

        stringIntegerMap.forEach((k, v) -> System.out.println(k + " " + v));


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
