package logic2;


import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        /*
        Given three ints, a b c, one of them is small, one is medium and one is large.Return true if the three values arepl
        evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

        evenlySpaced(2, 4, 6) → true
        evenlySpaced(4, 6, 2) → true
        evenlySpaced(4, 6, 3) → false
        */


        Task8 task = new Task8();
        System.out.println(task.evenlySpaced(2, 4, 6));
        System.out.println(task.evenlySpaced(4, 6, 3));


    }

    public boolean evenlySpaced(int a, int b, int c) {
        int[] array = {a, b, c};
        Arrays.sort(array);

        return (array[1] - array[0] == array[2] - array[1]);
    }
}
