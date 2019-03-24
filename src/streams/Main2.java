package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
  public static void main(String[] args) {

    List<String> list = Arrays.asList("KitteN", "ChocolaTE");
  }

  public List<String> lower(List<String> strings) {
    return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
  }
}
