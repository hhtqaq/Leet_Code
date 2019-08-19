/**
 * 中心索引
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
public class Solution2 {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        //求数组和
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        //依次遍历每一个数的左右两边
        int subSum = 0;
        for (int i = 0; i < nums.length; i++) {
            //左边的和
            //我之前写的 //左边的和
            //            int subSum = 0;
            //            for (int j = 0; j < i; j++) {
            //                subSum += nums[j];
            //            }
            //            if (subSum *2 + nums[i] == sum) return i;  时间复杂度高了很多 173ms O(n2)
            //现在 这种方式 O(n)  4ms
            if (subSum * 2 + nums[i] == sum) return i;
            else subSum += nums[i];

        }
        return -1;
    }


    /**
     * 数组的和= 左边的数<<1+目标值
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {-1, -1, 0, 1, 1, 0};
        System.out.println(pivotIndex(nums));
    }
}
