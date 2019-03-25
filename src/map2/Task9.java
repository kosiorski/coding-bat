package map2;

import java.util.HashMap;
import java.util.Map;

public class Task9 {
    public static void main(String[] args) {


        /*
        We'll say that 2 strings "match" if they are non - empty and their first chars are the same.Loop over and then return the
        given array of non -empty strings as follows:
        if a string matches an earlier string in the array, swap the 2 strings in the array.A particular first char can only cause
        1 swap, so once a char has caused a swap, its later swaps are disabled.Using a map, this can be solved making just one
        pass over the array.More difficult than it looks.

        firstSwap(["ab", "ac"]) → ["ac", "ab"]
        firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
        firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
        */


        String[] array = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};

        Task9 task = new Task9();

        String[] result = task.firstSwap(array);

        for (String s : result) {
            System.out.println(s);
        }
    }

    public String[] firstSwap(String[] strings) {

        Map<String, Integer> map = new HashMap<>();
        String[] result = new String[strings.length];
        int index = 0;

        for (String str : strings) {

            String firstChar = String.valueOf(str.charAt(0));

            if (map.containsKey(firstChar)) {

                if (map.get(firstChar) == null) {
                    result[index] = strings[index];
                } else {
                    Integer indexToSwap = map.get(firstChar);
                    String stringToSwap = result[indexToSwap];

                    result[indexToSwap] = str;
                    result[index] = stringToSwap;

                    map.put(firstChar, null);
                }

            } else {
                map.put(firstChar, index);
                result[index] = strings[index];
            }

            index++;
        }
        return result;
    }
}
