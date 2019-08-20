import java.util.Arrays;

/**
 * @author hht
 * @date 2019/8/20 17:39
 */
public class Solution {
    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        if (digits[digits.length - 1]++ == 10) {
            int[] ints = Arrays.copyOf(digits, digits.length + 1);
        }
        return digits;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 9};
        for (int i : plusOne(a)) {
            System.out.println(i);
        }
    }
}
