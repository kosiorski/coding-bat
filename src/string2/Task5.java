package string2;

public class Task5 {
  public static void main(String[] args) {

    /*
    Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.


    endOther("Hiabc", "abc") → true
    endOther("AbC", "HiaBc") → true
    endOther("abc", "abXabc") → true
    */

//    System.out.println(endOther("Hiabc", "abc"));
//    System.out.println(endOther("AbC", "HiaBc"));
//    System.out.println(endOther("abc", "abXabc"));
//    System.out.println(endOther("Hiabcx", "bc"));
//    System.out.println(endOther("ab", "ab12"));
  }

  public  boolean endOther(String a, String b) {

    if (a.length() < b.length()) {

      return a.toLowerCase().equals(b.substring(b.length() - a.length()).toLowerCase());

    } else {
      return b.toLowerCase().equals(a.substring(a.length() - b.length()).toLowerCase());
    }
  }
}
