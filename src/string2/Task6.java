package string2;

public class Task6 {
  public static void main(String[] args) {
    /*
    Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

    xyzThere("abcxyz") → true
    xyzThere("abc.xyz") → false
    xyzThere("xyz.abc") → true
    */

    //    System.out.println(xyzThere("abcxyz"));
    //    System.out.println(xyzThere("abc.xyz"));
    //    System.out.println(xyzThere("xyz.abc"));
  }

  public boolean xyzThere(String str) {

    for (int i = 0; i < str.length(); i++) {
      //
    }
    return (str.contains("xyz") && !str.contains(".xyz"));
  }
}
