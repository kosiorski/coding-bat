package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
  public static void main(String[] args) {

    /*
    Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.


    square56([3, 1, 4]) → [19, 11]
    square56([1]) → [11]
    square56([2]) → [14]
    */

    List<Integer> integers1 = square56(Arrays.asList(3, 1, 4));
    integers1.forEach(System.out::println);

    List<Integer> integers2 = square56(Arrays.asList(1));
    integers2.forEach(System.out::println);

    List<Integer> integers3 = square56(Arrays.asList(2));
    integers3.forEach(System.out::println);
  }

  public static List<Integer> square56(List<Integer> nums) {
    return nums.stream()
        .map(n -> n * n + 10)
        .filter(n -> n % 10 != 5 && n % 10 != 6)
        .collect(Collectors.toList());
  }
}
