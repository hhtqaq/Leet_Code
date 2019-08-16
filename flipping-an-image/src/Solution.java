/**
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * <p>
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * <p>
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [[1,1,0],[1,0,1],[0,0,0]]
 * 输出: [[1,0,0],[0,1,0],[1,1,1]]
 * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 * 然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 * <p>
 * 说明:
 * <p>
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/flipping-an-image
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author hht
 * @date 2019/8/16 14:08
 */
public class Solution {
    //直接法
    public static int[][] flipAndInvertImage(int[][] A) {
        int length = 0, temp = 0;
        for (int i = 0; i < A.length; i++) {
            length = A[i].length;
            for (int j = 0; j < length; j++) {
                //翻转
                if (j < length / 2) {
                    temp = A[i][length - j - 1];
                    A[i][length - j - 1] = A[i][j];
                    A[i][j] = temp;
                }
                //先换值  // A[i][j] = A[i][j] ^ 1;
                A[i][j] = A[i][j] == 0 ? 1 : 0;
            }
        }
        return A;
    }

    public static int[][] flipAndInvertImage2(int[][] A) {
        int length = 0, temp = 0;
        for (int i = 0; i < A.length; i++) {
            length = A[i].length;
            for (int j = 0; j < length; j++) {
                //翻转
                if (j < length / 2) {
                    temp = A[i][length - j - 1];
                    A[i][length - j - 1] = A[i][j];
                    A[i][j] = temp;
                }
                //异或运算 同0则1
                A[i][j] = A[i][j] ^ 1;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int a[][] = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        for (int[] ints : flipAndInvertImage2(a)) {
            for (int anInt : ints) {
                System.out.print(anInt + ",");
            }
            System.out.println();
        }
    }
}
