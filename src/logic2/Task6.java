package logic2;


public class Task6 {
    public static void main(String[] args) {

        /*
        Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),while the other is
        "far", differing from both other values by 2 or more.Note:
        Math.abs(num) computes the absolute value of a number.

        closeFar(1, 2, 10) → true
        closeFar(1, 2, 3) → false
        closeFar(4, 1, 3) → true
        */

        Task6 task = new Task6();
        System.out.println(task.closeFar(1, 2, 10));
        System.out.println(task.closeFar(1, 2, 3));
        System.out.println(task.closeFar(4, 1, 3));


    }

    public boolean closeFar(int a, int b, int c) {
        return !close(b, c) & (close(a, b) ^ close(a, c));
    }

    public boolean close(int a, int b) {
        return Math.abs(a - b) <= 1;
    }

}
