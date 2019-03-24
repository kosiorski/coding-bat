package map2;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        String[] array = {"this", "and", "that", "and"};

        Task2 task1 = new Task2();

        Map<String, Integer> stringIntegerMap = task1.wordLen(array);

        stringIntegerMap.forEach((k, v) -> System.out.println(k + " " + v));


    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for (String str : strings) {
            result.put(str, str.length());
        }

        return result;
    }
}
