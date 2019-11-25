package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {
  public static void main(String[] args) {

    /*
    Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.

    two2([1, 2, 3]) → [4, 6]
    two2([2, 6, 11]) → [4]
    two2([0]) → [0]
    */

    List<Integer> integers1 = two2(Arrays.asList(1, 2, 3));
    integers1.forEach(System.out::println);

    List<Integer> integers2 = two2(Arrays.asList(2, 6, 11));
    integers2.forEach(System.out::println);

    List<Integer> integers3 = two2(Arrays.asList(0));
    integers3.forEach(System.out::println);
  }

  public static List<Integer> two2(List<Integer> nums) {
    return nums.stream().map(n -> n * 2).filter(n -> n % 10 != 2).collect(Collectors.toList());
  }
}
