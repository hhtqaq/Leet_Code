import java.util.Arrays;

/**
 * 加一
 * <p>
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 示例 1:
 * <p>
 * 输入: [1,2,9]
 * 输出: [1,3,0]
 * 解释: 输入数组表示数字 129。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author hht
 * @date 2019/8/20 17:39
 */
public class Solution {
    public static int[] plusOne(int[] digits) {
        for (int i = (digits.length - 1); i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int res[] = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 9, 5, 4, 5, 5};
        for (int i : plusOne(a)) {
            System.out.println(i);
        }
    }
}
