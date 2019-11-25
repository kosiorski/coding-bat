package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
  public static void main(String[] args) {
    /*
    Given a list of strings, return a list of the strings, omitting any string length 4 or more.


    noLong(["this", "not", "too", "long"]) → ["not", "too"]
    noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
    noLong(["cccc", "cccc", "cccc"]) → []
    */

    List<String> strings1 = noLong(Arrays.asList("this", "not", "too", "long"));
    strings1.forEach(System.out::println);

    List<String> strings2 = noLong(Arrays.asList("a", "bbb", "cccc"));
    strings2.forEach(System.out::println);

    List<String> strings3 = noLong(Arrays.asList("cccc", "cccc", "cccc"));
    strings3.forEach(System.out::println);
  }

  public static List<String> noLong(List<String> strings) {
    return strings.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
  }
}
