package logic2;


public class Task7 {
    public static void main(String[] args) {
        /*
        Given 2 int values greater than 0,return whichever value is nearest to 21 without going over.
        Return 0 if they both go over.

        blackjack(19, 21) → 21
        blackjack(21, 19) → 21
b       lackjack(19, 22) → 19
        */

        Task7 task = new Task7();
        System.out.println(task.blackjack(19, 21));


    }

    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) return 0;
        return (a > 21) ? b : (b > 21) ? a : Math.max(a, b);
    }
}
