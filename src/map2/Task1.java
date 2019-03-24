package map2;

import java.util.HashMap;
import java.util.Map;


public class Task1 {
    public static void main(String[] args) {
        /*
        Given an array of strings,return a Map<String, Integer> containing a key for every different string in the array, always
        with the value 0. For example the string "hello" makes the pair "hello":0. We'll
        do more complicated counting later, but for this problem the value is simply 0.
        */

        String[] array = {"a", "b", "a", "c", "b"};

        Task1 task = new Task1();

        Map<String, Integer> map = task.word0(array);

        map.forEach((k, v) -> System.out.println(k + " " + v));

    }

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>();

        for (String string : strings) {
            result.put(string, 0);
        }

        return result;
    }
}
