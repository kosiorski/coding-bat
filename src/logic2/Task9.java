package logic2;

public class Task9 {

  public static void main(String[] args) {

    /*
    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.


    makeChocolate(4, 1, 9) → 4
    makeChocolate(4, 1, 10) → -1
    makeChocolate(4, 1, 7) → 2
    */

    System.out.println(makeChocolate(4, 1, 9));
    System.out.println(makeChocolate(4, 1, 10));
    System.out.println(makeChocolate(4, 1, 7));

    System.out.println(makeChocolate(6, 2, 7)); // 2
    System.out.println(makeChocolate(1, 2, 5)); // 0
  }

  public static int makeChocolate(int small, int big, int goal) {
    if (big * 5 + small < goal | small < goal % 5) return -1;
    if (big * 5 <= goal) return goal - big * 5;
    return goal % 5;
  }
}
