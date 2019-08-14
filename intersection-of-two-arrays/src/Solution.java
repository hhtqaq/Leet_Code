import java.util.*;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 说明:
 * <p>
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 *
 * @Auther: hht
 * @Date: 2019/8/14 21:34
 * @Description:
 */
public class Solution {
    /**
     * 第一个数组所有元素存入 hashset中 第二个数组再放入比较值
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return new int[0];
        HashSet<Integer> sets = new HashSet<>();
        HashSet set = new HashSet();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (!set.add(nums2[i]))
                sets.add(nums2[i]);
        }
        int a[] = new int[sets.size()];
        int k = 0;
        for (Integer s : sets) {
            a[k++] = s;
        }
        return a;
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int minLen = Math.min(nums1.length, nums2.length);
        int[] res = new int[minLen];

        for (int num : nums1) {
            set.add(num);
        }

        int k = 0;
        for (int num : nums2) {
            if (set.contains(num)) {
                res[k++] = num;
                set.remove(num);
            }
        }

        return Arrays.copyOf(res, k);
    }

    public static void main(String[] args) {
        int nums1[] = {1, 2, 2, 1};
        int nums2[] = {2, 2};
        for (int i : intersection(nums1, nums2)) {
            System.out.println(i);
        }
    }
}
