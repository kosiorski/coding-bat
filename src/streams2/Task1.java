package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {

        /*
        Given a list of integers, return a list of the integers, omitting any that are less than 0.


        noNeg([1, -2]) → [1]
        noNeg([-3, -3, 3, 3]) → [3, 3]
        noNeg([-1, -1, -1]) → []
         */

        List<Integer> integers1 = noNeg(Arrays.asList(1, -2));
        integers1.forEach(System.out::println);

        List<Integer> integers2 = noNeg(Arrays.asList(-3, -3, 3, 3));
        integers2.forEach(System.out::println);

        List<Integer> integers3 = noNeg(Arrays.asList(-1, -1, -1));
        integers3.forEach(System.out::println);


    }

    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());

    }
}
