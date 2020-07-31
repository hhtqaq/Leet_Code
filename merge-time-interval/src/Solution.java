import java.util.Stack;

/**
 * @author hht
 * @date 2020/7/31 17:40
 */
public class Solution {

    /**
     * 合并时间区间
     *
     * @return
     */
    public static int[][] merge(int[][] intervals) {
        Stack<Integer> stack = new Stack<>();
        //find x min
        int temp = Integer.MIN_VALUE;
        for (int[] ints : intervals) {
            int x = ints[0];
            int y = ints[1];
            if (x <= temp) {
                stack.pop();
                stack.add(y);
            } else {
                stack.add(x);
                stack.add(y);
            }
            temp = y;
        }
        //因为每次都弹出两个  所以只需要循环一半次数  右移一位
        int size = stack.size() >> 1;
        int[][] result = new int[size][2];
        // 因为是栈  先进后出  倒序输出
        for (int i = size - 1; i >= 0; i--) {
            result[i][1] = stack.pop();
            result[i][0] = stack.pop();
        }
        return result;
    }
}
