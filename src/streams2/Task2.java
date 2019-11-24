package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {


        /*
        Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)


        no9([1, 2, 19]) → [1, 2]
        no9([9, 19, 29, 3]) → [3]
        no9([1, 2, 3]) → [1, 2, 3]
        */


        List<Integer> integers1 = no9(Arrays.asList(1, 2, 19));
        integers1.forEach(System.out::println);

        List<Integer> integers2 = no9(Arrays.asList(9, 19, 29, 3));
        integers2.forEach(System.out::println);

        List<Integer> integers3 = no9(Arrays.asList(1, 2, 3));
        integers3.forEach(System.out::println);

    }

    public static List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(n -> (n % 10) != 9).collect(Collectors.toList());
    }

}
