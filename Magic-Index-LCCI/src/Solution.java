import java.util.HashMap;
import java.util.Map;

/**
 * nums = [0, 2, 3, 4, 5]
 *
 * @author hht
 * @date 2020/7/31 17:45
 */
public class Solution {
    public static int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; ) {
            if (nums[i] == i) {
                return i;
            } else {
                i = Math.max(nums[i], (i + 1));
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 5};
        System.out.println(findMagicIndex(nums));
    }
}
