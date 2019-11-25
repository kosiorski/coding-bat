package streams2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
  public static void main(String[] args) {

    /*
    Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.


    noTeen([12, 13, 19, 20]) → [12, 20]
    noTeen([1, 14, 1]) → [1, 1]
    noTeen([15]) → []
    */

  }

  public List<Integer> noTeen(List<Integer> nums) {
    nums.removeIf(n -> n >= 13 && n <= 19);
    return nums;
  }
}
