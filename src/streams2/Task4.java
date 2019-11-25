package streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
  public static void main(String[] args) {

    /*
    Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)


    noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
    noZ(["hziz", "hzello", "hi"]) → ["hi"]
    noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
    */

    List<String> strings1 = noZ(Arrays.asList("aaa", "bbb", "aza"));
    strings1.forEach(System.out::println);

    List<String> strings2 = noZ(Arrays.asList("hziz", "hzello", "hi"));
    strings2.forEach(System.out::println);

    List<String> strings3 = noZ(Arrays.asList("hello", "howz", "are", "youz"));
    strings3.forEach(System.out::println);
  }

  public static List<String> noZ(List<String> strings) {
    return strings.stream().filter(s -> !s.contains("z")).collect(Collectors.toList());
  }
}
