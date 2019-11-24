package string2;

import java.util.regex.Pattern;

public class Task4 {
  public static void main(String[] args) {

    /*   Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

    countCode("aaacodebbb") → 1
    countCode("codexxcode") → 2
    countCode("cozexxcope") → 2
    */

    //    System.out.println(countCode("cozexxcope"));

  }

  public int countCode(String string) {
    int count = 0;
    final String co = "co";
    final String e = "e";

    for (int i = 0; i < string.length() - 3; i++) {

      if (string.substring(i, i + 2).equals(co) && string.substring(i + 3, i + 4).equals(e)) {

        count++;
      }
    }
    return count;
  }
}
