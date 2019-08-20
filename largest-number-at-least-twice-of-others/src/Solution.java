/**
 * 在一个给定的数组nums中，总是存在一个最大元素 。
 * <p>
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 * <p>
 * 如果是，则返回最大元素的索引，否则返回-1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [3, 6, 1, 0]
 * 输出: 1
 * 解释: 6是最大的整数, 对于数组中的其他整数,
 * 6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.
 * <p>
 * 提示:
 * <p>
 * nums 的长度范围在[1, 50].
 * 每个 nums[i] 的整数范围在 [0, 99].
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author hht
 * @date 2019/8/20 16:18
 */
public class Solution {
    public static int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0;
        //一次循环找出最大的数和第二大的数
        int second = Integer.MIN_VALUE;
        //最大数下标
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                //保留当前已知最大数。并更新第二大的数的值
                second = nums[maxIndex];
                maxIndex = i;
                //一个数小于最大数，不一定小于第二大的数
            } else if (nums[i] > second) {

                second = nums[i];
            }
        }
        return nums[maxIndex] >= second * 2 ? maxIndex : -1;
    }

    public static void main(String[] args) {
        int nums[] = {-2,-5};
        System.out.println(dominantIndex(nums));
    }
}
