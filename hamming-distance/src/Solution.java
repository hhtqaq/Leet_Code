/**
 * 461. 汉明距离
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * <p>
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * 注意：
 * 0 ≤ x, y < 231.
 * 输入: x = 1, y = 4
 * <p>
 * 输出: 2
 * <p>
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑  ↑
 * <p>
 * 上面的箭头指出了对应二进制位不同的位置。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/hamming-distance
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author hht
 * @date 2019/9/6 11:15
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    //return Integer.bitCount(x^y);
    public static int hammingDistance(int x, int y) {
        int key = x ^ y;
        String bs = Integer.toBinaryString(key);
        int res = 0;
        for (int i = 0; i < bs.length(); i++) {
            if (bs.charAt(i) == '1') res++;
        }
        return res;
    }
}
