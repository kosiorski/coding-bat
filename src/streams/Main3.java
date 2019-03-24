package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
  public static void main(String[] args) {

    List<String> list = Arrays.asList("xxax", "xbxbx", "xxcx");
  }

  public List<String> noX(List<String> strings) {

    return strings.stream().map(s -> s.replace("x", "")).collect(Collectors.toList());
  }
}
