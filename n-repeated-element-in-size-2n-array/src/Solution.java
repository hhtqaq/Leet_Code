import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 * <p>
 * 返回重复了 N 次的那个元素。
 * 示例 1：
 * <p>
 * 输入：[1,2,3,3]
 * 输出：3
 * 提示：
 * <p>
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length 为偶数
 *
 * @author hht
 * @date 2019/8/14 16:03
 */
public class Solution {
    public static int repeatedNTimes(int[] A) {
        //计算除以2得到n
        int n = A.length >> 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            Integer count = map.get(A[i]);
            count = count == null ? 0 : count;
            map.put(A[i], ++count);
            if (count == n) return A[i];
        }
        return 0;
    }

    public static int repeatedNTimes3(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (map.put(A[i], 1)!=null) return A[i];
        }
        return 0;
    }

    /**
     * 由已知可得，一共 2N 个元素，含有 N + 1 种不同的元素，
     * 并且有一种元素出现 N 次，所以剩下的元素只会出现一次，即找到出现不只一次的元素即为目标元素
     *
     * @param A
     * @return
     */
    public static int repeatedNTimes2(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (!set.add(A[i])) return A[i];
            //  else set.add(A[i]);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3};
        System.out.println(repeatedNTimes3(a));
    }
}
