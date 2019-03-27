package logic2;


public class Task3 {
    public static void main(String[] args) {
        /*
        Given 3 int values, a b c, return their sum.However,if one of the values is 13 then it does not count towards the sum
        and values to its right do not count.So for example,if b is 13, then both b and c do not count.
        luckySum(1, 2, 3) → 6
        luckySum(1, 2, 13) → 3
        luckySum(1, 13, 3) → 1
        */

        Task3 task = new Task3();
        System.out.println(task.luckySum(1, 13, 3));


    }

    public int luckySum(int a, int b, int c) {

        int[] array = {a, b, c};
        int result = 0;

        for (int number : array)
            if (number != 13) {
                result += number;
            } else {
                break;
            }
        return result;
    }
}
