import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 */
public class Solution {
    public static void main(String[] args) {
        int a[] = {1, 1, 1,2};
        System.out.println(majorityElement(a));
    }

    public static int majorityElement(int[] nums) {
        int size = nums.length / 2;
        int res = nums[0];
        if (nums.length == 1) return res;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            if (map.containsKey(nums[i])) {
                count = map.get(nums[i]);
                if (count > size-1) return nums[i];
            }
            map.put(nums[i], ++count);
        }
        return res;
    }
}