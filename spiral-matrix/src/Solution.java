import java.util.ArrayList;
import java.util.List;

/**
 * 定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 * 示例 1:
 * <p>
 * 输入:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * 输出: [1,2,3,6,9,8,7,4,5]
 * 走过一行  删除这一行
 *
 * @author hht
 * @date 2019/8/27 14:41
 */
public class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        //行
        int row = matrix.length;
        if (row == 0) return new ArrayList<>();
        //列
        int cls = matrix[0].length;
        int top = 0;
        int right = cls - 1;
        int bottom = row - 1;
        int left = 0;
        while (top <= bottom && left <= right) {

            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
                //j不变 i++
            }
            top++;
            if (top > bottom) break;
            for (int j = top; j <= bottom; j++) {
                result.add(matrix[j][right]);
                //j不变 i++
            }
            right--;
            if (left > right) break;
            for (int j = right; j >= left; j--) {
                result.add(matrix[bottom][j]);
            }
            bottom--;
            for (int j = bottom; j >= top; j--) {
                result.add(matrix[j][left]);
            }
            left++;
        }
        return result;
    }

    public static List<Integer> spiralOrder2(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;
        int rowNum = matrix.length;
        int colNum = matrix[0].length;
        int up = 0;
        int left = 0;
        int right = colNum - 1;
        int down = rowNum - 1;
        while (true) {
//——————————————————1.从左(left)至右(right)遍历第up行数据——————————————————————
            for (int col = left; col <= right; col++) {
                result.add(matrix[up][col]);
            }
            if (result.size() == colNum * rowNum) return result;
            up++;

//——————————————————2.从上(up)至下(down)遍历第right列数据——————————————————
            for (int row = up; row <= down; row++) {
                result.add(matrix[row][right]);
            }
            if (result.size() == colNum * rowNum) return result;
            right--;

//——————————————————3.从右(right)至左(left)遍历第down行数据——————————————————
            for (int col = right; col >= left; col--) {
                result.add(matrix[down][col]);
            }
            if (result.size() == colNum * rowNum) return result;
            down--;

//——————————————————4.从下(down)至上(up)遍历第left列数据——————————————————
            for (int row = down; row >= up; row--) {
                result.add(matrix[row][left]);
            }
            if (result.size() == colNum * rowNum) return result;
            left++;
        }
    }

    public static void main(String[] args) {
        int a[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {8, 9, 10, 11}};
        spiralOrder(a).forEach(System.out::print);
    }
}
