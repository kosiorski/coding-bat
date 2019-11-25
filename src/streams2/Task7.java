package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
  public static void main(String[] args) {

    /*
    Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.

    noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
    noYY(["a", "b", "cy"]) → ["ay", "by"]
    noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
    */

    List<String> strings1 = noYY(Arrays.asList("a", "b", "c"));
    strings1.forEach(System.out::println);

    List<String> strings2 = noYY(Arrays.asList("a", "b", "cy"));
    strings2.forEach(System.out::println);

    List<String> strings3 = noYY(Arrays.asList("xx", "ya", "zz"));
    strings3.forEach(System.out::println);
  }

  public static List<String> noYY(List<String> strings) {
    return strings.stream()
        .map(n -> n + "y")
        .filter(n -> !n.contains("yy"))
        .collect(Collectors.toList());
  }
}
