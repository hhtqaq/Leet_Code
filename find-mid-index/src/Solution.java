/**
 * 给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。
 * <p>
 * 我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
 * <p>
 * 如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。
 * 输入:
 * nums = [1, 7, 3, 6, 5, 6]
 * 输出: 3
 * 解释:
 * 索引3 (nums[3] = 6) 的左侧数之和(1 + 7 + 3 = 11)，与右侧数之和(5 + 6 = 11)相等。
 * 同时, 3 也是第一个符合要求的中心索引。
 *
 * @author hht
 * @date 2019/8/19 11:59
 */
public class Solution {
    public static int pivotIndex(int[] nums) {
        //依次遍历每一个数的左右两边
        for (int i = 0; i < nums.length; i++) {
            int[] start = subArray(nums, 0, i - 1);
            int[] end = subArray(nums, i + 1, nums.length - 1);
            if (sum(start) == sum(end))
                return i;
        }
        return -1;
    }

    //截取数组
    public static int[] subArray(int[] nums, int start, int end) {
        int length = end - start + 1;
        if (end < start) return null;
        int newNums[] = new int[length];
        for (int i = 0; start <= end; i++, start++) {
            newNums[i] = nums[start];
        }
        return newNums;
    }

    //求和
    public static int sum(int[] nums) {
        if (nums == null) return 0;
        if (nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    /**
     * 暴力 傻瓜式解法 虽然结果正确  但是超时不能通过
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {-1, -1, 0, 1, 1, 0};
        System.out.println(pivotIndex(nums));
    }
}
