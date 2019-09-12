import java.util.Stack;

/**
 * 1051. 高度检查器
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 * <p>
 * 请你返回至少有多少个学生没有站在正确位置数量。该人数指的是：能让所有学生以 非递减 高度排列的必要移动人数。
 * <p>
 * <p>
 * 输入：[1,1,4,2,1,3]
 * 输出：3
 * 解释：
 * 高度为 4、3 和最后一个 1 的学生，没有站在正确的位置。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/height-checker
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 非递减 排序也就是升序排列，最直观的一种解法就是排序后对比计数每个位置的不同数量。
 * 但是涉及到比较排序，时间复杂度最低也有 O(NlogN)
 *
 * @author hht
 * @date 2019/9/6 17:30
 */
public class Solution {
    public static void main(String[] args) {
        int[] a = {2, 1, 2, 1, 1, 2, 2, 1};
        System.out.println(heightChecker(a));
    }

    public static int heightChecker(int[] heights) {
        if (heights.length <= 1)
            return 0;
        int a[] = new int[101];
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            a[heights[i]]++;
        }
        for (int i = 1, j = 0; i < a.length; i++) {
            while (a[i]-- > 0) {
                if (heights[j++] != i) count++;
            }
        }
        return count;
    }
}
