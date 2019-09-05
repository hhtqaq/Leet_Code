/**
 * 对角线遍历
 * <p>
 * 给定一个含有 M x N 个元素的矩阵（M 行，N 列），
 * 请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。
 * 示例:
 * <p>
 * 输入:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * <p>
 * 输出:  [1,2,4,7,5,3,6,8,9]
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/diagonal-traverse
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author hht
 * @date 2019/8/20 17:39
 */
public class Solution {
    public static int[] findDiagonalOrder(int[][] matrix) {
        int row = matrix.length;
        return new int[1];
    }

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i : findDiagonalOrder(a)) {
            System.out.println(i);
        }
    }
}
