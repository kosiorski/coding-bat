package map2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task8 {
    public static void main(String[] args) {

        /*
        We'll say that 2 strings "match" if they are non - empty and their first chars are the same.Loop over and then return the
        given array of non -empty strings as follows:
        if a string matches an earlier string in the array, swap the 2 strings in the array.When a position in the array has been
        swapped, it no longer matches anything.Using a map, this can be solved making just one pass over the array.More difficult
        than it looks.

        allSwap(["ab", "ac"]) → ["ac", "ab"]
        allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
        allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
        */


        String[] array = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};

        Task8 task = new Task8();

        String[] result = task.allSwap(array);

        for (String s : result) {
            System.out.println(s);
        }
    }

    public String[] allSwap(String[] strings) {

        Map<String, Integer> map = new HashMap<>();
        String[] result = new String[strings.length];
        int index = 0;

        for (String str : strings) {

            String firstChar = String.valueOf(str.charAt(0));

            if (map.containsKey(firstChar)) {

                Integer indexToSwap = map.get(firstChar);
                String stringToSwap = result[indexToSwap];

                result[indexToSwap] = str;
                result[index] = stringToSwap;

                map.remove(firstChar);

            } else {
                map.put(firstChar, index);
                result[index] = strings[index];
            }

            index++;
        }
        return result;
    }
}
