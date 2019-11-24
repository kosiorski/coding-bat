package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 22, 93);

    }

    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(n -> n % 10).collect(Collectors.toList());
    }
}
