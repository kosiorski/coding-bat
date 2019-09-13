package string2;

public class Task7 {
  public static void main(String[] args) {
    /*
    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

    bobThere("abcbob") → true
    bobThere("b9b") → true
    bobThere("bac") → false
    */

    //    System.out.println(bobThere("abcbob"));
    //    System.out.println(bobThere("b9b"));
    //    System.out.println(bobThere("bac"));
  }

  public /*static*/ boolean bobThere(String str) {
    return str.matches(".*b.b.*");
  }
}
