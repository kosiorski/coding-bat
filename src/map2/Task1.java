package map2;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        String[] array = {"a", "b", "a", "c", "b"};

        Task1 task = new Task1();

        Map<String, Integer> stringIntegerMap = task.word0(array);

        stringIntegerMap.forEach((k, v) -> System.out.println(k + " " + v));


    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for (String string : strings) {
            result.put(string, 0);
        }

        return result;
    }
}
